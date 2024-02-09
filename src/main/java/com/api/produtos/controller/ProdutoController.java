package com.api.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.produtos.model.Produto;
import com.api.produtos.repository.ProdutoRepository;
import com.api.produtos.service.ProdutoService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService S;

    @Autowired
    private ProdutoRepository R; 

    @GetMapping("/list")
    public Iterable<Produto> listar() {
        return S.listar();
    }

    @GetMapping("/") //mapping default
    public String route(){
        return "API PIZZA";
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody Produto p) {
        return S.cadastrar(p);
    }
    

}
