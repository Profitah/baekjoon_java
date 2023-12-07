import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { //솔직히 더 공부해야함.
	
	public static void main(String[] args) throws IOException {
		// BufferedReader를 사용하여 입력값을 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열의 길이 N을 입력받음
		int N = Integer.parseInt(br.readLine());
		
		// 문자열 S를 입력받음
		String S = br.readLine();
		
		// 해시값을 저장할 변수 result 초기화
		long result = 0;
		
		// 거듭제곱을 저장할 변수 pow 초기화
		long pow = 1;
		
		// 각 문자의 해시값을 계산하여 result에 더하고, pow를 갱신
		for(int i = 0; i < N; i++) {
			result += ((S.charAt(i) - 96) * pow); // 각 문자의 해시값을 더함
			pow = (pow * 31) % 1234567891; // pow를 갱신
		}
		
		// 최종 해시값을 1234567891로 나눈 나머지를 출력
		System.out.println(result % 1234567891);
	}
}
