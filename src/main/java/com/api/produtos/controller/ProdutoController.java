package com.api.produtos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/") //mapping default
    public String route(){
        return "API PIZZA";
    }
}
