package com.mohammad.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="accountservice")
public class AccountController {

    @GetMapping(value="/accounts/detail")
    public String getAccountDetail(){
        return "Here are account details from the DB";
    }
}
