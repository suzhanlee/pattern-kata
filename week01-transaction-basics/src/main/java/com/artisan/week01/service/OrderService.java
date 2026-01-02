package com.artisan.week01.service;

import com.artisan.week01.domain.Order;
import com.artisan.week01.domain.OrderLog;
import com.artisan.week01.domain.Payment;
import com.artisan.week01.repository.OrderLogRepository;
import com.artisan.week01.repository.OrderRepository;
import com.artisan.week01.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;
    private final OrderLogRepository orderLogRepository;

    @Transactional
    public Order createOrder(Long userId, Integer amount) {
        Order order = Order.builder()
                .userId(userId)
                .amount(amount)
                .status(Order.OrderStatus.PENDING)
                .build();
        return orderRepository.save(order);
    }

    @Transactional
    public Payment processPayment(Long orderId, Integer amount) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Order not found"));

        Payment payment = Payment.builder()
                .orderId(orderId)
                .amount(amount)
                .status(Payment.PaymentStatus.PENDING)
                .build();

        payment = paymentRepository.save(payment);

        // 결제 성공 시 주문 상태 변경
        order.setStatus(Order.OrderStatus.PAID);
        orderRepository.save(order);

        payment.setStatus(Payment.PaymentStatus.SUCCESS);
        return paymentRepository.save(payment);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void logOrderAction(Long orderId, String action) {
        OrderLog log = OrderLog.builder()
                .orderId(orderId)
                .action(action)
                .build();
        orderLogRepository.save(log);
    }
}
