package com.company.model;

public class ProdutoModel {

    private int id;
    private String nomeProduto;
    private double valor;
    private int quantidade;

    public ProdutoModel() {
    }

    public ProdutoModel(int id, String nomeProduto, double valor, int quantidade) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {

        return   id+
                ";"+nomeProduto+
                ";"+valor +
                ";"+quantidade;
    }

    public String imprimeLista() {

        return  "  ID "+id+
                "  PRODUTO "+nomeProduto+
                "  VALOR "+valor +
                "  QUANTIDADE EM ESTOQUE  "+quantidade;
    }
}
