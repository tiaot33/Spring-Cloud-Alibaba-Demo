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
 * @since 2021/8/7-18:43
 */
@RestController
public class UserController {
    @GetMapping("/user/{userId}")
    public String userId(@PathVariable Integer userId){
        return "小然";
    }

}
