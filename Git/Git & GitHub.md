# git & github

## Terminal
: GIT을 사용하기 위해선 UI 기반 Tool 도 많지만, 기능적으로 제한적인 요소가 있어, Terminal 사용을 추천
* 기본 내장되어 있는 Terminal 사용도 가능, 조금 더 기능이 있는 Terminal을 사용하고자 한다면 cmder(windws) / iTerm2(iOS) 설치 !

1. git 설치되어 있는 지 확인
```TERMINAL
git --version
```
![image](https://user-images.githubusercontent.com/30613069/181016788-8097c696-abbc-47fa-83aa-d86d6e241237.png)


2. git 설치가 안되어 잇다면?
- git 공식 사이트(git-scm.com/downloads) > Downlads > 운영체제에 맞게 다운로드

3. git 정보 확인
```terminal
-- git config --global 등록정보 확인
git config --list

-- git User 정보 확인?
git config --global -e

-- vscode 연동 -> 실행
code.
```
![image](https://user-images.githubusercontent.com/30613069/181371650-2a324240-ea50-4c05-819b-4d5f09f27336.png)

4. ✔ git <-> VS Code 연동 
4-1. VSCode 실행 후 키보드 f1 누름

4-2. git clone 검색
![image](https://user-images.githubusercontent.com/30613069/181370486-8f9870f6-6642-4dcc-b530-1933662747ed.png)

4-3. 연동할 git repository 선택
![image](https://user-images.githubusercontent.com/30613069/181370644-dbdd8944-355f-418a-8b9a-7b78db7105ad.png)

4-4. 연동할 로컬 저장소 선택
![image](https://user-images.githubusercontent.com/30613069/181370775-f1d2dd20-eb57-475a-9a97-041fa2bf6f6f.png)

5. Config 세팅
- vs code로 config 파일 띄어짐 
- --global은 전체 REPOSITORY 구성에 대해서 변경, LOCAL은 하나의 REPOSITORY 변경 시 사용
```terminal
C:\Users\user>git config --global core.editor "code"

C:\Users\user>git config --global -e
```
![image](https://user-images.githubusercontent.com/30613069/181372586-22d88d6d-15ae-4e00-bdc7-d8a21ec79edd.png)

- vs code 창 꺼줌
```terminal
C:\Users\user>git config --global core.editor "code --wait"

C:\Users\user>git config --global -e
```

- GIT 사용자 이름, 메일 설정
```terminal
C:\Users\user>git config --global user.name "ssom222"
C:\Users\user>git config --global user.email "email.com"
```

- 운영체제 마다 text 자동적으로 붙는 방식이 다른데, 운영체제마다 연동이 안될 경우가 있기 때문에 core.autocrlf 설정 해줌
```terminal
C:\Users\user>git config --global core.autocrlf true (윈도우)
C:\Users\user>git config --global core.autocrlf input (맥)
```
![image](https://user-images.githubusercontent.com/30613069/181373677-57ca9631-87a5-401b-b112-45386eed42c3.png)

- ❗❕ 윈도우 명령프롬프트에서 리눅스& MAC OS에서 사용했던 명령어 바꾸기
![image](https://user-images.githubusercontent.com/30613069/181374876-c46feb00-1a2e-4593-82e5-b38c3e341bd4.png)
> 리눅스 환경, MAC OS환경에서 사용하는 명령어를 사용하면 위처럼 에러가 남

> doskey 사용을 희망하는 명령어 = 기존 명령어

> 이렇게 doskey 다음에 사용을 희망하는 명령어 (여기선 ls, clear)를 적고 =을 입력하고, 

> =뒤에 기존에 명령프롬프트에서 사용하던 명령어(여기선 dir, cls)를 적어주면 ls로 dir 같은 기능 사용할 수 있음!

![image](https://user-images.githubusercontent.com/30613069/181375508-14648514-5990-4337-b796-c85507c79d8e.png)

<br/>

- 원하는 폴더로 git 초기화 및 삭제하기
```terminal
C:\Users\user>cd projects

C:\Users\user\projects>cd git

C:\Users\user\projects\git>ls -al
 C 드라이브의 볼륨에는 이름이 없습니다.
 볼륨 일련 번호: 32CC-2F84

 C:\Users\user\projects\git 디렉터리

2022-07-28  오전 06:25    <DIR>          .
2022-07-28  오전 06:25    <DIR>          ..
2022-07-28  오전 06:25                 0 doskey
               1개 파일                   0 바이트
               2개 디렉터리  12,220,858,368 바이트 남음

C:\Users\user\projects\git>git init
Initialized empty Git repository in C:/Users/user/projects/git/.git/

```
![image](https://user-images.githubusercontent.com/30613069/181376220-e2155f0e-2fc3-4502-9bfe-a9eff2bdadf7.png)

> git 파일이 만들어진 것을 확인할 수 있다. -> Git Repository에 있는 정보가 git 파일 안에 저장되어 있음.

```terminal

```

- git 상태 보기 및 명령어 단축하기
> git config --global alias.st status

> status라는 명령어를 st만 쳐서 사용하고 싶을 때 위의 명령어 사용

```terminal
C:\Users\user\projects\git>git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        doskey

nothing added to commit but untracked files present (use "git add" to track)

C:\Users\user\projects\git>git config --global alias.st status

C:\Users\user\projects\git>git st
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        doskey

nothing added to commit but untracked files present (use "git add" to track)
```

- 명령어 확인은 git 홈페이지 또는 git config --h 명령어 활용
![image](https://user-images.githubusercontent.com/30613069/181377599-b79548c9-52e0-4188-8882-859a712e460d.png)


출처 : 앨리의 드림코딩



