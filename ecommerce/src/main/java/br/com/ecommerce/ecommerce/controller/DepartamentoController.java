package br.com.ecommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.dao.DepartamentoDAO;
import br.com.ecommerce.ecommerce.model.Departamento;

@RestController
public class DepartamentoController {
   
    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos(){
        ArrayList<Departamento> lista;
        lista = (ArrayList<Departamento>)dao.findAll();
        return lista;
    }
}
