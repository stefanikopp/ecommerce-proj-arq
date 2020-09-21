package com.company.model;

public class ClienteModel {

    private String nome;
    private int cpf;
    private String endereco;

    public ClienteModel(String nome, int cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
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

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
