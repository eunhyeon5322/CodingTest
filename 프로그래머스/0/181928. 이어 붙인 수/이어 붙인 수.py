def solution(num_list):
    odd=''
    even=''
    for idx in num_list:
        if idx%2==1:
            odd+=str(idx)
        else:
            even+=str(idx)
    return int(odd)+int(even)