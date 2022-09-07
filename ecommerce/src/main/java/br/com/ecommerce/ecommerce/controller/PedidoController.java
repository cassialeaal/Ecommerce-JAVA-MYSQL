package br.com.ecommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.dao.PedidoDAO;
import br.com.ecommerce.ecommerce.model.Pedido;

@RestController
public class PedidoController {
    
    @Autowired
    private PedidoDAO dao;

    @GetMapping("/pedidos")
    public ArrayList<Pedido> listarPedidos(){
        ArrayList<Pedido> lista;
        lista = (ArrayList<Pedido>)dao.findAll();
        return lista;
    }
}
