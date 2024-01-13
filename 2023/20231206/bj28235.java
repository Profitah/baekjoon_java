import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 입력받기
        String x = br.readLine();

        // 조건문을 이용한 풀이
        if (x.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (x.equals("CODE")) {
            System.out.println("MASTER");
        } else if (x.equals("2023")) {
            System.out.println("0611");
        } else if (x.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        } else {
            System.out.println("처리할 수 없는 문장입니다. 다시 입력해주세요");
        }
    }
}
