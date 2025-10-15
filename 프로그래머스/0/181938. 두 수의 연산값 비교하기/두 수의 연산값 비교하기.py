def solution(a, b):
    a , b = str(a), str(b)
    return max(int(a+b), (2*int(a)*int(b)))