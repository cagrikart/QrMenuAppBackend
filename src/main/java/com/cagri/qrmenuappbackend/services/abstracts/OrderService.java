package com.cagri.qrmenuappbackend.services.abstracts;

import com.cagri.qrmenuappbackend.entities.Order;

import java.util.List;

import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;

public interface OrderService {
    DataResult<List<Order>> getListOrder();
    Result addOrder();

}