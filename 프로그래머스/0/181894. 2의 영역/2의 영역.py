def solution(arr): 
    answer = [-1] 
    s,e = 0, 0 
    for i in range(len(arr)): 
        if arr[i]==2: 
            s=i 
            break
    else:
        return answer
    for j in range(len(arr)-1,-1,-1): 
        if arr[j]==2: 
            e=j 
            break 
    answer=arr[s:e+1] 
    return answer