package br.com.ecommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce.dao.ItemPedidoDAO;
import br.com.ecommerce.ecommerce.model.ItemPedido;

@RestController
public class ItemPedidoController {
    @Autowired
    private ItemPedidoDAO dao;

    @GetMapping("/itens")
    public ArrayList<ItemPedido> mostrarTodos(){
        ArrayList<ItemPedido> lista;
        lista = (ArrayList<ItemPedido>)dao.findAll();
        return lista;

    }
}
