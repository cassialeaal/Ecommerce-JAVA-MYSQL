package br.com.ecommerce.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idDepto;

    @Column(name="nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    public Departamento(Integer idDepto, String nome, String descricao) {
        this.idDepto = idDepto;
        this.nome = nome;
        this.descricao = descricao;
    }

    
    
}
