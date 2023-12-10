import java.io.*;

public class Main {

    // 재귀 함수로 팩토리얼을 계산하는 메서드
    public static int result(int N) {
        // N이 0이거나 1일 때, 1을 반환
        if (N <= 1)
            return 1;
        // N! = N * (N-1)!
        return N * result(N - 1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사용자로부터 입력 받은 정수 N
        int n = Integer.parseInt(br.readLine());

        // 결과값을 계산하고 출력
        int printResult = result(n);
        System.out.println(printResult);
    }
}
