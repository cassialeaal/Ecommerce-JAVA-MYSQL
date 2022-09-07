package br.com.ecommerce.ecommerce.model;

import java.time.LocalDate;
import java.util.Date;

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

    @Column(name = "valorLiquido")
    private Double valorLiq;

}
    
