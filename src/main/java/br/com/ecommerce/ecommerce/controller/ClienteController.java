package br.com.ecommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.dao.ClienteDAO;
import br.com.ecommerce.ecommerce.model.Cliente;

@RestController
public class ClienteController {
   
    @Autowired
    private ClienteDAO dao;

    @GetMapping("/clientes")
    public ArrayList<Cliente> recuperarTodos(){
        ArrayList<Cliente> lista;
        lista = (ArrayList<Cliente>)dao.findAll();
        return lista;
    }
}
