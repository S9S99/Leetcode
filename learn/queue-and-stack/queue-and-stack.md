# Queue and Stack
## First-in-first-out Data Structure
- FIFO 데이터 구조로 먼저 추가된 자료가 먼저 출력됨
- 삽입은 enqueue 삭제는 dequeue
## Queue - Implementation
- 큐를 구현할 때 head의 이동만 고려한다면 사이즈가 고정되어 있을 경우 문제가 생길 것
## Circular Queue
- 순환을 시켜서 head와 tail을 관리. 배열의 끝에 head/tail이 도달할 경우 배열의 처음으로 이동하는 형태로 구현
## Circular Queue - Implementation
- 배열과 head/tail 두개의 포인터를 이용해서 queue 구현
## Queue - Usage
## Queue and BFS
- Breadth-First Search. 노드에서 최단 경로 찾기. 큐를 이용한 선입선출로 
## Last-in-first-out Data Structure
- LIFO. top에 데이터가 순차적으로 push되고 pop할 경우 역순으로 하나씩 제거되는 자료구조
## Stack - Usage
- 보편적인 언어에는 빌드되어 있으니 재정의 할 필요는 없고 pop, push, get the top element가 
## Stack and DFS
- BFS와 유사하게 Depth-First Search로 경로 찾기
