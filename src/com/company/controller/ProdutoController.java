package com.company.controller;

public class ProdutoController {



    private String validaNome(String nome){
        if (nome == null){
            System.out.println("Nome deve ser preenchido");
        }

        return "";
    }
}
