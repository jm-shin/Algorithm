answer = 0

def make_target(numbers, target, length, i):
    global answer
    if i == length:
        if target == sum(numbers):
            answer +=1
        return 
    numbers[i] *= 1
    make_target(numbers, target, length, i+1)
    numbers[i] *= -1
    make_target(numbers, target, length, i+1)

def solution(numbers, target):
    global answer
    length = len(numbers)
    make_target(numbers, target, length, 0)
    return answer