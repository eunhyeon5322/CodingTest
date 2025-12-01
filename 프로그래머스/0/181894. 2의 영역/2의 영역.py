def solution(arr):
    if 2 not in arr:
        return [-1]
    s= arr.index(2)
    e= len(arr)-1 - arr[::-1].index(2)
    
    return arr[s:e+1]