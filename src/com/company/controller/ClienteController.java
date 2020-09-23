package com.company.controller;

import com.company.model.ClienteModel;

public class ClienteController {

    private ClienteModel cliente;

    public void criaCliente(String nome, int cpf, String endereco){
        cliente = new ClienteModel(nome, cpf, endereco);
    }

    public ClienteModel getCliente() {
        return cliente;
    }
}
