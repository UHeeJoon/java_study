<h1>자바 문법</h1>
<h3>자료형</h3>
<div>
short, int, long, double, char, String, boolean, byte는 아스키코드 출력<br>
Short.MAX_VALUE, .MIN_VALUE 라고 하면 해당 자료형이 나타낼 수 있는 최대, 최솟값 출력<br>
상수는  자료형 앞에 final을 붙인다. final을 다른 말로 접근제어자 라고 한다<br>
final int, final double, final String
</div>

<h3>배열</h3>
<div>
int[] intArray = new int[] {1, 2, 3, 4, 5};<br>
String[] a = {""}<br>
배열 초기화 안해주면 int는 0, String은 null 값을 가짐<br>
</div>

<h3>연산자</h3>
<div>
+=, -=, *=, /=, %= 사용 가능<br>
&&, || 사용<br>
</div>

<h3>조건문</h3>
<div>
if , else if, else | break, continue<br>
switch(a){<br>
case 1: case 2: case 3: case 4: ~~ break;<br>
default: ~~;    }<br>
</div>

<h3>삼항 연산자</h3>
<div>
a>b? a=1: b=1;<br>
</div>

<h3>조건문</h3>
<div>
for, while, for each, do while<br>
</div>

<h3>클래스, 메소드, 인스턴스</h3>
<div>
ex) Phone galaxy = new Phone(); galaxy.price = 100;   클래스와 인스턴스<br>
여기서 꿀팁 변수 이름 선정할때 (동사로 시작)하는 캐멀 케이스로 선정<br>
</div>

</h3>생성자</h3>
<div>
ex) 클래스 안에 Phone(String model, int price){} 이런식으로 클래스를 호출할때 부르는 형식<br>
</div>

<h3>상속</h3>
<div>
부모 클래스는 기존과 동일 하지만<br>
자식 클래스는 class 자식클래스명 extends 부모클래스명 이런식으로 선언함<br>
ex) class Animal{...}    부모 클래스<br>
class Dog extends Animal{...} 자식 클래스<br>
부모 클래스에서 선언한 함수는 자식 클래스에서 사용 할 수는 있지만<br>
자식 클래스에서 선언한 함수는 부모 클래스에서 사용 할 수 없음<br>
클래스는 상속 받을 때 단 한개의 부모 클래스에서만 받을 수 있음 여러개 중복 상속 안됨<br>
</div>

<h3>overloading과 overriding</h3>
<div>
overriding은 부모 클래스로부터 상속받은 메소드의 내용을 변경해서 사용하는 것이다. 오버라이딩 부분 위에 @Override라고 선언해주는게 일반적<br>
overloading은 매소드 명은 갖지만 반환타입이라던지 파라미터 개수를 다르게 한다던지 해서 기존 메소드와 같지만 다른 메서드를 새롭게 정의하는 것이다.<br>
</div>

<h3>pakage</h3>
<div>
약간 html할때 css랑 script 나눠 놓는 느낌으로 pakage만들어서 함수 놓고 main에서 import 패키지명.함수명으로 import한다<br>
또한 main에서 패키지에 있는 함수를 부모로 해서 상속시킬때 자식 클래스 안에서 super.부모 클래스 함수 를 선엄함으로서 super로 부모클래스를 지명한다<br>
</div>
  
<h3>접근 제어자</h3>   
<div>
 클래스 내부에서 선언된 데이터의 부적절한 사용으로 부터 보호 하기 위한것 == 캡술화 라고 함<br>
-> private 해당 클래스에서만 사용 가능(private가 defalt값), protected 자식 클래스에서 사용 가능, public 제한 없음<br>
</div>

<h3>추상 클래스 구현체 없이 선언만 하는 클래스</h3>
<div>
class 선언시 abstract 붙임 함수 또한 abstract를 붙이는데 abstract를 붙인 함수는 안에 내용을 가질 수 없움<br>
추상 클래스이기에 main에서 변수로 선언 할 수가 없어서 자식 클래스를 만들어서 사용해야한다<br>
</div>
  
<h3>인터페이스</h3>
<div>
interface를 클래스 앞에 선언함 interface로 선언한 클래스는 안에 함수의 내용을 구성할 수가 없어서 선언만 하고 자식 클래스에서 구성해야 함<br>
자식 클래스를 구현할 때는 class 자식클래스명 implemets 부모클래스명{} 이런식으로 사용함<br>
메인에서 인터페이스로 선언한 함수를 호출? 하려면 instanceof를 사용함 ** instanceof는 형변환이다!!<br>
</div>
