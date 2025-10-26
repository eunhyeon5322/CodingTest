def solution(arr, queries):
    answer = []

    for i in range(len(queries)):
        first = queries[i][0]
        last = queries[i][1]
        target = queries[i][2]

        temp = [] 
        for j in range(first, last + 1):
            if arr[j] > target:
                temp.append(arr[j])

        if len(temp) == 0:
            answer.append(-1)
        else:
            answer.append(min(temp))

    return answer
