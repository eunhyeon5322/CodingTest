def solution(n, s, a, b, fares):
    #무한 정의
    INF = int(1e9)
    #graph 만들고
    graph = [[INF] * (n+1) for _ in range(n+1)]
    #graph 초기화
    for i in range(1, n+1):
        graph[i][i]=0
    #graph에 fares 값 넣고
    for c,d,f in fares:
        graph[c][d] = f
        graph[d][c] = f
    #3중 for문 min 
    for k in range(1, n+1):
        for i in range(1, n+1):
            for j in range(1, n+1):
                graph[i][j]=min(graph[i][j], graph[i][k]+graph[k][j])
    #answer min 값 구하기
    answer = INF
    for i in range(1, n+1):
        answer=min(answer, graph[s][i]+graph[i][a]+ graph[i][b])
    return answer