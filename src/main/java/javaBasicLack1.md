# 자바 기본, 중급 부족한 부분

## 자바 기본

자식도 부모 생성자 오버라이딩할 수 있자나 왜 못해??
- 생성자는 메서드가 아니라 '특수한 목적의 초기화 블록'
- 부모의 필드와 메서드는 자식에게 상속되지만, 생성자는 상속되지 않음. --> 상속되지 않는 걸 재정의(overriding) x
- 자식 클래스에서 부모 생성자 호출은 super 키워드로 명시적으로 호출

객체지향과 절차지향 중심의 차이
- 객체지향은 객체가 무엇을 할수 있는가
- 절차지향은 어떻게(순서대로) 처리할 것인가

## 자바 중급 1

왜 equals 오버라이딩할 때 hashCode도 반드시 같이 오버라이딩하는게 국룰이야?
- 동등한 객체는 같은 해시코드를 가져야 한다는 규약이 있기 때문.
- 자료구조는 내부적으로 hashCode를 먼저 보고, 그 다음 equals로 확인.

동일성, 동등성 차이- 동일성 있는데 동등성 왜씀?
- 서로 다른 인스턴스지만 같은 "의미"를 갖는 경우
    - ex) 두 사람의 이름이 "길동"으로 동일하지만 같은 사람을 의미한다면 equals로 비교해야 함.
- 컬렉션에서 정확한 동작을 위해
    - Set, Map, List.contains 같은 곳은 내부적으로 equals와 hashCode로 동작.
    - ==를 썼다면, 같은 값을 가진 객체가 있어도 찾을 수 없음.
- 불변 객체나 값 객체(Value Object)에 필수
    - Money, Point, Color 같은 객체는 값만 같으면 같다고 봐야함 ==> 동등성 필요

불변 객체
- 한번 생성되면 내부 상태(필드값)를 변경할 수 없는 객체 ==> 값 변경 불가
- 안정성, 재사용성, 스레드 안전, 디버깅 쉬움

String이 불변인데 왜 +로 더해?
- +는 기존 문자열을 바꾸지 않고 새 문자열 객체를 생성해서 동작하기 때문
- +가 반복 연산에서는 안 좋음 ==> StringBuidler 사용

String 에서 +연산자로 string계속 바꿀수 있는데 왜 StringBuilder씀?
- 문자열을 계속 바꿀 수 있어 보이지만, 실제로는 "바뀌는게 아니라 매번 새로운 객체가 생성" ==> StringBuilder 사용

박싱 언박싱 차이
- 박싱 : 기본형을 참조형으로 변환  /  언박싱 : 참조형을 기본형으로 변환
- 자바의 컬렉션은 객체만 저장 가능 ==> int를 Integer로 바꿔서 써야 (박싱)

enum 왜 써?
- 의미있는 상수 집합을 타입 안전하게 정의하기 위해서
- 코드 가독성 - 상수의 의미가 분명
- switch와 호환 => 가독성 좋은 분기 처리 가능

로컬데이트 타임 왜써?
- 기존의 값을 마음대로 바꿈, 날짜 연산 불편, 버그 유발 등의 문제점 해결
- 불변성 : 날짜를 바꾸면 기존 객체는 그대로, 새 객체 반환 => 스레드 안전
- 포맷과 파싱이 쉬움
- 다른 시간 타입과도 유연하게 변환 가능

날짜 클래스는 왜 불변이야?
- 스레드 안정성 확보
    - 불변 객체는 값을 바꿀 수 없기 때문에 공유해도 안전.
    - 여러 스레드가 동시에 참조해도 내부 값이 바뀌지 않음.
- 동등성 비교와 캐싱에 유리
    - 불변이기 때문에 equals 나 hashCode 구현이 안전하고 일관됨.
    - 캐싱하거나 키로 사용하는 경우(Map, Set)도 신뢰성 높음.

