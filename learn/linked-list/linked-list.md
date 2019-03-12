# Linked List
## Introduction
- linear 데이터 구조로서 각각의 요소가 선형으로 연결된 다른 요소의 참조를 가지고 있는 데이터 구조이다
## Introduction - Singly Linked List
- 요소가 다음 요소의 참조만을 가지고 있음
- 요소에 엑세스 할 경우 처음부터 순차적으로 이동하기 때문에 O(N) 가 된다. 대신 삽입, 삭제에서의 성능이 좋다
## Add Operation - Singly Linked List
- 삽입 처리의 경우 추가할 요소의 참조를 다음 요소로 하고 이전 요소의 참조를 추가하는 요소로 설정하는 것으로 끝이기에 O(1)
