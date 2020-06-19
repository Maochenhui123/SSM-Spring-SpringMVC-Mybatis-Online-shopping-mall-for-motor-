package com.maoc.dao;

import com.maoc.domain.Inventory;
import com.maoc.domain.Item;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryDao {

    @Select("select * from inventory " +
            "inner join dealer on inventory.dealer_id = dealer.dealer_id " +
            "WHERE dealer_name = #{dealerName} AND name = #{name} ")
    @ResultMap(value = {"InventoryMap"})
    List<Inventory> findNumberfromdealer(Item item);

    @Select("select* from inventory where dealer_id=#{dealerId} and name=#{name} for update")
    @Results(id = "InventoryMap", value = {
            @Result(column = "dealer_id",property = "dealerId"),
            @Result(column = "name",property = "name"),
            @Result(column = "number",property = "number")
    })
    Inventory findByNameAndId(Inventory inventory);


    @Update("update inventory set number=#{number} where dealer_id=#{dealerId} and name = #{name}")
    @ResultMap(value = {"InventoryMap"})
    void updateInventory(Inventory inventory);
}
