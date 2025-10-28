def solution(l, r):
    result=[answer for answer in range(l, r+1) if set(str(answer)) <= {"0" , "5"}]
    
    if not result:
        return [-1]
    
    return result