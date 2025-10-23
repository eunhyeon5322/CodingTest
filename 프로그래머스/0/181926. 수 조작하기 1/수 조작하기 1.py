def solution(n, control):
    for ch in control:
        if ch == 'w':
            n=n+1
        elif ch == 's':
            n=n-1
        elif ch == 'd':
            n=n+10
        elif ch == 'a':
            n=n-10
    return n