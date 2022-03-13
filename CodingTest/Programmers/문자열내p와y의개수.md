# 문자열 내 p와 y의 개수
https://programmers.co.kr/learn/courses/30/lessons/12916

![image](https://user-images.githubusercontent.com/30613069/158051831-7bc4393a-21ae-4c8a-9fa9-8a085f2c9281.png)

## 1. 풀이 - 배열에 넣기.(길고 살짝 노가다임..)
```python
def solution(s):
    list = []
    list.append(s)
    count_p = 0 # p와 P를 카운트하기 위한 함수
    count_y = 0 # Y와 y를 카운트하기 위한 함수
    for i in list: # list안에 있는 문자열만 나옴 -> pppp 이런식
        for j in i: # 문자열의 하나하나씩 나옴 -> p \ p \ p \ p 이런식
            if j == 'P':
                count_p += 1
            elif j == 'p':
                count_p += 1
            elif j == 'y':
                count_y += 1
            elif j == 'Y':
                count_y += 1
        print(count_p, count_y)
        
    if count_p == count_y :
        return True
    else :
        return False
```

## 2. lower 과 count 내장함수 이용하기
```python
def numPY(s):
    # 함수를 완성하세요
    return s.lower().count('p') == s.lower().count('y')

# 아래는 테스트로 출력해 보기 위한 코드입니다.
print( numPY("pPoooyY") )
print( numPY("Pyy") )
```
