import java.util.Scanner;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int moveCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 첫 번째 장대에 쌓인 원판의 개수 N
        hanoi(n, 1, 2, 3);
        System.out.println(moveCount); // 옮긴 횟수 K 출력
        System.out.println(sb.toString());
        scanner.close();
    }

    // 1 -> 3으로 n개를 옮김.
    public static void hanoi(int n, int start, int mid, int to) {
        // 이동할 원판의 수가 1개일 때(탈출 조건)
        if (n == 1) {
            sb.append(start + " " + to + "\n");
            moveCount++;
            return;
        }

        // 1 -> 2로 n-1개를 옮김.
        // 위의 1번 과정
        hanoi(n - 1, start, to, mid);

        // 가장 큰 원판을 목적 지점으로 옮김
        // 위의 2번 과정
        sb.append(start + " " + to + "\n");
        moveCount++;

        // 2 -> 3으로 n-1개를 옮김.
        // 위의 3번 과정
        hanoi(n - 1, mid, start, to);
    }
}
