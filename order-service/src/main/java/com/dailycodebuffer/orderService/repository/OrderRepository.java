package com.dailycodebuffer.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.orderService.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
