package com.company.model;

import java.util.ArrayList;

public class CompraModel {

    private ClienteModel cliente;
    private ArrayList<ProdutoCompraModel> produtoCompraModel;

    public CompraModel(ClienteModel cliente, ArrayList<ProdutoCompraModel> produtoCompraModel) {
        this.cliente = cliente;
        this.produtoCompraModel = produtoCompraModel;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public ArrayList<ProdutoCompraModel> getProdutoCompraModel() {
        return produtoCompraModel;
    }

    public double totalCompra(){
        double totalCompra = 0.0;
        for (ProdutoCompraModel itemCompra : produtoCompraModel) {
            double multiplica = itemCompra.getProduto().getValor()*itemCompra.getQuantidade();
            totalCompra+=multiplica;
        }
        return totalCompra;
    }

    @Override
    public String toString() {
        return  ";" +
                ";" + cliente +
                ";" + produtoCompraModel ;
    }
}
