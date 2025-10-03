import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int last = -1;

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            String s = command[0];

            if (s.equals("push")) {
                last = Integer.parseInt(command[1]);
                q.add(last);
            } else if (s.equals("pop")) {
                System.out.println(q.isEmpty() ? -1 : q.poll());
            } else if (s.equals("size")) {
                System.out.println(q.size());
            } else if (s.equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            } else if (s.equals("front")) {
                System.out.println(q.isEmpty() ? -1 : q.peek());
            } else if (s.equals("back")) {
                System.out.println(q.isEmpty() ? -1 : last);
            }
        }
    }
}
