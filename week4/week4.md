메소드
======
## 메소드의 개념
#### 메소드
자바에서 클래스는 멤버(member)로 속성을 표현하는 필드(field)와 기능을 표현하는 메소드(method)를 가집니다.

그중에서 메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있습니다.
## 메소드의 사용목적
클래스에서 메소드를 작성하여 사용하는 이유는 중복되는 코드의 반복적인 프로그래밍을 피할 수 있기 때문입니다.

또한, 모듈화로 인해 코드의 가독성도 좋아집니다.

그리고 프로그램에 문제가 발생하거나 기능의 변경이 필요할 때도 손쉽게 유지보수를 할 수 있게 됩니다.
## 메소드 정의
클래스에서 메소드를 정의하는 방법은 일반 함수를 정의하는 방법과 크게 다르지 않습니다.

자바에서 메소드를 정의하는 방법은 다음과 같습니다.

문법
접근제어자 반환타입 메소드이름(매개변수목록) { // 선언부

    // 구현부

}

1. 접근 제어자 : 해당 메소드에 접근할 수 있는 범위를 명시합니다.

2. 반환 타입(return type) : 메소드가 모든 작업을 마치고 반환하는 데이터의 타입을 명시합니다.

3. 메소드 이름 : 메소드를 호출하기 위한 이름을 명시합니다.

4. 매개변수 목록(parameters) : 메소드 호출 시에 전달되는 인수의 값을 저장할 변수들을 명시합니다.

5. 구현부 : 메소드의 고유 기능을 수행하는 명령문의 집합입니다.

## 메소드 호출

자바에서 위와 같은 방법으로 정의한 메소드는 멤버 참조 연산자(.)를 사용하여 호출할 수 있습니다.

 

자바에서 메소드를 호출하는 방법은 다음과 같습니다.

문법
1. 객체참조변수이름.메소드이름();                  // 매개변수가 없는 메소드의 호출

2. 객체참조변수이름.메소드이름(인수1, 인수2, ...); // 매개변수가 있는 메소드의 호출

 

다음 예제는 앞서 정의한 accelerate() 메소드를 호출하는 예제입니다.

예제
Car myCar = new Car();   // 객체를 생성함.

myCar.accelerate(60, 3); // myCar 인스턴스의 accelerate() 메소드를 호출함.

 

다음 예제는 실제로 accelerate() 메소드를 정의하고 호출하는 예제입니다.

예제
class Car {

    private int currentSpeed;

    private int accelerationTime;

 

    public void accelerate(int speed, int second) {

        System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");

    }

}

public class Method01 {

    public static void main(String[] args) {

        Car myCar = new Car();   // 객체 생성

        myCar.accelerate(60, 3); // 메소드 호출

    }

}

## 입력값이 없는 메소드
입력값이 없는 메소드가 존재할까? 당연히 그렇다. 다음을 보자.

public String say() {
    return "Hi";
}
say 메소드의 입출력 자료형은 다음과 같다.

입력 값 - 없음
리턴 값 - String 자료형
say라는 이름의 메소드를 만들었다. 하지만 입력 인수부분을 나타내는 괄호 안이 비어있다.

이 메소드는 어떻게 쓸 수 있을까? 다음과 같이 따라해 보자.

##리턴 값이 없는 메소드
리턴값이 없는 메소드 역시 존재한다. 다음의 예를 보자.

public void sum(int a, int b) {
    System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
}
위 sum 메소드의 입출력 자료형은 다음과 같다.

입력 값 - int 자료형 a, int 자료형 b
리턴 값 - void (없음)
리턴값이 없는 메소드는 명시적으로 리턴타입 부분에 void라고 표기한다. 리턴값이 없는 메소드는 돌려주는 값이 없기 때문에 다음과 같이 사용한다.

Test myTest = new Test();
myTest.sum(3, 4);
즉, 리턴값이 없는 메소드는 다음과 같이 사용된다.

객체.메소드명(입력인수1, 입력인수2, ...)
실제로 위 메소드를 호출해 보면 다음과 같은 문자열이 출력된다.

3과 4의 합은 7입니다.
아마도 여러분은 다음과 같은 질문을 할지도 모른다. "3과 4의 합은 7입니다.“라는 문장을 출력해 주었는데 리턴값이 없는 것인가? 이 부분이 초보자들이 혼동스러워 하는 부분이기도 한데 System.out.println 문은 메소드내에서 사용되어지는 문장일 뿐이다. 돌려주는 값은 당연히 없다. 돌려주는 값은 return 명령어로만 가능하다.

Test myTest = new Test();
String a = myTest.say();
System.out.println(a);
위의 메소드를 쓰기 위해서는 say()처럼 괄호 안에 아무런 값도 넣어주지 않고 써야 한다. 위의 메소드는 입력값은 없지만 리턴값으로 'Hi'라는 문자열을 돌려준다. 따라서 String a = myTest.say()처럼 하면 a에는 'Hi'라는 문자열이 대입되게 되는 것이다.

위 예제를 실행하면 다음과 같이 "Hi"라는 문자열이 출력된다.

Hi
즉, 입력값이 없고 리턴값만 있는 메소드는 다음과 같이 사용된다.

리턴값받을변수 = 객체.메소드명()

## 입력값도 리턴값도 없는 메소드

이것 역시 존재한다. 다음의 예를 보자.

public void say() {
    System.out.println("Hi");
}
위 say 메소드의 입출력 자료형은 다음과 같다.

입력 값 - 없음
리턴 값 - void (없음)
입력 값을 받는 곳도 없고 return문도 없으니 입력값도 리턴값도 없는 메소드이다.

이것을 사용하는 방법은 단 한가지이다.

Test myTest = new Test();
myTest.say();
즉, 입력값도 리턴값도 없는 메소드는 다음과 같이 사용된다.

객체.메소드명()

## 메소드 오버로딩
같은 이름을 갖고 있지만, 서로 다른 매개변수 형식을 가지고 있는 메서드를 여러 개 정의하는 것.



loading은 물건을 싣는 것이다. 

over loading이면 과적해서 싣는 것이다.

보통 하나의 메서드로 하나의 기능만 구현해지만

하나의 메서드로 여러 기능을 구현하기 때문에 붙여진 이름이다.
1. 메서드의 이름이 같아야 한다. 

2. 메서드의 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다. 

3. 매개변수의 개수 or 매개변수의 자료형이 달라야 한다.
