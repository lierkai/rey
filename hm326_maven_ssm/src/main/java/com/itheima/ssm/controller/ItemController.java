package com.itheima.ssm.controller;


import com.itheima.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("item")
public class ItemController {


    @Autowired
    private ItemService itemService;

    @RequestMapping("itemList")
    public String queryItemList(Model model) throws Exception {
        model.addAttribute("itemList",itemService.queryItemList());
        return "itemList";
    }
}
