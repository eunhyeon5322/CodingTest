def solution(myString):
    result=''
    for i in myString:
        if i=='a' or i=='A':
            result+='A'
        else:
            result+=i.lower()
    return result