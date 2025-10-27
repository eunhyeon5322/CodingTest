def solution(arr, queries):
    for i in range(len(queries)):
        first = queries[i][0]
        last = queries[i][1]
        target = queries[i][2]
        
        for j in range(first, last+1):
            if(j%target==0 ):
                arr[j]+=1
    return arr
            
            