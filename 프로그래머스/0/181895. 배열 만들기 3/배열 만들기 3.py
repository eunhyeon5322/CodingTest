def solution(arr, intervals):
    answer=[]
    for i in range(len(intervals)):
        a,b = intervals[i]
        answer.extend(arr[a:b+1])
    return answer