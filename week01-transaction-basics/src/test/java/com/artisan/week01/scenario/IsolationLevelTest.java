package com.artisan.week01.scenario;

import com.artisan.week01.domain.Order;
import com.artisan.week01.repository.OrderRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Isolation;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TODO: 격리 수준별 트랜잭션 동작을 체험하는 테스트
 *
 * BabySteps 패턴으로 하나씩 구현해보세요:
 * 1. Dirty Read 재현 (READ_UNCOMMITTED)
 * 2. Non-repeatable Read 재현 (READ_COMMITTED)
 * 3. Phantom Read 재현 (REPEATABLE_READ)
 */
@SpringBootTest
class IsolationLevelTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    @DisplayName("TODO: Dirty Read 재현 - 커밋되지 않은 데이터 읽기")
    void dirtyRead_재현() {
        // TODO: Isolation.READ_UNCOMMITTED로 설정
        // 트랜잭션1에서 데이터 생성 후 커밋 전
        // 트랜잭션2에서 데이터를 읽을 수 있는지 확인

        // Hint: @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    }

    @Test
    @DisplayName("TODO: Non-repeatable Read 재현 - 같은 쿼리로 다른 결과")
    void nonRepeatableRead_재현() {
        // TODO: Isolation.READ_COMMITTED로 설정
        // 트랜잭션1에서 데이터 조회 후
        // 트랜잭션2에서 데이터 수정 후 커밋
        // 트랜잭션1에서 다시 조회했을 때 다른 값이 나오는지 확인

        // Hint: @Transactional(isolation = Isolation.READ_COMMITTED)
    }

    @Test
    @DisplayName("TODO: Phantom Read 재현 - 새로운 행이 나타남")
    void phantomRead_재현() {
        // TODO: Isolation.REPEATABLE_READ로 설정
        // 트랜잭션1에서 전체 목록 조회
        // 트랜잭션2에서 새 데이터 삽입 후 커밋
        // 트랜잭션1에서 다시 조회했을 때 새로운 행이 보이는지 확인

        // Hint: @Transactional(isolation = Isolation.REPEATABLE_READ)
    }

    @Test
    @DisplayName("TODO: SERIALIZABLE - 완벽한 격리, 하지만 성능 저하")
    void serializable_완벽한_격리() {
        // TODO: Isolation.SERIALIZABLE로 설정
        // 모든 동시성 문제가 해결되지만 성능이 저하됨을 체험

        // Hint: @Transactional(isolation = Isolation.SERIALIZABLE)
    }
}
