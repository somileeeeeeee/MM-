# 재귀 함수를 활용해서 완성해서 1부터 num까지의 곱이 출력
# multiple(num) -> 1*2*3*...*num->1이면 1return, 2이면 1*2->f(2)=2*f(1), 3이면 1*2*3->f(3)=3*f(2)=3*2*1
def multiple(num):
    if num <=1:
        return num
    return num * multiple(num-1)


# 숫자가 들어있는 리스트가 주어졋을 떄, 리스트의 합을 리턴하는 함수
# num[1], num[1,2]->sum[0]+sum[1], [1,2,3]->sum[0]+sum[1]+sum[2]
def sum(num):
    if len(num)<=1:
        return num[0]
    return num[0]+sum[1:]

# 회문(palindrome) 판별할 수 있는 함수를 리스트 슬라이싱을 활용해 만들어보기
# MOTOR -> ROTOM, [-1]=R, [1:-1]=OTO
# [0]==[-1]-> RETURM PAL[1:-1] 
# len(PAL)<=1-> T
def pal(string):
    if len(pal)<=1:
        return True
    elif string[0]==string[-1]:
        return string[1:-1]
    else:
        False

# 정수 n을 입력받아, n이 홀수이면 3 X n + 1, n이 짝수이면 n 을 2로 나눕니다. 과정을 반복해 1이 되는 과정을 모두 출력하는 함수를 작성
# n=1 return 1, n=10-> 10/2=5 5-> 16 ->8->4->2->1
def make1(num):
    if (num%2==0):
        return make1(num/2)
    elif (num%2==1):
        return make1(3*num+1)
    elif (num == 1):
        return 1