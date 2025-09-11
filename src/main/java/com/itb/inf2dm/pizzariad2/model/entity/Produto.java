package com.itb.inf2dm.pizzariad2.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Produto")
public class Produto {

    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento sequencial 1 em 1
    private Long id;
    @Column(length = 100, nullable = false) // length qtde max de caracteres, nullble: false (NOT NULL), true  (null)
    private String nome;
    @Column(length = 45, nullable = true)
    private String tipo;
    @Column(length = 250, nullable = true)
    private String descricao;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    private double valorCompra;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    private double valorVenda;
    @Column(nullable = true)
    private int quantidadeEstoque;
    private boolean codStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
