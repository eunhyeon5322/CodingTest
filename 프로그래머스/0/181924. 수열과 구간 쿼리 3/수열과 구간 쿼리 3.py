def solution(arr, queries):
    change = 0
    for i, j in queries:
        change = arr[i]
        arr[i]=arr[j]
        arr[j]=change
        
    return arr
        