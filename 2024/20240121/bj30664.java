import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            String i = s.nextLine();
            if (i.equals("0")) {
                break;
            }

            try {
                BigInteger n = new BigInteger(i);

                if (n.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)) {
                    System.out.println("PREMIADO");
                } else {
                    System.out.println("TENTE NOVAMENTE");
                }
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자가 아닙니다. 다시 입력해주세요.");
            }
        }
    }
}
