def solution(arr, query):
    for i, q in enumerate(query):
        if i % 2 == 0:       # 짝수 인덱스 → 뒤 자르기
            arr = arr[:q+1]
        else:                # 홀수 인덱스 → 앞 자르기
            arr = arr[q:]
    return arr
