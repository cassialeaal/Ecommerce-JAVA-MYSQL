package br.com.ecommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.model.Departamento;
import br.com.ecommerce.ecommerce.service.IDepartamentoService;

@RestController
public class DepartamentoController {
   
    @Autowired
    private IDepartamentoService service;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> buscarTodos(){
        return service.buscarTodos();
    }
}

