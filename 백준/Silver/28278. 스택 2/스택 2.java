import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // 명령어 처리
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");// 첫 번째 입력값: 명령어
            int command = Integer.parseInt(input[0]);



            if (command == 1) {
                int value = Integer.parseInt(input[1]);
                stack.push(value);         // 값 푸시
            } else if (command == 2) {
                if (stack.isEmpty()) {
                    sb.append("-1\n");  // 비었으면 -1 출력
                } else {
                    //메서드 실행 후 다음 메서드 실행
                    sb.append(stack.pop()).append("\n");  // 스택에서 pop
                }
            } else if (command == 3) {
                sb.append(stack.size()).append("\n");  // 스택의 크기 출력
            } else if (command == 4) {
                if (stack.isEmpty()) {
                    sb.append("1\n");  // 비었으면 1 출력
                } else {
                    sb.append("0\n");  // 비지 않았으면 0 출력
                }
            } else if (command == 5) {
                if (stack.isEmpty()) {
                    sb.append("-1\n");  // 비었으면 -1 출력
                } else {
                    sb.append(stack.peek()).append("\n");  // 스택의 맨 위 값 출력
                }
            }

        } System.out.println(sb);
    }
}