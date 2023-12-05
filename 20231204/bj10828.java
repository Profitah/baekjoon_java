// a. 솔직히 말도 안된다고 생각함. 시간초과라고 이게??
import java.util.Scanner;
import java.util.Stack;

//public으로 클래스 선언
public class Main {
    public static void main(String[] args) {
        // 스캐너를 sc 란 이름으로 사용하겠음
        Scanner sc = new Scanner(System.in);

        // 스택 생성
        Stack<Integer> stack = new Stack<>();

        // 사용자로부터 정수 N을 입력받음
        int N = sc.nextInt();

        // 입력받은 N 횟수 만큼 코드 반복
        for (int i = 0; i < N; i++) {
            // 문자 명령어 입력
            String str = sc.next();

            switch (str) {
                case "push": // push 입력시 정수 x를 스택에 추가
                    int X = sc.nextInt();
                    stack.push(X);
                    break;
                case "pop":
                    if (stack.isEmpty()) {  // pop 명령어일 경우 스택에서 가장 위에 있는 정수를 빼고 출력
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":  // size 명령어일 경우 스택에 들어있는 정수의 개수 출력
                    System.out.println(stack.size());
                    break;
                case "empty":// empty 명령어일 경우 스택이 비어있으면 1, 아니면 0 출력
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top": // top 명령어일 경우 스택
                    if (stack.isEmpty()) { //스택이 비어있으면 -1 출력
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek()); //비어 있는 것이 아니면 최근에 스택에 추가된 숫자 반환
                    }
                    break; // 종료
            }
        }

        // 스캐너 닫기
        sc.close();
    }
}

//b. scanner 대신 bufferedreader를 사용함
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//public으로 클래스 선언. 사실 뤼튼이 도와줬다. 좀 더 공부해야 할 듯...
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 스택 생성
        Stack<Integer> stack = new Stack<>();

        // 사용자로부터 정수 N을 입력받음
        int N = Integer.parseInt(br.readLine());

        // 입력받은 N 횟수 만큼 코드 반복
        for (int i = 0; i < N; i++) {
            // 문자 명령어 입력
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push": // push 입력시 정수 x를 스택에 추가
                    int X = Integer.parseInt(command[1]);
                    stack.push(X);
                    break;
                case "pop":
                    if (stack.isEmpty()) {  // pop 명령어일 경우 스택에서 가장 위에 있는 정수를 빼고 출력
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":  // size 명령어일 경우 스택에 들어있는 정수의 개수 출력
                    System.out.println(stack.size());
                    break;
                case "empty":// empty 명령어일 경우 스택이 비어있으면 1, 아니면 0 출력
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top": // top 명령어일 경우 스택
                    if (stack.isEmpty()) { //스택이 비어있으면 -1 출력
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek()); //비어 있는 것이 아니면 최근에 스택에 추가된 숫자 반환
                    }
                    break; // 종료
            }
        }

        // BufferedReader 닫기
        br.close();
    }
}
