package br.com.ecommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ecommerce.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido,Integer> {
    
}
