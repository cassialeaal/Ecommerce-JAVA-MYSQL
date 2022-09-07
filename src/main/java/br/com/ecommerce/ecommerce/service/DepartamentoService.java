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
        if(novo.getNome()!= null){
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public Departamento atualizarDados(Departamento dados) {
        if(dados.getIdDepto()!=null && dados.getNome()!=null){
            return dao.save(dados);
        }
        return null;
    }

    @Override
    public ArrayList<Departamento> listarTodos() {
        return (ArrayList<Departamento>)dao.findAll();
    }

    @Override
    public Departamento buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void excluirDepartamento(Integer id) {
        dao.deleteById(id);
    }

}
