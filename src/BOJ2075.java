import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ2075 {
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








        // 입력 받은 2차원 배열을 돌면서 max보다 큰 값이 나오면
        // max 값으로 바꿔주고 하나씩 보려고 했는데
        // 이렇게 하면 비효율적....
        // 우선순위큐로 가장 큰 N개만 유지해서 -> 위치 불필요
    }
}
