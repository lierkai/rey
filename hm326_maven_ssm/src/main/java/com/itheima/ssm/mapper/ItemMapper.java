package com.itheima.ssm.mapper;

import com.itheima.ssm.pojo.Item;

import java.util.List;

public interface ItemMapper {

    List<Item> queryItemList () throws Exception;
}
