# Week 1: Transaction Basics

## 🎯 학습 목표
- 트랜잭션 격리 수준 체감하기 (Dirty Read, Non-repeatable Read, Phantom Read)
- 전파 속성별 동작 차이 이해하기 (REQUIRED, REQUIRES_NEW, NESTED)

## 📚 사전 학습
- `docs/theory.md` 읽기 (15분)

## 🔬 실습 순서

1. **격리 수준 실습** (TinyExperiment 패턴)
   - `IsolationLevelTest` 작성
   - 각 격리 수준에서 발생하는 현상 체험

2. **전파 속성 실습** (BabySteps 패턴)
   - `PropagationTest` 작성
   - 각 전파 속성별 트랜잭션 동작 확인

3. **실무 시나리오** (AtomicCommit 패턴)
   - 주문 생성 + 결제 로직 구현
   - 커밋 로그 남기며 단계별 진행

## ✅ 완료 기준
- [ ] 3가지 격리 수준 차이 체감 (Dirty Read, Non-repeatable Read, Phantom Read)
- [ ] 3가지 전파 속성 동작 확인 (REQUIRED, REQUIRES_NEW, NESTED)
- [ ] REFLECTION.md에 학습 회고 작성

## 🔗 연결되는 주차
- **Week 2**: Race Condition (트랜잭션만으로는 해결 안 되는 문제 체험)

## 📁 프로젝트 구조

```
src/main/java/com/artisan/week01/
├── Week01Application.java
├── domain/
│   ├── Order.java
│   ├── Payment.java
│   └── OrderLog.java
├── repository/
│   ├── OrderRepository.java
│   ├── PaymentRepository.java
│   └── OrderLogRepository.java
└── service/
    └── OrderService.java

src/test/java/com/artisan/week01/scenario/
├── IsolationLevelTest.java
└── PropagationTest.java
```

## 🚀 실행 방법

```bash
# 빌드
../../gradlew build

# 테스트 실행
../../gradlew test

# 애플리케이션 실행
../../gradlew bootRun
```
