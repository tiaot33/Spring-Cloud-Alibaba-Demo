package com.tiaot33.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <p>TODO<p/>
 *
 * @author tiaot33
 * @see
 * @since 2021/8/7-18:49
 */
@RestController
public class ShopCartController {
    @GetMapping("/shopcart/remove")
    public String remove(Integer productId, Integer userId) {
        System.out.println("移出购物车成功");
        return "移出购物车成功";
    }
}
