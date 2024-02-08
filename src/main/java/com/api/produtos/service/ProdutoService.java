package com.api.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.produtos.model.Produto;
import com.api.produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository pr;

    //list all products
    public Iterable<Produto> listar(){
        return pr.findAll();
    }
}
