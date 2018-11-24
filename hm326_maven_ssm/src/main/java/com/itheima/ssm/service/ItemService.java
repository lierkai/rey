package com.itheima.ssm.service;

import com.itheima.ssm.pojo.Item;

import java.util.List;

public interface ItemService {

    List<Item> queryItemList () throws Exception;
}
