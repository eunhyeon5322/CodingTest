def solution(arr, idx):
    answer = -1
    i=idx
    while(i<len(arr)):
        if arr[i]==1:
            return i
        else:
            i+=1
    return answer