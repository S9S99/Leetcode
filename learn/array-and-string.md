# Array and String
## Introduction to Array
- array란 순차적으로 요소를 저장하는 자료구조
- index로 접근 가능하며 1차원 이상의 차원을 가질 수 있음
## Introduction to Dynamic Array
- 가변형 크기를 가진 array
- C++에서는 vector, Java에서는 ArrayList가 Dynamic Array로 되어있음
## Introduction to 2D Array
- 2차원 배열. 직사각형 형태의 배열
- 내부적으로는 1차원 배열(C++의 경우에는 1차원으로 되어있는 구조. JAVA의 경우는 1차원 배열의 요소가 1차원 배열인 형태)
## Introduction to String
- String은 unicode characters를 요소라 가지는 배열
- operator overloading이 되어있는 언어는 String 비교가 가능(C++은 가능 JAVA는 같은 객체인지 비교)
- 언어에 따라 변경 불가능한 경우도 존재 (JAVA에서 초기화한 String을 변경하는 것은 불가능)
- 문자를 요소로 가지는 배열이라 문자열 연산의 시간 복잡도는 문자열 길이가 N일 경우 O(N)
## Immutable String - Problems & Solutions
- 문자열 수정이 불가능한 언어에서는 문자 하나만 수정 불가능
- JAVA와 같이 수정 불가능한 언어의 경우 문자열을 연결할 경우 실제 문자열을 연결하는게 아니라 새 문자열을 생성해서 기존 문자열을 복사하는 형태로 연결하기 때문에 시간 복잡도가O(n^2)이 되기 때문에 가능한 언어보다 느려진다
- 해결 : char\[\] str 형태로 문자를 문자 배열로 선언
- 해결 : 다른 데이터형을 사용 (예. StringBuilder)
## Two-pointer Technique - Scenario I
- 포인터를 두개를 사용해서 배열 접근
- 정렬 등에 활용 가능
## Two-pointer Technique - Scenario II
- 기본적으로 위와 같으나 두 포인터의 이동을 각각 다른 방법으로 사용 (ex. 하나는 계속 고정 상태이거나 둘 다 각각의 다른 이동 속도를 가지는 등)
