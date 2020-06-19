package com.maoc.dao;

import com.maoc.domain.Motor;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorDao {
    @Select("select * from motor where name = #{name}")
//    @Results(id="motorMap", value = {
//            @Result(column = "type", property = "type"),
//            @Result(id=true,column = "name",property = "name"),
//            @Result(column = "wet", property = "wet"),
//            @Result(column = "capacity", property = "capacity"),
//            @Result(column = "seat", property = "seat"),
//            @Result(column = "photo", property = "photo"),
//            @Result(column = "photo", property = "photo"),
//    })
    Motor findByName(String name);
}
