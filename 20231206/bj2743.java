import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;  

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 입력받기
        String eng_word = br.readLine();

        // 사용자로부터 입력받은 문자열의 개수 세기
         System.out.println(eng_word.length());

	}
}