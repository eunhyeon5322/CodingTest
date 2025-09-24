import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // PriorityQueue<Integer>는 기본적으로 작은 숫자일수록 우선순위가 높음
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            String[] s= br.readLine().split(" ");
            for (int j =0; j <n ; j++){
                int a = Integer.parseInt(s[j]);
                pq.offer(a);
                if(pq.size() > n){
                    pq.poll();
                }
            }
        }
        System.out.println(pq.peek());

    }
}
