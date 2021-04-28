# 3주차 개념
## 배열(Array)
동일한 자료형(Data Type)의 데이터를 연속된 공간에 저장하기 위한 자료구조

### 배열 사용의 장점
연관된 데이터를 저장하기 위한 변수의 선언을 줄여주며, 반복문 등을 이용하여 계산과 같은 과정을 쉽게 처리할 수 있다.


### 일차원 배열
##### 배열 선언 방법

1) 데이터의 값을 알고 있을 때 사용

`
자료형[] 변수 = {데이터1, 데이터2, 데이터3, ...};
`


```java
// example)

String[] beer = {"Kloud", "Cass", "Asahi", "Guinness", "Heineken"};

//index = 0 ~ length - 1

System.out.print(beer[0]); //Kloud

System.out.print(beer[1]); //Cass

System.out.print(beer[2]); //Asahi

System.out.print(beer[3]); //Guinness

System.out.print(beer[4]); //Heineken
```


2) 배열의 값은 모르지만 향후 값을 저장하기 위한 배열을 생성하고 싶을 경우 사용✔


```
자료형[] 변수 = new 자료형[배열크기]; // 좌우 자료형 통일

.

.

.

변수[0] = 데이터값;

변수[1] = 데이터값;
```


new 연산자로 배열을 생성시킴


```
// example)

int[] num = new int[3];

num[0] = 10;

num[1] = 15;

num[2] = 13;
```


사용 방법


```java
// example)

int[] num = new int[5]; //배열 생성

Scanner sc = new Scanner(System.in);

System.out.println("5개의 정수를 입력하시오.");

for (int i = 0; i < num.length; i++)

{

num[i] = sc.nextInt(); //데이터 입력 및 배열에 저장

}

```


위의 예시처럼 배열의 값을 모를 때 배열을 정의만 하고 값은 입력받아 사용!<br>
데이터 값들을 모를 때가 더 많기 때문에 위의 방법을 더 많이 사용한다.

```java
double[] myList = new double[10]
//double myList[] = new double[10]
```


#### 배열의 길이


`
arrayRefVar.length
`


```java
// example)

myList.length // return 10
```


#### 배열 디폴트값


numeric primitive data type -> 0 <br>
char type -> '\u0000' <br>
boolean type -> false <br>
String type -> null // not ""


#### 배열 초기화

```java
double[] myList = new double[4];

myList[0] = 1.9;

myList[1] = 2.9;

myList[2] = 3.4;

myList[3] = 3.5;
```

↕ 동일한 코드

```java
myList = new double[] {1.9, 2.9, 3.4, 3.5};
```
---

### 2차원 배열

#### 선언 방법

1) 배열의 값을 미리 알고 있을 때

```
자료형[][] 변수명 = {{데이터(0행 0열), 데이터(0행1열)}, //0행
		     {데이터(1행 0열), 데이터(1행 1열)}, //1행
		     {데이터(2행 0열), 데이터(2행 1열)}} //2행
        	    // 0열              1열
```


```java
// example)
int[][] num = { {4, 3, 4}, //0행
                {3, 7, 5}, //1행
                {5, 8, 7}, //2행
                {9, 9, 10}}; //3행
               //0열 1열 2열
               
for(int i = 0; i < 4; i++) { //행 반복
  for(int j = 0; j < 3; j++) { //열 반복
    System.out.println(i+"행"+j+"열의값: "+num[i][j]);
  }
}
```

2) 배열의 값을 모르는 경우

```
자료형[][] 변수명 = new 자료형[행개수][열개수];
자료형[0][0] = 데이터; 자료형[0][1] = 데이터;
자료형[1][0] = 데이터; 자료형[1][1] = 데이터;
자료형[2][0] = 데이터; 자료형[2][1] = 데이터;
```

```java
int[][] num = new int[4][3]; //4행 3열 배열 생성
num[0][0] = 4; num[0][1] = 3; num[0][2] = 4; //값 할당
num[1][0] = 3; num[1][1] = 7; num[1][2] = 6; //값 할당
num[2][0] = 5; num[2][1] = 8; num[2][2] = 7; //값 할당
num[3][0] = 9; num[3][1] = 9; num[3][2] = 10; //값 할당

for (int i = 0; i < 4; i++) {
	for(int j = 0; j < 3; j++) {
		System.out.println(i+"행"+j+"열의 값:"+num[i][j]);
	}
}

```

