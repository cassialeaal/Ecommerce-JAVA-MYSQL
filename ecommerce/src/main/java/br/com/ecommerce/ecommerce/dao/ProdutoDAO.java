package br.com.ecommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ecommerce.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto,Integer>{
    
}
