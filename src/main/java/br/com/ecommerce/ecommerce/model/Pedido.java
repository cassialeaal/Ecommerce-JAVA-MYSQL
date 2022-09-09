package br.com.ecommerce.ecommerce.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numPedido", nullable = false)
    public Integer numPedido;
    
    @Column(name = "status", length = 1, nullable = false)
    public String status;

    @Column(name = "valorTotal")
    private Double valorTotal;

    @Column(name = "desconto")
    private Double desconto;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "valorLiquido")
    private Double valorLiq;

    public Pedido(Integer numPedido, String status, Double valorTotal, Double desconto, Double valorLiq) {
        this.numPedido = numPedido;
        this.status = status;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.valorLiq = valorLiq;
    }

    public Integer getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Integer numPedido) {
        this.numPedido = numPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValorLiq() {
        return valorLiq;
    }

    public void setValorLiq(Double valorLiq) {
        this.valorLiq = valorLiq;
    }
    
}
    
