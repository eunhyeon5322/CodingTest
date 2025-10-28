def solution(n):
    result=[]
    temp=n
    result.append(temp)
    while temp!=1:
        if temp%2==0:
            result.append(temp/2)
            temp=temp/2
        else:
            result.append(3*temp+1)
            temp=3*temp+1
    return result