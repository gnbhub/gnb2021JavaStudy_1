## 5주차 클래스, 객체
객체
  - 객체(object) : 현실 세계의 사물이나 개념을 시스템에서 이용하기 위해 현실 세계를 자연스럽게 표현하여 손쉽게 이용할 수 있도록 만든 소프트웨어 모델

### 객체 지향
**객체지향 프로그래밍**
  - 클래스(Class)를 생성하고 클래스로부터 객체를 만들어 객체 간의 상호작용을 이용하여 주어진 문제를 해결하는 프로그래밍 방식
  - 데이터인 필드와 절차인 메소드르 하나로 묶은 클래스 단위의 프로그램
**절차 지향과 객체 지향**
  - 절차 지향 프로그래밍 : 문제를 해결하는 절차를 중요하게 생각하는 방법
  - 객체지향 프로그래밍 : 데이터와 절차를 하나의 덩어리(객체)로 묶어서 생각하는 방법
                        실제 세계를 모델링하여 소프트웨어를 개발하는 방법
**객체**
- 객체의 상태 : 객체의 특징값(속성)
- 객체의 동작, 행동 : 객체가 취할 수 있는 동작
-> 객체는 상태와 동작을 가짐.
 
 **메시지**
 - 소프트웨어 객체는 메시지를 통해 다른 소프트웨어 객체와 통신하고 서로 상호 작용한다.
 - 메시지 전달 = 메소드 호출
 Car c = new Car();
 c.setSpeed(100);
 (c: 메시지를 받는 객체, setSpeed : 메시지 이름, 100 : 메시지의 매개변수)
  
 ### 클래스
 **클래스**
 - 클래스 : 객체를 만드는 설계도
 - 클래스로부터 만들어지는 각각의 객체를 특별히 그 클래스의 인스턴스라고도 한다.
 - 클래스의 구조
 
 class 클래스이름 {
  //필드 정의 : 객체의 속성을 나타냄
  
  //메소드 정의 : 객체의 동작을 나타냄
 }
 
 예시)
 //자동차 클래스
 class Car {
  String color;
  int speed;
  int gear;
  
  void print(){
    System.out.println("("+color+", "+speed+", "+gear+")");
  }
 }
 
 **객체의 생성**
 - 참조 변수 선언 : Car타입의 객체를 참조할 수 있는 변수 myCar선언
 Car my Car(); 
 -> 객체를 가리키는 참조 값을 담을 수 있는 변수 생성o, 객체 생성x
 - 객체 생성 : new 연산자를 이용해 객체를 생성하고 객체 참조값 반환
 myCar = new Car();
 - 참조 변수와 객체의 연결 :  생성된 새로운 객체의 참조값을 myCar라는 참조 변수에 대입
 
 **객체의 필드와 메소드 접근**
 - 도트(.) 연산자 사용
 myCar.speed = 100;
 
 **객체의 생성과 참조값 복사, 소멸**
 - 객체의 생성
 Car car1 = new Car();   //첫번째 객체
 Car car2 = new Car();   //두번째 객체
 
 - 객체의 참조값 복사
 car2 = car1;   // car1과 car2는 같은 객체를 가리킴. car2가 기리켰던 객체는 쓰레기 수집기에 의해 수거.
 
 - 객체의 소멸
 car1 = null; 
 // 어떤 참조 변수도 객체를 참조하지 않을때, 그 객체는 가비지 콜렉션(garbage collection)의 대상이 되어 소멸됨.
 
 ### filed and methods
 **변수의 종류**
 - field(필드) : 클래스 안에서 선언되는 멤버 변수, 인스턴스 변수
 - parameter(매개변수) : 메소드 선언에서의 변수
 - local variable(지역변수) : 메소드나 블록 안에서 선언되는 변수
 
 **필드의 선언**
 public       int       speed;
 접근 지정자 필드 타입 필드 이름(첫단어 소문자)
 - public : 모든 클래스로부터 접근 가능
 - private : 클래스 내부에서만 접근 가능
 
 **필드의 초기화**
 - 선언과 동시에 초기화 가능
 public class ClassRoom{
  public static int capacity =60;
  private boolean use = false;
 }
 - 선언만 하고 초기화 하지 않으면 default값으로 초기화
 - 지역 변수는 사용전 반드시 명시적으로 초기화 시켜줘야함
 
 cf) 지역 변수
 - 메소드 안에 선언
 - 메소드의 매개 변수도 지역 변수의 일종
 
 **설정자(setter)와 접근자(getter)
 - 설정자(mutator, setter) : 필드 값을 설정, set---() 형식
 - 접근자(accessor, getter) : 필드 값 반환, get---() 형식
 
 - 접근 불가능한 필드에 대한 접근 방법 제공
 - 매개 변수를 통해 넘어오는 잘못된 값 사전 차단
 - 필요할때마다 필드 값 계산 후 반환 가능
 
 cf) 변수 비교
 - 변수1 == 변수2 의 의미
    기초형 변수 : 값이 같다
    참조형 변수 : 객체가 같다
 - 내용 동일 여부 검사시 equals() 사용
