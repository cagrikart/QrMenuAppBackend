package com.cagri.qrmenuappbackend.repository;

import com.cagri.qrmenuappbackend.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}

