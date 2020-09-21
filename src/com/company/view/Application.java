package com.company.view;

import com.company.controller.ProdutoController;
import com.company.model.ClienteModel;
import com.company.model.ProdutoModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ClienteModel> listaClientes = new ArrayList<>();
        ArrayList<ProdutoModel> listaProdutoModels = new ArrayList<>();


        System.out.println(" Escolha a opção desejada: ");
        System.out.println(" 1 - Cadastrar Cliente "); //nome, cpf, endereço
        System.out.println(" 2 - Cadastrar Produto "); //id, nome do produto, quantidade
        System.out.println(" 3 - Efetuar Compra "); //operações da venda
        int op = in.nextInt();


        switch (op){
            case 1 :
                System.out.println("________________________ \n");
                System.out.println("   CADASTRAR CLIENTE    ");
                System.out.println(" Nome:    ");
                String nome = in.next();
                System.out.println(" Cpf:    ");
                int cpf = in.nextInt();
                System.out.println(" Endereço:    ");
                String endereco = in.next();

                ClienteModel clienteModel = new ClienteModel(nome, cpf, endereco);
                listaClientes.add(clienteModel);

            case 2 :
                System.out.println("________________________ \n");
                System.out.println("   CADASTRAR PRODUTO    \n");
                System.out.println(" ID:    ");
                int id = in.nextInt();
                System.out.println(" Nome do Produto :    ");
                String nomeProd = in.next();
                System.out.println(" Quantidade:    ");
                int qtd = in.nextInt();

                ProdutoModel produto = new ProdutoModel(id, nomeProd, qtd);
                listaProdutoModels.add(produto);


        }

        //System.out.println(listaClientes.get(0).toString());
        System.out.println(listaProdutoModels.get(0).toString());

    }
}
