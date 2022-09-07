package br.com.ecommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ecommerce.ecommerce.model.ItemPedido;

public interface ItemPedidoDAO extends CrudRepository<ItemPedido,Integer>{
    
}
