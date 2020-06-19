package com.maoc.dao;

import com.maoc.domain.Dealer;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealerDao {

    @Select("select * from dealer where dealer_name=#{dealerName}")
    @Results(id = "dealerMap",value = {
            @Result(id = true, column = "dealer_id", property = "dealerId"),
            @Result(column = "dealer_name", property = "dealerName"),
            @Result(column = "province", property = "province"),
            @Result(column = "city", property = "city"),
            @Result(column = "telephone", property = "telephone"),
    })
    Dealer findByDealerName(String dealerName);

    @Select("select* from dealer where province=#{province}")
    @ResultMap(value = {"dealerMap"})
    List<Dealer> findByProvince(String province);
}
