# REST API
- API(Application Programming Interface) 는 응용 프로그램에서 사용할 수 있도록, 운영 체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻함.
- 주로 파일 제어, 창 제어, 화상 처리, 문자 제어 등을 위한 인터페이스를 제공.
- 파이썬의 함수나 클래스 같은 기능 들 하나하나가 일종의 api
- Rest(Representational State Transfer) 란 ? 자원(Resource)의 표현(Reporesentation)에 의한 정보전달.
- 예를 들면, 파이썬의 list나 dictionary 등(자원을) json 파일의 형태(표현)으로 전달하는 것.
- Rest API 란? REST의 특징을 지키면서 API를 제공하는 것.

## Rest의 구성요소
- 자원(Resource) : URI -> 인터넷 주소와 같은 형식
- 행위 : HTTP 메소드 ->  GET (url 데이터를 받기만 하는 것)/POST (url에 데이터를 주고 받음. GET + PUT)/DELETE (데이터를 지우는 거)/PUT (url 데이터를 넣기만 하는 거)
- 표현(Representation of Resource) : json, xml, rss 등

+ accept : application/json -> json형태로 받아들이겠다라는 뜻으로, request와 response를 웹브라우저가 자동적으로 브라우저가 해주는 것임.

```python
# python 에서 rest api 쓰기 위해선 request 모듈 사용
```
