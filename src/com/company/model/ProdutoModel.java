package com.company.model;

public class ProdutoModel {

    private int id;
    private String nomeProduto;
    private int quantidade;

    public ProdutoModel(int id, String nomeProduto, int quantidade) {
        this.id = id;
        this.nomeProduto = nomeProduto;
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

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
