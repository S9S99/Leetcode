# Linked List
## Introduction
- linear 데이터 구조로서 각각의 요소가 선형으로 연결된 다음 요소의 참조를 가지고 있는 데이터 구조이다
## Introduction - Singly Linked List
- 요소가 다음 요소의 참조만을 가지고 있음
- 요소에 엑세스 할 경우 처음부터 순차적으로 이동하기 때문에 O(N) 가 된다. 대신 삽입, 삭제에서의 성능이 좋다
## Add Operation - Singly Linked List
- 삽입 처리의 경우 추가할 요소의 참조를 다음 요소로 하고 이전 요소의 참조를 추가하는 요소로 설정하는 것으로 끝이기에 O(1)
## Delete Operation - Singly Linked List
- 삭제하는 요소의 이전 요소의 참조를 삭제하는 요소 다음 요소의 참조로 연결. 순회가 필요하기 때문에 시간 복잡도는 O(N)이지만 포인터만 저장하면 되기에 공간 복잡도는 O(1)가 된다
- 첫번째 노드 삭제는 두번째 노드를 헤드로 만드는 것으로 끝
## Summary - Two-Pointer in Linked List
- 항상 다음 필드를 호출하기 전에 null 검사를 하라, 순회하면서 무한루프가 될 가능성이 있으니 루프 끝 조건을 명확히 하라
- 공간복잡성은 O(1). 시간복잡성은 O(N)이 된다
## Reverse Linked List
- 링크드 리스트 역순. 헤드 이외의 노드를 순서대로 헤드로 만들어서 시간복잡도 O(N). 공간 복잡도 O(1)
## Summary - Linked List Classic Problems
- 포인트를 여러개 사용해서 문제를 해결하자
## Introduction - Doubly Linked List
- linear 데이터 구조로서 각각의 요소가 선형으로 연결된 이전 요소와 다음 요소의 참조를 가지고 있는 데이터 구조이다
- Linked List에서는 삭제나 삽입 시 다음 요소만 고려하면 되었지만 이 경우에는 전후의 요소를 전부 이어줘야 한다
## Add Operation - Doubly Linked List
- 삽입 시 새 노드의 next와 prev를 연결 시켜준 뒤 이전 노드의 next와 다음 노드의 prev를 새 노드에 연결 시켜준다
## Delete Operation - Doubly Linked List
- 삭제할 노드의 이전 노드와 다음 노드를 연결
## Summary - Linked List
- 노드의 추가/삭제에서 유리함. O(1). 싱글 링크드 리스트일 경우 삭제가 O(N)
- 인덱스로 노드에 접근할 경우가 많은 경우는 불리함. 노드에 접근할 때 최초노드부터 순회하게 되므로 O(N)
