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
