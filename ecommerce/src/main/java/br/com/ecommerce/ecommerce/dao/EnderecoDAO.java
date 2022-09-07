package br.com.ecommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ecommerce.ecommerce.model.Endereco;

public interface EnderecoDAO extends CrudRepository<Endereco,Integer>{
    
}
