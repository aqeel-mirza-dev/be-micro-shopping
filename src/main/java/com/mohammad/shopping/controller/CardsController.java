package com.mohammad.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="cardservice")
public class CardsController {

    @GetMapping(value="/cards/detail")
    public String getCardDetail(){
        return "Here are card details from the DB";
    }
}
