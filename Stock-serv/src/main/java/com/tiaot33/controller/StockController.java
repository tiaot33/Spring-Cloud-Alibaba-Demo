package com.tiaot33.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <p>TODO<p/>
 *
 * @author tiaot33
 * @see
 * @since 2021/8/7-18:52
 */
@RestController
public class StockController {
    @GetMapping("/stock/reduce/{productId}")
    public String reduce(@PathVariable Integer productId){
        System.out.println("减库存1个成功");
        return "减库存1个成功";
    }
}
