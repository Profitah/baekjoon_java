import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<int[]> steps; // 하노이 탑의 이동 과정을 저장할 ArrayList

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 하노이 탑의 층 수 입력

        steps = new ArrayList<int[]>(); // 이동 과정을 저장할 ArrayList 초기화

        // 이동 횟수를 계산하여 출력
        BigInteger count = new BigInteger("2");
        System.out.println(count.pow(n).subtract(new BigInteger("1")));

        if (n <= 20) { // 층 수가 20 이하일 경우에만 이동 과정을 출력
            hanoi(n, 1, 3, 2); // 하노이 탑 이동 과정 계산 메소드 호출

            // 이동 과정 출력
            for (int i = 0; i < steps.size(); i++) {
                int[] step = steps.get(i);
                System.out.println(step[0] + " " + step[1]);
            }
        }
    }

    // 하노이 탑 이동 과정을 계산하는 메서드
    private static void hanoi(int n, int from, int to, int via) {
        if (n == 1) { // 하나의 원판만 남았으면 해당 원판을 목적지로 이동
            steps.add(new int[]{from, to});
        } else {
            // 1. N-1개의 원판을 경유지로 이동
            hanoi(n - 1, from, via, to);
            steps.add(new int[]{from, to}); // 남은 하나의 원판을 목적지로 이동
            // 2. N-1개의 원판을 목적지로 이동
            hanoi(n - 1, via, to, from);
        }
    }
}
