package com.company.model;

public class ProdutoCompraModel {

    private ProdutoModel produto;
    private int quantidade;

    public ProdutoCompraModel(ProdutoModel produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return        produto +
                ";" + quantidade;
    }
}
