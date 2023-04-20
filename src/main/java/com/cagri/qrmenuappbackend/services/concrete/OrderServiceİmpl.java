package com.cagri.qrmenuappbackend.services.concrete;

import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.entities.Order;
import com.cagri.qrmenuappbackend.repository.OrderRepository;
import com.cagri.qrmenuappbackend.services.abstracts.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderServiceİmpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public DataResult<List<Order>> getListOrder() {
        return null;
    }

    @Override
    public Result addOrder() {
        return null;
    }
}
