import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException { // 예외처리 하지 않음
 

        // BufferedReader를 통해 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값으로 정수를 받아옴
        int n = Integer.parseInt(br.readLine());

        // 1946을 뺀 값을 출력
        System.out.print(n - 1946);
    }
}
