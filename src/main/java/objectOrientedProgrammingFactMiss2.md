# 객체지향의 사실과 오해   2

## 4. 역할, 책임, 협력

개인이 처해 있는 정황 또는 문맥(context)(= 타인과의 협력)이 인간의 행동 방식 결정.
객체의 모양을 빚는 것은 객체가 참여하는 협력.
어떤 협력에 참여하는지가 객체에 필요한 행동을 결정, 필요한 행동이 객체의 상태를 결정.
개별적인 객체의 행동이나 상태가 아니라 객체들 간의 협력에 집중.

### 협력

협력은 한 사람이 다른 사람에게 도움을 요청시 시작된다.
요청을 받은 사람은 일을 처리한 후 요청한 사람에게 필요한 지식이나 서비스를 제공하는 것으로 요청에 응답.
협력은 다수의 요청과 응답으로 구성.
전체적으로 협력은 다수의 연쇄적인 요청과 응답의 흐름으로 구성.

### 책임

객체지향의 세계에서는 어떤 객체가 어떤 요청에 대해 대답해줄 수 있거나, 적절한 행동을 할 의무가 있는 경우 해당 객체가 책임을 가진다고 말한다.
어떤 대상에 대한 요청은 그 대상이 요청을 처리할 책임이 있음을 암시한다.

책임의 분류
- 하는 것(doing)
    - 객체를 생성하거나 계산을 하는 등의 스스로 하는 것
    - 다른 객체의 행동을 시작시키는 것
    - 다른 객체의 활동을 제어하고 조절하는 것
- 아는 것(knowing)
  - 개인적인 정보에 관해 아는 것
  - 관련된 객체에 관해 아는 것
  - 자신이 유도하거나 계산할 수 있는 것에 관해 아는 것

책임은 객체지향 설계의 품질을 결정하는 가장 중요한 요소이다.
객체의 책임을 이야기할 때는 일반적으로 외부에서 접근 가능한 공용 서비스의 관점에서 이야기한다. 
즉, 책임은 객체의 외부에 제공해 줄 수 있는 정보(아는 것의 측면)와 외부에 제공해 줄 수 있는 서비스(하는 것의 측면)의 목록이다.
책임은 객체의 공용 인터페이스를 구성한다.
객체가 다른 객체에게 주어진 책임을 수행하도록 요청을 보내는 것을 '메시지 전송'이라고 한다.
객체지햘 설계는 협력에 참여하기 위해 어떤 객체가 어떤 책임을 수행해야 하고 어떤 객체로부터 메시지를 수신할 것인지를 결정하는 것으로부터 시작된다.

### 역할

역할의 개념을 사용하면 유사한 협력을 추상화해서 인지 과부하를 줄일 수 있다.
다양한 객체들이 협력에 참여 가능하기 때문에 협력이 좀 더 유연해지며 다양한 객체들이 동일한 협력에 참여할 수 있기 때문에 재사용성이 높아진다.
역할은 객체지향 설계의 '단순성', '유연성', '재사용성' 을 뒷받침하는 핵심 개념이다.
역할의 가장 큰 가치는 하나의 협력 안에 여러 종류의 객체가 참여할 수 있게 함으로써 협력을 추상화할 수 있다는 것이다.

객체의 행위에 초점을 맞추기 위해서는 협력이라는 실행 문맥 안에서 책임을 분배해야 한다.
객체지향 시스템에서 가장 중요한 것은 충분히 자율적인 동시에 충분히 협력적인 객체를 창조하는 것이다.

### 객체지향 설계 기법

책임 - 주도 설계
- 협력에 필요한 책임들을 식별하고 적합한 객체에게 책임을 할당하는 방식

디자인 패턴
- 전문가들이 반복적으로 사용하는 해결 방법을 정의해 놓은 설계 템플릿의 모음

테스트 - 주도 개발
- 테스트를 먼저 작성하고 테스트를 통과하는 구체적인 코드를 추가하면서 애플리케이션을 완성해가는 방식



## 5. 책임과 메시지

### 책임감 분산
- 사건에 대한 목격자가 많으면 많을수록 개인이 느끼는 책임감은 적어진다
- 사건을 목격한 사람이 자기 혼자일 경우에는 자신에게 타인을 도와야 하는 책임이 있다고 생각한다.

### 자율적인 책임

- 자율성
  - '자기 스스로의 원칙에 따라 어떤 일을 하거나 자신을 통제해서 절제하는 성질이나 특성'
  - 반대말은 '타율성' == '자신의 의지와 관계없이 정해진 규율이나 원칙에 따라서만 움직이는 성질'

객체가 책임을 자율적으로 수행하기 위해서는 객체에게 할당되는 책임이 자율적이어야한다.
책임이 자율적이지 않다면 객체가 아무리 발버둥친다고 하더라도 자율적으로 책임을 수행하기 어렵다.

- 객체지향 세계 = 자율적인 객체들의 공동체
- 객체가 자율적이기 위해서는 객체에게 할당되는 책임의 수준 역시 자율적이어야 한다.

추상적이고 포괄적인 책임은 협력을 좀 더 다양한 환경에서 재사용할 수 있도록 유연성을 가진다.
그러나 책임은 협력에 참여하는 의도를 명확하게 설명할 수 있는 수준 안에서 추상적이어야 한다.
성급한 일반화의 오류를 피하고 현재의 문맥에 가장 적합한 책임을 선택할 수 있는 날카로운 안목을 길러야 한다.
자율적인 책임의 특징은 객체가 '어떻게'해야 하는가가 아니라 '무엇'을 해야 하는가를 설명한다는 것이다.
책임이라는 말 속에는 어떤 행동을 수행한다는 의미가 포함돼 있다.
메시지는 객체로 하여금 자신의 책임, 즉 행동을 수행하게 만드는 유일한 방법이다.

### 메시지

메시지는 객체들이 서로 협력하기 위해 사용할 수 있는 유일한 의사소통 수단이다.
객체가 메시지를 수신할 수 있다는 것은 객체가 메시지에 해당하는 책임을 수행할 수 있다는 것을 의미한다.
객체가 유일하게 이해할 수 있는 의사소통 수단은 메시지 뿐이며 객체는 메시지를 처리하기 위한 방법을 자율적으로 선택할 수 있다.
외부의 객체는 메시지에 관해서만 볼 수 있고 객체 내부는 볼 수 없기 때문에 자연스럽게 객체의 외부와 내부가 분리된다.
메시지는 '어떻게' 수행될 것인지는 명시하지 않는다. 
메시지는 단지 오퍼레이션을 통해 '무엇'이 실행되기를 바라는지만 명시하며, 어떤 메서드를 선택할 것인지는 전적으로 수신자의 결정에 좌우된다.
메시지를 수신한 객체가 실행 시간에 메서드를 선택할 수 있다는 사실은 다른 프로그래밍 언어와 객체지향 프로그래밍 언어를 구분 짓는 핵심적인 특징 중 하나이다.
이것은 프로시저 호출에 대한 실행 코드를 컴파일 시간에 결정하는 절차적인 언어와 확연히 구분되는 특징이다.

다형성
- 서로 다른 타입에 속하는 객체들이 동일한 메시지를 수신할 경우 서로 다른 메서드를 이용해 메시지를 처리할 수 있는 메커니즘.
- 동일한 역할을 수행할 수 있는 객체들 사이의 대체 가능성을 의미.
- 수신자의 종류를 캡슐화
- 메시지를 이해할 수 있는 어떤 객체와도 협력할 수 있는 유연하고 확장 가능한 구조를 만들 수 있다.
- 협력을 유연하게 만들 수 있다 --> 객체지향 패러다임이 강력한 이유

송신자가 수신자에 대해 매우 적은 정보만 알고 있더라도 상호협력이 가능하다는 사실
- 협력이 유연해진다.
- 협력이 수행되는 방식을 확장할 수 있다.
- 협력이 수행되는 방식을 재사용할 수 있다.

유연하고 확장 가능하고 재사용성이 높은 협력을 가능케 하는것
- >다형성을 지탱하는 메시지가 존재하기 때문에

데이터 - 주도 설계
- 객체 외부에서는 몰라도 되는 객체 내부 구조의 변경이 외부의 협력자에게까지 파급

책임 - 주도 설계
- 객체지향 설계는 적절한 책임을 적절한 객체에게 할당하면서 메시지를 기반으로 협력하는 객체들의 관계를 발견하는 과정.
- 책임을 완수하기 위해 협력하는 객체들을 이용해 시스템을 설계하는 방법.
- 메시지가 수신자의 책임을 결정한다.

What/Who 사이클
- 책임-주도 설계의 핵심은 어떤 행위가 필요한지를 먼저 결정한 후에 이 행위를 수행할 객체를 결정

테스트 - 주도 설계
- 메시지를 통한 인터페이스 발견

객체가 어떤 메시지를 수신하고 처리할 수 있느냐가 객체의 책임을 결정.


### 객체 인터페이스

인터페이스
- 인터페이스의 사용법을 익히기만 하면 내부 구조나 동작 방식을 몰라도 쉽게 대상을 조작하거나 의사 전달 가능.
- 인터페이스 자체는 변경하지 않고 단순히 내부 구성이나 작동 방식만을 변경하는 것은 인터페이스 사용자에게 어떤 영향도 미치지 않는다.
- 대상이 변경되더라도 동일한 인터페이스를 제공하기만 하면 아무런 문제 없이 상호작용할 수 있다.
- 객체의 인터페이스만 알면 객체의 내부 구조나 작동 방식을 몰라도 객체와 상호작용할 수 있다.

객체가 다른 객체와 상호작용할 수 있는 유일한 방법은 '메시지 전송'이다.
-> 겍체의 인터페이스는 객체가 수신할 수 있는 메시지의 목록으로 구성되며 객체가 어떤 메시지를 수신할 수 있는지가 객체가 제공하는 인터페이스의 모양을 가짐.

공용 인터페이스
- 내부에서만 접근 가능한 사적인 인터페이스와 구분하기 위해 외부에 공개된 인터페이스
- 모든 인터페이스는 메시지 전송을 통해서만 접근 가능.
- 객체가 협력에 참여하기 위해 수행하는 메시지가 객체의 공용 인터페이스의 모양을 암시.

객체 관점에서 생각하는 방법
- 좀 더 추상적인 인터페이스
- 최소 인터페이스
- 인터페이스와 구현 간에 차이가 있다는 점을 인식

구현
- 객체지향의 세계에서 내부 구조와 작동 방식을 가리키는 고유의 용어
- 객체를 구성하지만 공용 인터페이스에 포함되지 않는 모든 것

인터페이스와 구현의 분리 원칙
- 객체를 설계할 때 객체 외부에 노출되는 인터페이스와 객체의 내부에 숨겨지는 구현을 명확하게 분리해서 고려해야 한다.
- 소프트웨어는 항상 변경되기 때문에 중요.

객체가 가져야 할 상태와 메서드 구현은 객체 내부에 속한다.
수정을 하더라도 객체 외부에 영향을 미쳐서는 안된다.
객체 외부에 영향을 미치는 변경은 객체의 공용 인터페이스를 수정할 때 뿐이다.

캡슐화
- 정보 은닉
- 상태와 행위의 캡슐화 -- 데이터 캡슐화
  - 객체는 상태와 행동을 하나의 단위로 묶는 자율적인 실체.
- 사적인 비밀의 캡슐화
  - 객체의 공용 인터페이스는 외부에서 전송 가능한 메시지의 집합.
  - 캡슐화는 공용 인터페이스를 제공하는 캡슐 내부로 비밀을 숨긴다.
  
자율적인 책임의 특성은 자율적인 책임을 수행하게 하는 메시지의 특성과 연결된다.

객체의 책임이 자율적일수록 협력이 이해하기 쉬워지고 유연하게 변경할 수 있게 된다.
책임의 자율성이 협력의 품질을 결정한다.
- 자율적인 책임은 협력을 단순하게 만든다.
- 자율적인 책임은 모자 장수의 외부와 내부를 명확하게 분리한다.
- 책임이 자율적일 경우 책임을 수행하는 내부적인 방법을 변경하더라도 외부에 영향을 미치지 않는다.
- 자율적인 책임은 협력의 대상을 다양하게 선택할 수 있는 유연성을 제공한다.
- 객체가 수행하는 책임들이 자율적일수록 객체의 역할을 이해하기 쉬워진다.

책임이 자율적일수록 적절하게 '추상화'되며, '응집도'가 높아지고, '결합도'가 낮아지며, '캡슐화'가 증진되고, '인터페이스와 구현이 명확히 분리'되며, 설계의 '유연성'과 '재사용성'이 향상된다.
객체지향의 강력함을 누리기 위한 출발점은 책임을 자율적으로 만드는 것이다.
이것은 우리가 선택하는 메시지에 따라 달라진다.
