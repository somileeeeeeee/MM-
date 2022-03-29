# K번째수

https://programmers.co.kr/learn/courses/30/lessons/42748

![image](https://user-images.githubusercontent.com/30613069/160613663-a93076cb-a557-4030-bea6-ad9b68f5e3fd.png)
![image](https://user-images.githubusercontent.com/30613069/160613724-32a8c121-e67d-408c-83c9-2cc475fcfaa3.png)

```python
def solution(array, commands):
    
    answer = []
    for i in commands:

#       1. list.sort() : 변수 자체를 수정, 함수 반환값 None 값. key 설정 가능, reverse(내림차순) 가능
#       2. sorted(list) : 반환값 list 새로운 변수에 할당 가능, key 설정 가능, reverse(내림차순) 가능
        j = sorted(array[i[0]-1:i[1]])
        print(j[i[2]-1])
        answer.append(j[i[2]-1])
    return answer
```
