package com.legou.manager.dao;

import com.legou.manager.pojo.po.TbOrderItem;
import com.legou.manager.pojo.po.TbOrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderItemMapper {
    int countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    TbOrderItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);

    List<TbOrderItem> listOrderItemsBypage(String orderId);
}