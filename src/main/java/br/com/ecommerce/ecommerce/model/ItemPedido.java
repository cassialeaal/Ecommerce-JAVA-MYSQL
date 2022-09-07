package br.com.ecommerce.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itemPedido")
public class ItemPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sequencial")
    private Integer seq;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "valorUnidade")
    private Double valorUnid;

    @Column(name = "valorFinal")
    private Double valorFinal;

    public ItemPedido(Integer seq, Integer quantidade, Double valorUnid, Double valorFinal) {
        this.seq = seq;
        this.quantidade = quantidade;
        this.valorUnid = valorUnid;
        this.valorFinal = valorFinal;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnid() {
        return valorUnid;
    }

    public void setValorUnid(Double valorUnid) {
        this.valorUnid = valorUnid;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    
    
}
