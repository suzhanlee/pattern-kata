# 16주 학습 로드맵 상세

## Phase 1: 트랜잭션 & 동시성 제어 (Week 1-4)

### Week 1: Transaction Basics
- **핵심 개념**: ACID, 격리 수준, 전파 속성
- **실습**: Dirty Read, Non-repeatable Read, Phantom Read 재현
- **체감 난이도**: ⭐⭐

### Week 2: Race Condition + Optimistic Lock
- **핵심 개념**: @Version, OptimisticLockException
- **실습**: 동시 재고 차감, 재시도 전략
- **체감 난이도**: ⭐⭐⭐

### Week 3: Pessimistic Lock + Deadlock
- **핵심 개념**: SELECT FOR UPDATE, 데드락
- **실습**: 데드락 재현, 락 순서 통일
- **체감 난이도**: ⭐⭐⭐⭐

### Week 4: Distributed Lock
- **핵심 개념**: DB Named Lock, Redis Distributed Lock
- **실습**: 쿠폰 발급 시스템
- **체감 난이도**: ⭐⭐⭐⭐

---

## Phase 2: 캐싱 전략 (Week 5-8)

### Week 5: Redis Basics
- **핵심 개념**: String, Hash, Set, Sorted Set, Pub/Sub
- **실습**: 조회수, 좋아요, 랭킹
- **체감 난이도**: ⭐⭐⭐

### Week 6: Cache Aside
- **핵심 개념**: Spring Cache, Cache Stampede
- **실습**: 상품 조회 캐싱
- **체감 난이도**: ⭐⭐⭐

### Week 7: Write Behind + Cache Invalidation
- **핵심 개념**: 비동기 DB 반영, 캐시 무효화
- **실습**: 조회수 집계
- **체감 난이도**: ⭐⭐⭐⭐

### Week 8: Redis Advanced
- **핵심 개념**: 영속성, Replication, Sentinel
- **실습**: Master-Slave 구성
- **체감 난이도**: ⭐⭐⭐⭐⭐

---

## Phase 3: 회복탄력성 (Week 9-11)

### Week 9: Circuit Breaker + Retry
- **핵심 개념**: Resilience4j, Circuit Breaker
- **실습**: 외부 API 장애 대응
- **체감 난이도**: ⭐⭐⭐

### Week 10: Bulkhead + Rate Limiting
- **핵심 개념**: 스레드풀 격리, Token Bucket
- **실습**: Bucket4j 속도 제한
- **체감 난이도**: ⭐⭐⭐⭐

### Week 11: Message Queue
- **핵심 개념**: RabbitMQ, At-least-once
- **실습**: 주문 이벤트 발행
- **체감 난이도**: ⭐⭐⭐⭐

---

## Phase 4: 데이터베이스 튜닝 (Week 12-13)

### Week 12: Index + EXPLAIN
- **핵심 개념**: B-Tree, 복합 인덱스, 커버링 인덱스
- **실습**: EXPLAIN 분석
- **체감 난이도**: ⭐⭐⭐

### Week 13: Query Tuning
- **핵심 개념**: Slow Query, 서브쿼리 최적화
- **실습**: Cursor 기반 페이징
- **체감 난이도**: ⭐⭐⭐⭐

---

## Phase 5: Observability (Week 14-16)

### Week 14: Logging + Metrics
- **핵심 개념**: 구조화 로깅, MDC, Prometheus
- **실습**: 로그 추적, 메트릭 수집
- **체감 난이도**: ⭐⭐⭐

### Week 15: Distributed Tracing + APM
- **핵심 개념**: Zipkin, OpenTelemetry
- **실습**: 분산 추적
- **체감 난이도**: ⭐⭐⭐⭐

### Week 16: Profiling + Load Test
- **핵심 개념**: JProfiler, Gatling
- **실습**: 부하 테스트
- **체감 난이도**: ⭐⭐⭐⭐⭐

---

## 학습 팁

1. **TinyExperiment**: 먼저 최소한의 코드로 동작을 확인
2. **BabySteps**: 한 번에 모든 것을 하려 하지 말기
3. **AtomicCommit**: 의미 있는 단위로 커밋
4. **ThinkingMirror**: 매주 REFLECTION.md에 회고 작성
