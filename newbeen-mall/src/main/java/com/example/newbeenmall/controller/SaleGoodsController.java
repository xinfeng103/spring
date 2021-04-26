package com.example.newbeenmall.controller;

import com.example.newbeenmall.entity.SaleGoods;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleGoodsController {
    @RequestMapping(value = "/test/httpmessageconverter",method = RequestMethod.POST)
    public SaleGoods httpMessageConverterTest(@RequestBody SaleGoods saleGoods) {
        System.out.println(saleGoods.toString());
        saleGoods.setType(saleGoods.getType()+1);
        saleGoods.setGoodsName("商品名："+saleGoods.getGoodsName());
        return saleGoods;
    }
}
