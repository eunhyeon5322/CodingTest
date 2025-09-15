import java.util.*;

public class BOJ1240 {
    // 노드 간의 연결 정보를 표현하는 객체
    // to - 연결된 다른 노드
    // wight - 그 노드까지의 거리 (=가중치)
    static class Edge {
        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    // Edge 객체들을 담는 리스트 배열
    static List<Edge>[] graph;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 노드 개수
        int M = scanner.nextInt(); // 쿼리 개수

        // 그래프 초기화 - 초기화 안하면 null
        // 노드 번호가 1부터 시작하니까
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int dist = scanner.nextInt();

            graph[a].add(new Edge(b, dist));
            graph[b].add(new Edge(a, dist)); // 두 노드가 서로 연결됐으니까 양방향
        }

        // 쿼리 처리
        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            visited = new boolean[N + 1];
            answer = 0;
            dfs(start, end, 0);
            System.out.println(answer);
        }
    }

    // DFS로 두 노드 사이 거리 찾기
    static void dfs(int current, int target, int dist) {
        if (current == target) {
            answer = dist;
            return;
        }

        visited[current] = true;

        for (Edge edge : graph[current]) {
            if (!visited[edge.to]) {
                dfs(edge.to, target, dist + edge.weight);
            }
        }
    }
}
