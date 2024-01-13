import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(7);
        } else if (n == 3) {
            System.out.println(2);
        } else if (n == 4) {
            System.out.println(3);
        }
    }
}
