def solution(my_string, is_suffix):
    result=[]
    for i in range(len(my_string)):
        result.append(my_string[i:])
    for j in result:
        if j==is_suffix:
            return 1
    return 0