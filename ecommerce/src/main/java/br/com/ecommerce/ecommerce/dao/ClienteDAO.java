package br.com.ecommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ecommerce.ecommerce.model.Cliente;
//import ch.qos.logback.core.net.server.Client;

public interface ClienteDAO extends CrudRepository<Cliente,Integer> {
    
}
