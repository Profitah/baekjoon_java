import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너를 이용해 입력 받기
        Scanner in = new Scanner(System.in);

        // 배열 크기 입력 받기
        int n = in.nextInt();
        
        // double 형식의 배열 생성
        double[] arr = new double[n];

        // 배열 요소 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextDouble();
        }

        // 스캐너 닫기
        in.close();

        // 배열 정렬
        Arrays.sort(arr);

        // 배열 요소의 합 구하기
        double sum = Arrays.stream(arr).sum();

        // 배열에서 최댓값 구하기
        double max = arr[arr.length - 1];

        // 결과 출력
        System.out.print((sum / max / n) * 100);
    }
}
