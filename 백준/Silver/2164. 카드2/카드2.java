import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        int point = -1;

        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        for(int i = 1; i <= n; i++) {
            if(queue.size() == 1) {
                System.out.println(queue.peek());
                break;
            }
            queue.poll();
            point = queue.poll();
            queue.offer(point);

        }
    }
}
