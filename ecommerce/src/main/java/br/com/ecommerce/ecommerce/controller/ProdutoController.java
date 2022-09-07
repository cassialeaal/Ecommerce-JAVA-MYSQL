package br.com.ecommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.dao.ProdutoDAO;
import br.com.ecommerce.ecommerce.model.Produto;

@RestController
public class ProdutoController {
    
    @Autowired
    private ProdutoDAO dao;

    @GetMapping("/produtos")
    public ArrayList<Produto> mostrarTodos(){
        ArrayList<Produto> lista;
        lista = (ArrayList<Produto>)dao.findAll();
        return lista;

    }
}
