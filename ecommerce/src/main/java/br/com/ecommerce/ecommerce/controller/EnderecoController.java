package br.com.ecommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.dao.EnderecoDAO;
import br.com.ecommerce.ecommerce.model.Endereco;

@RestController
public class EnderecoController {
    
    @Autowired
    private EnderecoDAO dao;

    @GetMapping("/enderecos")
    public ArrayList<Endereco> mostarPorId(){
        ArrayList<Endereco> lista;
        lista = (ArrayList<Endereco>)dao.findAll();
        return lista;
    }
}
