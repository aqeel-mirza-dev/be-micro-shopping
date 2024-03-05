package com.mohammad.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="contactservice")
public class ContactController {

    @GetMapping(value="/contacts/detail")
    public String getContactDetail(){
        return "Here are contact details from the DB";
    }
}
