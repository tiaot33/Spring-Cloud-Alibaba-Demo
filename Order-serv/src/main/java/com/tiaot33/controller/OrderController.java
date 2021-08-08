package com.tiaot33.controller;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Description:
 * <p>TODO<p/>
 *
 * @author tiaot33
 * @see
 * @since 2021/8/7-17:59
 */
@RestController
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/order/create")
    public String createOrder(Integer productId,Integer userId){
        String url1 = "http://localhost:9000/product/" + productId.toString();
        String url2 = "http://localhost:10000/user/" + userId.toString();
        String url3 = "http://localhost:11000/stock/reduce/" + productId.toString();
        String url4 = "http://localhost:12000/shopcart/remove";
        HashMap<Object, Object> map = Maps.newHashMap();
        map.put("productId", productId);
        map.put("userId", userId);
        String product = restTemplate.getForObject(url1, String.class);
        String user = restTemplate.getForObject(url2, String.class);
        String s = restTemplate.getForObject(url3, String.class);
        String s1 = restTemplate.getForObject(url4, String.class, map);
        return "用户：[" + user + "], 购买商品：" + product+"\r\n"+s+"\r\n"+s1;
    }
}
