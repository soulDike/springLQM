package com.bsteel.lqm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luoliyan on 2017/8/15.
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "ok";
    }


}
