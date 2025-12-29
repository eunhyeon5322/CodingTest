def solution(arr):
    count=0
    while True:
        result=[]
        for i in arr:
            if i%2==0 and i>=50:
                result.append(i//2)
            elif i%2==1 and i<50:
                result.append(i*2+1)
            else:
                result.append(i)
        
        if arr==result:
            break
        arr=result
        count+=1
    return count