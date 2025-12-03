def solution(my_string):
    answer = [0] * 52 

    for ch in my_string:
        if ch.isupper():
            idx = ord(ch) - ord('A')  
        else:
            idx = 26 + (ord(ch) - ord('a'))

        answer[idx] += 1

    return answer
