def solution(n):
    result=[n]
    while result[-1]!=1:
        if result[-1]%2==0:
            n=result[-1]/2
        else:
            n=result[-1]*3+1
        result.append(n)
    return result