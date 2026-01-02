# 트랜잭션 기초 이론

## ACID

- **Atomicity (원자성)**: 트랜잭션은 모두 성공하거나 모두 실패해야 한다
- **Consistency (일관성)**: 트랜잭션 전후로 데이터베이스의 일관성이 유지되어야 한다
- **Isolation (격리성)**: 동시 실행되는 트랜잭션끼리 서로 영향을 미치지 않아야 한다
- **Durability (지속성)**: 커밋된 데이터는 영구적으로 저장되어야 한다

## 격리 수준 (Isolation Levels)

### READ_UNCOMMITTED
- 커밋되지 않은 데이터를 읽을 수 있음
- **Dirty Read** 발생 가능

### READ_COMMITTED (MySQL Default)
- 커밋된 데이터만 읽을 수 있음
- **Non-repeatable Read** 발생 가능
- Dirty Read 방지

### REPEATABLE_READ (PostgreSQL Default)
- 같은 데이터를 여러 번 읽을 때 항상 같은 값 반환
- **Phantom Read** 발생 가능
- Non-repeatable Read 방지

### SERIALIZABLE
- 가장 높은 격리 수준
- Phantom Read 방지
- 성능 저하

## 전파 속성 (Propagation)

### REQUIRED (Default)
- 이미 진행 중인 트랜잭션이 있으면 참여, 없으면 새로 시작
- 가장 흔하게 사용

### REQUIRES_NEW
- 항상 새로운 트랜잭션 시작
- 진행 중인 트랜잭션이 있으면 일시 중단

### NESTED
- 진행 중인 트랜잭션이 있으면 중첩 트랜잭션 시작
- 외부 트랜잭션에 영향받지만, 내부 롤백은 외부에 영향 안 줌

### SUPPORTS
- 진행 중인 트랜잭션이 있으면 참여, 없으면 non-transactional로 실행

### NOT_SUPPORTED
- non-transactional로 실행
- 진행 중인 트랜잭션이 있으면 일시 중단

### MANDATORY
- 반드시 트랜잭션 내에서 실행되어야 함
- 없으면 예외 발생

### NEVER
- 트랜잭션 내에서 실행되면 안 됨
- 트랜잭션이 있으면 예외 발생
