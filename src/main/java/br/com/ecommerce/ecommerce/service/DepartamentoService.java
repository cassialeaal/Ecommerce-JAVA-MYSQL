package br.com.ecommerce.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.ecommerce.dao.DepartamentoDAO;
import br.com.ecommerce.ecommerce.model.Departamento;

@Service
public class DepartamentoService implements IDepartamentoService {

    @Autowired
    private DepartamentoDAO dao;

    @Override
    public Departamento criarNovo(Departamento novo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Departamento atualizarDados(Departamento dados) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Departamento> buscarTodos() {
        return (ArrayList<Departamento>)dao.findAll();
    }

    @Override
    public Departamento buscarPeloId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void excluirDepartamento(Integer id) {
        // TODO Auto-generated method stub
        
    }

}
