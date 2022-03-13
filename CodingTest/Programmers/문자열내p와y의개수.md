# 문자열 내 p와 y의 개수
https://programmers.co.kr/learn/courses/30/lessons/12916

![image](https://user-images.githubusercontent.com/30613069/158051831-7bc4393a-21ae-4c8a-9fa9-8a085f2c9281.png)

```python
def solution(s):
    list = []
    list.append(s)
    count_p = 0
    count_y = 0
    for i in list:
        for j in i:
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
