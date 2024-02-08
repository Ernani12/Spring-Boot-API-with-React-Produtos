package com.api.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.produtos.model.Produto;
import com.api.produtos.service.ProdutoService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService S;

    @GetMapping("/list")
    public Iterable<Produto> listar() {
        return S.listar();
    }
    

    @GetMapping("/") //mapping default
    public String route(){
        return "API PIZZA";
    }
}
