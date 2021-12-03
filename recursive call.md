#### 재귀 용법 (recursive call, 재귀 호출)

: 함수 안에서 동일한 함수를 호출하는 형태. 여러 알고리즘 작성시 사용




##### 예제) 팩토리얼을 구하는 알고리즘을 Recursive Call 을 활용해서 알고리즘 작성하기

> 간단한 경우부터 생각해보기
2! = 1 X 2
3! = 1 X 2 X 3
4! = 1 X 2 X 3 X 4 = 4 X 3!
>
> 규칙이 있음 : n! = n X (n - 1)!
> 1. 함수를 하나 만든다.
> 2. 함수(n) 은 n > 1 이면 return n X 함수(n - 1)
> 3. 함수(n) 은 n = 1 이면 return n

```python
def factorial(num):
    if num > 1:
        return num * factorial(num - 1)
    else:
        return num
for num in range(10):
    print (factorial(num))
# 결과
0
1
2
6
24
120
720
5040
40320
362880

```



**시간복잡도와 공간복잡도**
1. factorial(n) 은 n - 1 번의 factorial() 함수를 호출해서, 곱셈을 함
> 일종의 n-1번 반복문을 호출한 것과 동일
> factorial() 함수를 호출할 때마다, 지역변수 n 이 생성됨
2. 시간 복잡도/공간 복잡도는 O(n-1) 이므로 결국, 둘 다 O(n)

|   평균   |   최선   |   최악   |
| :------: | :------: | :------: |
| O(n) | O(n) | O(n) |



##### 재귀 호출의 일반적인 형태
```python
# 일반적인 형태1
def function(입력):
    if 입력 > 일정값: # 입력이 일정 값 이상이면
        return function(입력 - 1) # 입력보다 작은 값
    else:
        return 일정값, 입력값, 또는 특정값 # 재귀 호출 종료

```

```python
# 일반적인 형태2
def function(입력):
    if 입력 <= 일정값:              # 입력이 일정 값보다 작으면
        return 일정값, 입력값, 또는 특정값              # 재귀 호출 종료
    function(입력보다 작은 값)
    return 결과값
```

```python
def factorial(num):
    if num <= 1:
        return num
    
    return num * factorial(num - 1)

for num in range(10):
    print (factorial(num))
# 결과
0
1
2
6
24
120
720
5040
40320
362880

```

재귀 호출은 스택의 전형적인 예
: 함수는 내부적으로 스택처럼 관리됨.

> 재귀 호출이 이해가 가지 않는다면? - Live Programming Mode - Python Tutor - Visualize Python and JavaScript code


