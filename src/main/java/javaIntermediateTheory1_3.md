# 자바 중급 강의 1_3

## 9. 예외처리 1 - 이론

프로그램 실행 중에 발생할 수 있는 예상치 못한 상황, 즉 예외를 처리하기 위한 메커니즘을 제공한다.
프로그램의 안정성과 신뢰성을 높이는 데 중요한 역할을 한다.

사용하는 키워드
- try, catch, finally, throw, throws

체크 예외 vs 언체크 예외(런타임 예외)
- 체크 예외는 발생한 예외를 개발자가 명시적으로 처리해야 한다.(안하면 컴파일 오류 발생)
- 언체크 예외는 개발자가 발생한 예외를 명시적으로 처리하지 않아도 된다.

상속 관계에서 부모 타입은 자식을 담을 수 있다. 이 개념이 예외처리에도 적용된다.
상위 예외를 catch로 잡으면 그 하위 예외까지 함께 잡는다.
따라서 애플리케이션 로직은 Exception부터 필요한 예외로 생각하고 잡으면 된다.

### 예외에 대한 2가지 기본 규칙
- 예외는 잡아서 처리하거나 밖으로 던져야 한다. 예외 = 폭탄 돌리기.
- 예외를 잡거나 던질 때 지정한 예외뿐만 아니라 그 예외의 자식들도 함께 처리할 수 있다.

자바 main() 밖으로 예외를 던지면 예외 로그를 출력하면서 시스템이 종료된다.

체크 예외
- 체크 예외는 잡아서 처리하거나, 밖으로 던지도록 선언해야 한다. (RuntimeException은 예외로 한다.)
- 예외 클래스를 만들려면 예외를 상속 받으면 된다.
- Exception을 상속받은 예외는 체크 예외가 된다.
- throw예외 라고 하면 새로운 예외를 발생시킬 수 있다. 예외도 객체이기 때문에 객체를 먼저 new로 생성하고 예외를 발생시켜야 한다.
- throws예외는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드이다.
- throw, throws 의 차이에 주의하자.
- 예외가 제공하는 기본 기능이 있는데, 그 중에 오류 메시지를 보관하는 기능도 있다. 생성자를 통해서 해당 기능을 그대로 사용 가능하다.

### 체크 예외를 잡아서 처리하는 코드 - callCatch()
- 예외를 잡아서 처리하려면 try~catch를 사용해서 예외를 잡으면 된다.
- try코드 블럭에서 발생하는 예외를 잡아서 catch로 넘긴다.
- 만약 try에서 잡은 예외가 catch의 대상에 없으면 예외를 잡을 수 없다. 이때는 예외를 밖으로 던져야 한다.
- catch는 해당 타입과 그 하위 타입을 모두 잡을 수 있다.
- 예외도 객체이기 때문에 다형성이 적용된다.

체크 예외를 밖으로 던지지 않으면 컴파일 오류 발생
- 체크 예외를 밖으로 던지는 경우에도 해당 타입과 그 하위 타입을 모두 던질 수 있다.

체크 예외의 장단점
- 체크 예외는 예외를 잡아서 처리할 수 없을 때, 예외를 밖으로 던지는 throws예외 를 필수로 선언해야 한다. 안하면 컴파일 오류 발생.
- 장점 : 개발자가 실수로 예외를 누락하지 않도록 컴파일러를 통해 문제를 잡아주는 훌륭한 안전장치.
- 단점 : 실제로는 개발자가 모든 체크 예외를 반드시 잡거나 던지도록 처리해야. 너무 번거롭고 처리해야할 예외 모두 챙겨야.

### 언체크 예외

- 예외를 잡아서 처리하지 않아도 throws키워드 생략 가능.
- 체크 예외와 실행 결과는 완전히 동일.
- 컴파일러가 체크하지 않기 때문에 언체크 예외이다.
- 장점 : 신경쓰고 싶지 않은 언체크 예외 무시 가능.
- 단점 : 언체크 예외는 개발자가 실수로 예외 누락 가능.

체크 예외와 언체크 예외의 차이는 예외를 처리할 수 없을 때 예외를 밖으로 던지는 부분에 있다.
이 부분을 필수로 선언해야 하는가 생략할 수 있는가의 차이다.


## 10. 예외처리 2 - 실습

### 예외 처리 도입 1 - 시작
- 예외도 객체이다. 따라서 필요한 필드와 메서드를 가질 수 있다.
- 오류 코드
    - 이전에는 오류 코드를 반환값으로 리턴해서, 어떤 오류가 발생했는지 구분했다.
    - 어떤 종류의 오류가 발생했는지 구분하기 위해 예외 안에 오류 코드를 보관한다.
- 오류 메시지
    - 오류 메시지에는 어떤 오류가 발생했는지 개발자가 보고 이해할 수 있는 설명을 담아둔다.
    - 오류 메시지는 상위 클래스인 Throwable에서 기본으로 제공하는 기능을 사용한다.
- 만든 예외 객체를 throw를 통해 던진다.

### 예외 처리 도입 3 - 정상, 예외 흐름 분리
- 하나의 try안에 정상 흐름을 모두 담는다.
- 예외 부분은 catch 블럭에서 해결한다.
- 정상 흐름은 try 블럭에 들어가고, 예외 흐름은 catch 블럭으로 명확하게 분리 가능.

외부 연결과 같은 자바 외부의 자원은 자동으로 해제되지 않는다.
외부 자원을 사용한 후에는 연결을 해제하여 외부 자원을 반드시 반납해야 한다.

### 예외 처리 도입 5 - finally
- 자바는 어떤 경우라도 반드시 호출되는 finally 기능을 제공한다.
- finally 코드 블럭이 끝나고 나서 이후에 예외가 밖으로 던져짐.
- 주로 try에서 사용한 자원을 해제할 때 주로 사용한다. 

자바 예외 처리는 try ~ catch ~ finally 구조를 사용해서 처리할 수 있다.
- 정상 흐름과 예외 흐름을 분리해서, 코드를 읽기 쉽게 만든다.
- 사용한 자원을 항상 반환할 수 있도록 보장해준다.

예외를 계층화하고 다양하게 만들면 더 세밀한 동작들을 깔끔하게 처리할 수 있다. 
그리고 특정 분류의 공통 예외들도 한번에 catch로 잡아서 처리할 수 있다.
처리할 수 없는 예외들은 중간에 여러 곳에서 나누어 처리하기 보다는 예외를 공통으로 처리할 수 있는 곳을 만들어서 한 곳에서 해결하면 된다.

Try with resources 장점
- 리소스 누수 방지
- 코드 간결성 및 가독성 향상
- 스코프 범위 한정
- 조금 더 빠른 자원 해제

