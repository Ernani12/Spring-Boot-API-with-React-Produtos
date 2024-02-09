package com.api.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.produtos.model.Produto;
import com.api.produtos.model.ResponseModel;
import com.api.produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository pr;

    @Autowired
    private ResponseModel RM;

    //list all products
    public Iterable<Produto> listar(){
        return pr.findAll();
 
   }

    public ResponseEntity<?> cadastrar(Produto p){

        if(p.getNome().equals("")){
            RM.setMessage("Nome é obrigatorio");
            return new ResponseEntity<ResponseModel>(RM, HttpStatus.BAD_REQUEST);
        }
        else if(p.getMarca().equals("")){
            RM.setMessage("Marca Obrigatoria");
            return new ResponseEntity<ResponseModel>(RM, HttpStatus.BAD_REQUEST);
        }else{
            return new  ResponseEntity<Produto>(pr.save(p),HttpStatus.CREATED);
        }


    }

}
