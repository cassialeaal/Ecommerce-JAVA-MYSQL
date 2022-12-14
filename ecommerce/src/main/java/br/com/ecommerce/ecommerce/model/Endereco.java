package br.com.ecommerce.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSeq")
    private Integer numSeq;

    @Column(name = "tipo", nullable = false, length = 5)
    private String tipo;

    @Column(name = "logradouro", nullable = false, length = 50)
    private String logradouro;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "complemento", length = 20)
    private String complemento;

    @Column(name = "cep", length = 10)
    private String cep;

    @Column(name = "estado", length = 2)
    private String estado;

    @Column(name = "cidade", length = 50)
    private String cidade;

    @Column(name = "bairro", length = 30)
    private String bairro;

    public Endereco(Integer numSeq, String tipo, String logradouro, Integer numero, String complemento, String cep,
            String estado, String cidade, String bairro) {
        this.numSeq = numSeq;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public Integer getNumSeq() {
        return numSeq;
    }

    public void setNumSeq(Integer numSeq) {
        this.numSeq = numSeq;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    

}
