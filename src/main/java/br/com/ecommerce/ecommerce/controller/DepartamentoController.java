package br.com.ecommerce.ecommerce.controller;

import java.util.ArrayList;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/departamentos")
    public ResponseEntity<Departamento> incluirNovo(@RequestBody Departamento novo){
        Departamento resultado = service.criarNovo(novo);
        if(resultado!=null){
            return ResponseEntity.ok(resultado);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/departamentos")
    public ResponseEntity<Departamento> atualizar(@RequestBody Departamento dados){
        Departamento resultado = service.atualizarDados(dados);
        if(resultado!=null){
            return ResponseEntity.ok(resultado);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> excluirDepartamento(@PathVariable Integer id){
        service.excluirDepartamento(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/departamentos/{idDepto}")
    public ResponseEntity<Departamento> buscarPeloId(@PathVariable Integer idDepto){
        Departamento resultado = service.buscarPeloId(idDepto);
        if(resultado!=null){
            return ResponseEntity.ok(resultado);
        }
        return ResponseEntity.notFound().build();
    }
}

