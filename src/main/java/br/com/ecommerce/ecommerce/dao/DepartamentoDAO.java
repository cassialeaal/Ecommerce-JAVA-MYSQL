package br.com.ecommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ecommerce.ecommerce.model.Departamento;
//import ch.qos.logback.core.net.server.Client;

public interface DepartamentoDAO extends CrudRepository<Departamento,Integer> {
}
