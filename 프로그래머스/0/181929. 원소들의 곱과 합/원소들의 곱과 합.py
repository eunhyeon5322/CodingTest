def solution(num_list):
    plus=0
    mul=1
    answer=0
    for idx in num_list:
        plus+=idx
        mul*=idx
    if plus**2> mul:
        answer=1
    return answer