package com.company.model;

import java.time.LocalDate;

public class BoletoCompletoModel {

    private String nome;
    private int cpf;
    private String endereco;
    private int id;
    private String nomeProduto;
    private double valorProduto;
    private int quantidadeEstoque;
    private int quantidadeCompra;
    private double total;
    private int codigoBoleto;
    private LocalDate dataVencimento;

    public BoletoCompletoModel() {
    }

    public BoletoCompletoModel(String nome, int cpf, String endereco, int id, String nomeProduto, double valorProduto, int quantidadeEstoque, int quantidadeCompra, double total, int codigoBoleto, LocalDate dataVencimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeCompra = quantidadeCompra;
        this.total = total;
        this.codigoBoleto = codigoBoleto;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public int getQuantidadeCompra() {
        return quantidadeCompra;
    }

    public double getTotal() {
        return total;
    }

    public int getCodigoBoleto() {
        return codigoBoleto;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCodigoBoleto(int codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "BoletoCompletoModel{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", endereco='" + endereco + '\'' +
                ", id=" + id +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", valorProduto=" + valorProduto +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", quantidadeCompra=" + quantidadeCompra +
                ", total=" + total +
                ", codigoBoleto=" + codigoBoleto +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}
