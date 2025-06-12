import java.util.*;

class BOJ1753 {
    //Node는 그래프의 정점과 그 정점까지의 가중치(거리)를 저장하는 객체
    // implements Comparable<Node> Node 객체들을 우선순위 큐 같은 자료구조에서 정렬할 수 있게 해줌
    static class Node implements Comparable<Node> {
        int vertex, weight;
        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        // 자바에서 객체끼리 크기 비교하는 규칙을 정하는 메서드
        public int compareTo(Node o) {
            return this.weight - o.weight; // 오름차순 정렬 (최소 힙)
            //this.weight가 작으면 음수 리턴 → this가 o보다 앞에 정렬됨
            //this.weight가 크면 양수 리턴 → this가 o보다 뒤에 정렬됨
        }
    }

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt(); // 정점 개수
        int E = sc.nextInt(); // 간선 개수
        int K = sc.nextInt(); // 시작 정점

        // 2차원 리스트
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(new Node(v, w));
        }

        // 시작점 K에서 각 정점 i까지 가는 데 필요한 최소 비용(거리)을 기록
        int[] distance = new int[V + 1];
        Arrays.fill(distance, INF);
        distance[K] = 0;

        // (정점, 시작점으로부터의 거리) 쌍을 저장
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(K, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int curVertex = current.vertex;
            int curWeight = current.weight;

            // 이미 더 짧은 경로가 발견됐으면 지금꺼 버림 (중복 처리 방지)
            if (curWeight > distance[curVertex]) continue;

            for (Node neighbor : graph.get(curVertex)) {
                int nextVertex = neighbor.vertex;
                int nextWeight = curWeight + neighbor.weight;
                // 현재 정점까지의 거리 + 이웃까지 가는 간선 가중치

                if (nextWeight < distance[nextVertex]) {
                    distance[nextVertex] = nextWeight;
                    pq.offer(new Node(nextVertex, nextWeight));
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            if (distance[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }

        sc.close();
    }
}
