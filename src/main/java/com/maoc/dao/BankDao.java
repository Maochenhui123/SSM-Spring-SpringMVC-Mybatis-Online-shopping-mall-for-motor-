package com.maoc.dao;

import com.maoc.domain.Bank;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankDao {

    @Select("select* from bank")
    @Results(id = "bankMap",value = {
            @Result(id = true, column = "card_id",property = "cardId"),
            @Result(column = "balance",property = "balance")
    })
    List<Bank> findAll();

    @Select("select* from bank where card_id=#{cardId} for update")
    @ResultMap(value={"bankMap"})
    Bank findById(String id);

    @Update("update bank set balance = #{balance} where card_id = #{cardId}")
    @ResultMap(value={"bankMap"})
    void updateBank(Bank bank);
}
