package com.artisan.week01.scenario;

import com.artisan.week01.domain.Order;
import com.artisan.week01.domain.OrderLog;
import com.artisan.week01.repository.OrderLogRepository;
import com.artisan.week01.repository.OrderRepository;
import com.artisan.week01.service.OrderService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * TODO: 전파 속성별 트랜잭션 동작을 체험하는 테스트
 *
 * BabySteps 패턴으로 하나씩 구현해보세요:
 * 1. REQUIRED - 같은 트랜잭션 참여
 * 2. REQUIRES_NEW - 독립적인 트랜잭션
 * 3. NESTED - 중첩 트랜잭션
 */
@SpringBootTest
class PropagationTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderLogRepository orderLogRepository;

    @Test
    @DisplayName("TODO: REQUIRED - 주문과 결제가 같은 트랜잭션으로 처리됨")
    void REQUIRED_주문과_결제_같은_트랜잭션() {
        // TODO: 결제 실패 시 주문도 롤백되는지 확인
        // Hint: processPayment 내부에서 예외 발생시키기
    }

    @Test
    @DisplayName("TODO: REQUIRES_NEW - 로그는 독립적으로 커밋됨")
    void REQUIRES_NEW_로그는_독립적으로_커밋() {
        // TODO: 주문 실패해도 로그는 남는지 확인
        // Hint: OrderService.logOrderAction 사용
    }

    @Test
    @DisplayName("TODO: NESTED - 부분 롤백 가능")
    void NESTED_부분_롤백_가능() {
        // TODO: 내부 트랜잭션 롤백 시 외부 트랜잭션은 유지되는지 확인
        // Hint: @Transactional(propagation = Propagation.NESTED)
    }

    @Test
    @DisplayName("TODO: 실무 시나리오 - 주문 생성부터 로그 기록까지")
    void 실무_시나리오_주문_프로세스() {
        // TODO: 실제 주문 프로세스 구현
        // 1. 주문 생성 (REQUIRED)
        // 2. 결제 처리 (REQUIRED)
        // 3. 로그 기록 (REQUIRES_NEW)
    }
}
