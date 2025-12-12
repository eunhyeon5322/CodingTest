def solution(str_list):
    result=[]
    for i in str_list:
        if i=='l':
            left=str_list.index('l')
            return str_list[:left]
        elif i=='r':
            right=str_list.index('r')
            return str_list[right+1:]
    return result