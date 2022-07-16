# Pandas
- Numpy 기반으로 개발된 데이터 분석도구
- pandas.Series는 1차원 데이터를 다루는 데 효과적이고, pandas.DataFrame은 2차원 데이터를 다루는 데 유용
- pandas는 주로 Series 보다 DataFrame을 많이 쓴다. 
- DataFrame은 리스트형식으로 생성할 수도 있지만, Dictionary 로 부터 생성할 수도 있다. 
```python
import pandas as pd

pd.Series([1,2,3,4])

# list형식
pd.DataFrame([[1,2,3,4],[5,6,7,8]], columns = ['col1', 'col2', 'col3', 'col4'])
-> 	col1	col2	col3	col4
0	1	2	3	4
1	5	6	7	8

# dictionary 형식
pd.DataFrame({'col1':[1,2,3,4], 'col2': [5,6,7,8]})
-> 	col1	col2
0	1	5
1	2	6
2	3	7
3	4	8
```

## DataFrame
- .values 속성을 이용해 데이터만 numpy array 형식으로 접근 가능하다.
- 컬럼의 이름은 .columns를 통해 얻을 수 있다.
- Row의 이름은 .index를 통해 얻을 수 있다.

## DataFrame의 열, 행 선택
- df['컬럼이름'] 또는 df.컬럼이름을 통해 열 하나에 접근 가능
- df[['컬럼이름1', '컬럼이름2']]를 통해 여러 개의 컬럼에 접근 가능
- df[숫자1:숫자2]를 통해 특정 행들에 접근 가능
- df.iloc[숫자]를 통해 특정 행 하나에 접근가능(iloc도 마찬가지로 숫자1:숫자2로 여러 행에 접근 가능)

## DataFrame에 열 갱신, 추가, 삭제
- df['새로만들열이름'] = data 컬렉션 : dataframe에 새로운 열 추가
- df['기존열이름'] = df['기존열이름'] * 100 : dataframe의 기존 열을 변경
- del df['기존 열 이름'] : 기존 열 삭제

## DataFrame에 함수 적용
- df.apply(함수, [axis=0]) : axis가 0일 경우(또는 생략) 컬럼 단위로 함수를 수행. axis가 1일 경우, row 단위로 함수 수행
- df.applymap(함수) : 각각 요소 별로 함수 적용

## DataFrame에 NaN 처리
- isnull() : NaN이나 None인 경우 True, 그 외엔 False
- notnull() : isnull의 반대
- dropna() : NaN이나 None을 소유한 행을 제외
- fillna() : NaN이나 None을 특정 수로 채울 수 있음

## DataFrame에 groupby
- DataFrame으로 작업할 때, 그룹 별로 통계 분석을 할 경우가 많음
- 이럴 때 사용하는 것이 바로 groupby 메서드
- df.groupby('반').mean() : 반 별 평균 점수를 반환
- df.groupby('컬럼이름').apply(함수) : 컬럼이름이 같은 것들끼리 함수를 적용
- numpy 기반이기 때문에 대부분의 numpy 기반 함수를 method로 사용 가능하고 최적화도 잘 되어 있음.
