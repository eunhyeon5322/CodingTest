def solution(a, b, c, d):
    dice = [a, b, c, d]
    setdice = list(set(dice)) 
    counts = [dice.count(x) for x in setdice] 
    
    if len(setdice) == 1:
        return 1111 * dice[0]
    
    elif 3 in counts:
        p = setdice[counts.index(3)]
        q = setdice[counts.index(1)]
        return (10 * p + q) ** 2
    
    elif counts.count(2) == 2:
        p, q = setdice
        return (p + q) * abs(p - q)
    
    elif 2 in counts:
        p = setdice[counts.index(2)] 
        q, r = [x for x in setdice if x != p]
        return q * r
    
    else:
        return min(dice)
