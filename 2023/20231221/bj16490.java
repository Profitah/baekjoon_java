import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int t = sc.nextInt();
        
        int result = (int) (Math.pow(a, 2) - Math.pow(t, 2));
        System.out.println(result);
    }
}
