package br.com.ecommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import ch.qos.logback.core.net.server.Client;

public interface ClienteDAO extends CrudRepository<Client,Integer> {
    
}
