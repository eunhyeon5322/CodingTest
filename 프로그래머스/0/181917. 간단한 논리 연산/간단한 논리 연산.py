def solution(x1, x2, x3, x4):
    resx1x2 = True
    resx3x4 = True
    if x1==False and x2==False:
        resx1x2 = False  
    if x3==False and x4==False:
        resx3x4 = False 
    if resx1x2==True and resx3x4==True:
        result = True
    else:
        result = False
    return result