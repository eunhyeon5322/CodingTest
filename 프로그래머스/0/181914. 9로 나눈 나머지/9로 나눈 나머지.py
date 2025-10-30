def solution(number):
    sums=0
    for i in number:
        sums+=int(i)
    return sums%9