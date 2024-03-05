package com.mohammad.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="balanceservice")
public class BalanceController {

    @GetMapping(value="/balances/detail")
    public String getBalanceDetail(){
        return "Here are balance details from the DB";
    }
}
