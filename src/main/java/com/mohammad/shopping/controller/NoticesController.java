package com.mohammad.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="noticeservice")
public class NoticesController {

    @GetMapping(value="/notices/detail")
    public String getNoticesDetail(){
        return "Here are card details from the DB";
    }
}
