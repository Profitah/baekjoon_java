import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // N, M 값 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // 정답을 저장할 변수 초기화
        int ans = 0;

        // N번 반복
        for (int i = 0; i < N; i++) {
            // 'O'와 'X'로 이루어진 문자열 입력
            String s = scanner.next();
            
            // 'O'의 개수를 세기 위한 변수 초기화
            int cnt = 0;
            
            // 문자열을 문자 단위로 순회
            for (char c : s.toCharArray()) {
                // 'O'인 경우 cnt 증가
                if (c == 'O') {
                    cnt++;
                }
            }
            
            // 'O'의 개수가 M/2보다 크면 ans 증가
            if (cnt > M / 2) {
                ans++;
            }
        }

        // 결과 출력
        System.out.println(ans);
    }
}
