package com.example.demo.order.mapper;

import com.example.demo.order.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    @Select("select * from ordermaster where emp = #{userName}")
    List<Order> findAllByEmp(@Param("userName") String userName);

//    @Insert("insert into (emp) values( #{userName} ) ")
//    void insertEmp(@Param("userName") String userName);



}
