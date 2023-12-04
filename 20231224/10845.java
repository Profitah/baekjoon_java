//뤼튼의 도움을 받은 버전
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main //모든 파일명을 Main이라고 할 순 없잖소... 대충 파일명 바꾸면 맞으니까 넘어가주기 {

    public static void main(String args[]) throws IOException {
        // 입력을 받기 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정수를 저장하는 큐 생성
        Queue<Integer> queue = new LinkedList<>();

        // 명령어의 개수 N 입력
        int N = Integer.parseInt(br.readLine());

        // N번의 명령어 처리
        for (int i = 0; i < N; i++) {
            // 한 줄을 읽고 공백을 기준으로 명령어와 값으로 나눔
            String[] command = br.readLine().split(" ");

            // 명령어에 따라 처리
            switch (command[0]) {
                case "push":
                    // push 명령어일 경우 큐에 값을 추가
                    int X = Integer.parseInt(command[1]);
                    queue.offer(X);
                    break;
                case "pop":
                    // pop 명령어일 경우 큐에서 값을 꺼내 출력
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;
                case "size":
                    // size 명령어일 경우 큐의 크기를 출력
                    System.out.println(queue.size());
                    break;
                case "empty":
                    // empty 명령어일 경우 큐가 비어있는지 여부를 출력
                    System.out.println(queue.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    // front 명령어일 경우 큐의 가장 앞에 있는 값을 출력
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;
                case "back":
                    // back 명령어일 경우 큐의 가장 뒤에 있는 값을 출력
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        // 큐의 마지막 값을 출력하기 위해 큐 전체를 순회
                        int backValue = 0;
                        for (int value : queue) {
                            backValue = value;
                        }
                        System.out.println(backValue);
                    }
                    break;
            }
        }
    }
}
