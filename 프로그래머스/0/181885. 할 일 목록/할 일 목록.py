def solution(todo_list, finished):
    result=[]
    for i in range(len(finished)):
        if finished[i]==False:
            result.append(todo_list[i])
    return result