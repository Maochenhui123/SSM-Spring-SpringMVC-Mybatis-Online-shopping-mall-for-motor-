package com.maoc.service;

import com.maoc.domain.Inventory;
import com.maoc.domain.Motor;
import com.maoc.domain.Orders;

public interface OrderService {
    void insertOrder(Orders orders) throws Exception;

}
