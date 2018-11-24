package com.itheima.ssm.service;

import com.itheima.ssm.mapper.ItemMapper;
import com.itheima.ssm.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> queryItemList() throws Exception {
        return itemMapper.queryItemList();
    }
}
