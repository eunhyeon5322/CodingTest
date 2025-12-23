def solution(numbers, n):
    result=0
    for i in numbers:
        if result<= n:
            result+=i
    return result