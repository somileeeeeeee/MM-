# 1. 모듈과 패키지
## 모듈?
- 모듈은 함수나 변수, 클래스를 모아 놓은 파일이다. 모듈은 다른 파이썬 프로그램에서 불러와 사용할 수 있게끔 만든 파이썬 파일이라고도 할 수 있다. 
- 모듈의 종류 
	- 표준 모듈 : 파이썬과 함께 따라오는 모듈 
	- 사용자 생성 모듈 : 프로그래머가 직접 작성한 모듈 
	- 서드 파티 모듈 : 파이썬 재단도 프로그래머(본인)도 아닌 다른 프로그래머 또는 업체에서 제공한 모듈
	- 외부 모듈을 사용할 수 있도록 하는 방법은 import 파일명 확장자는 생략하고 파일에 있는 변수나 함수는 파일명.변수 또는 파일명.함수()로 호출 
- 모듈 만들기
```python
variable = 3 

def addition(x, y): 
	return(x,y) 
```

라 정의하고 이름을 my_func.py라고 저장한 뒤에 불러보자.

## import
-  Import는 다른 모듈 내의 코드에 대한 접근을 가능하게 하는 것으로, 변수, 함수, 클래스 등이 포함된다. 
- import 모듈 또는 from 모듈 import 함수이름1, 함수이름2 와 같은 형태로 입력. 
- 와일드카드 *를 이용하면 모듈 내 모든 것을 가져온다.
- import를 입력하면 어떤 폴더에서 가져오는 지 확인-> sys.path를 통해 확인가능! 
- 직접 위치를 추가하려면? sys.path.append(‘검색할 경로‘)

## __name__ 변수란?
- __name__변수란 파이썬이 내부적으로 사용하는 특별한 변수로, 현재 실행중인 파일의 이름은 __main__이라는 이름으로, 불러온 모듈의 경우 모듈의 이름이 __name__이란 변수에 저장된다.

## 패키지란?
- 모듈들을 모아놓은 디렉토리 
- 패키지에서 특정한 모듈을 가져올 때는 from my_package import my_module 과 같은 형식으로 불러오면 된다. 
- * 주의 python 3.3버전이전에는 디렉토리가 패키지로 인정받기 위해서는 __init__.py라는 파일이 내부에 있어야 했다. 
- 모듈 안의 모든 내용을 불러올 때 와일드 카드 *를 썼다. 그렇다면 패키지 안의 모든 모듈을 불러오려면 어떻게 해야할까? 
-> 패키지 디렉토리 안에 __init__.py라는 이름의 파일을 만들고 __all__ = [‘모듈이름1’, ‘모듈이름2‘] 이런 식으로 와일드카드 *로 부를 수 있는 모듈 이름들을 직접 지정해 주어야 한다.

## 객체와 클래스
- 파이썬에서 class란 변수와 메소드(객체 내에 정의된 함수를 메소드라 부름)를 정의하는 일종의 틀이다. 그리고 이러한 틀을 통해 생성된 것을 객체(object) 또는 class 의 instance라 부름.
-> 석고상을 만들 때 그것을 만들기 위한 틀을 만들고 거기에 석고를 부어 잔뜩 찍어내는 걸 생각하면 됨. 여기서 틀이 class이고 찍어져 나온 결과물이 객체이다.


## 파이썬에서 클래스 정의하는 법
```python
class human: # class의 이름 정의
    def __init__(self, height, age): # class가 호출될 때 처음 실행될 method
        self.height = height # class 변수
        self.age = age 
    def how_old(self): # class 메소드
        print(self.age, "살 입니다.")
    def how_tall(self):
        print(self.height, "cm 입니다.")

```

### 매개변수 설정
```python
#   매가 변수가 3개인 메소드 생성
#   self는 입력할 필요가 X, self는 자동으로 선언한 객체가 들어가기 때문에 입력할 필요 x

    def how_old(self, var1, var2): # class 메소드
        print(self.age, "살 입니다.")
        print(var1)
        print(var2)
```
-> self는 자기자신을 부르는 변수. 클래스 내에서 다른 메소드에도 호출하기 위해선 무조건 self를 써야함. 안 쓸 경우, 지역변수로 인식됨.

## 객체를 정의하는 법
```python
Seunghyun = human(180, 31)

#  변수 부르는 법
Seunghyun.height

# 메소드 호출
Seunghyun.how_old()

# 또는
human.how_old(Seunghyun)

-> 
31 살 입니다.
31 살 입니다.
```

## 같은 클래스의 두 객체는?
```python
Seunghyun1 = human(180, 31)
Seunghyun2 = human(180, 31)
Seunghyun1 == Seunghyun2
-> False
# 똑같은 값을 통해 객체를 생성했지만 object는 생성될 때 마다 새로운 메모리 공간에 값을 생성하기 때문에 엄밀히 말하면 다른 값이다!
```

## 객체에 변수 추가하기
```python
 # 이런 식으로 객체이름.변수이름 = 값 을 입력함으로써 객체에 변수를 추가할 수 있다.
Seunghyun = human(180, 31) # height, age
Seunghyun.weight = 90
```
