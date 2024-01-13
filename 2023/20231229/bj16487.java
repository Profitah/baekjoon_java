// 55점
// 방법 1
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    // Scanner 객체 생성
    Scanner sc = new Scanner(System.in);

    // 각 변수에 입력값 저장
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int m = sc.nextInt();

        // 분자 계산
        double numerator = c * c * m + a * a * (b - m);
        // 분모 계산
        double denominator = b;

        // 결과 계산
        double result = numerator / denominator - m * (b - m);
        // 소수점 10자리까지 출력
        System.out.printf("%.10f%n", result);

    }
}



//방법 2
import java.math.BigDecimal;
import java.util.Scanner;

// BigDecimal을 상속받은 BD 클래스 정의
class BD extends BigDecimal {
    public BD(String val) {
        super(val);
    }

    public BD(double val) {
        super(val);
    }
}

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 입력값 저장을 위한 변수 선언
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();

        // 계산에 사용되는 변수 n 초기화
        int n = b - m;

        // BD 클래스를 이용하여 계산 결과를 저장
        BD result = new BD(((c * c * m + a * a * n) * 1.0 / b * 1.0) - m * n * 1.0);
        // 소수점 10자리까지 출력
        System.out.println(result.setScale(10, BigDecimal.ROUND_HALF_UP));
    }
}


