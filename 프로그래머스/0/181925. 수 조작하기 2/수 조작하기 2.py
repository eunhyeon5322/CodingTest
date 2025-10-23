def solution(numLog):
    result='' 
    for i in range(len(numLog)-1):
        
        num = numLog[i+1]-numLog[i]
        if num==1:
            result+='w'
        elif num==-1:
            result+='s'
        elif num==10:
            result+='d'
        elif num==-10:
            result+='a'
            
    return result