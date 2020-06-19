package com.maoc.dao;

import com.maoc.domain.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {

    @Insert("INSERT INTO orders VALUES (#{orderId},#{firstName},#{lastName},#{telephone},#{dealerId},#{name})")
    @Results(id="orderMap", value = {
            @Result(id=true, column = "order_id",property = "orderId"),
            @Result(column = "first_name",property = "firstName"),
            @Result(column = "last_name",property = "lastName"),
            @Result(column = "telephone",property = "telephone"),
            @Result(column = "dealer_id",property = "dealerId"),
            @Result(column = "name",property = "name")
    })
    void insertOrder(Orders order);
}
