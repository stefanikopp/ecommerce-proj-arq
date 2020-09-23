package com.company.view;

import com.company.controller.ClienteController;
import com.company.controller.CompraController;
import com.company.controller.ProdutoController;

import java.io.IOException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        ClienteController clienteController = new ClienteController();
        ProdutoController  produtoController = new ProdutoController();
        CompraController compraController = new CompraController();


        System.out.println(" Escolha a opção desejada: ");
        System.out.println(" 1 - Listar Produto "); //nome, cpf, endereço
        System.out.println(" 2 - Cadastrar Produto "); //id, nome do produto, quantidade
        System.out.println(" 3 - Efetuar Compra "); //operações da venda
        int op = in.nextInt();


        switch (op){
            case 1 :
                produtoController.listarProdutos();
                break;

            case 2 :
                System.out.println("________________________ \n");
                System.out.println("   CADASTRAR PRODUTO    \n");
                System.out.println(" ID:    ");
                int id = in.nextInt();
                System.out.println(" Nome do Produto :    ");
                String nomeProd = in.next();
                System.out.println(" Valor R$ :    ");
                double valorProd = in.nextDouble();
                System.out.println(" Quantidade:    ");
                int qtd = in.nextInt();
                produtoController.addProduto(id, nomeProd,valorProd, qtd);
                break;

            case 3 :
                System.out.println("________________________ \n");
                System.out.println("        COMPRA           \n");
                System.out.println("________________________ \n");

                System.out.println("   1º Passo Cadastro     \n");
                System.out.println(" Nome:    ");
                String nome = in.next();
                System.out.println(" Cpf:    ");
                int cpf = in.nextInt();
                System.out.println(" Endereço:    ");
                String endereco = in.next();
                clienteController.criaCliente(nome, cpf, endereco);

                System.out.println("     LISTAR PRODUTOS     \n");
                produtoController.listarProdutos();

                while (true) {
                    System.out.println("   2º Selecionar o Produto      (POR ID)\n");
                    int prodSelecionado = in.nextInt();
                    System.out.println("   Informe a Quantidade que deseja Comprar ");
                    int qtdCompra = in.nextInt();

                    compraController.addProduto(produtoController.getProduto(prodSelecionado), qtdCompra);

                    System.out.println("Deseja comprar outro produto? (S/N)");
                    String continua = in.next();

                    if(continua.equalsIgnoreCase("n")){

                        System.out.println(" S - Gerar Boleto ");
                        System.out.println(" N - Gerar Boleto ");
                        String opBoleto = in.next();

                        if (opBoleto.equalsIgnoreCase("S")){

                            compraController.percorrerArquivo();
                            compraController.imprimeBoleto();

                            System.out.println("-------------------------------");
                            System.out.println(" VOLTE SEMPRE! ");
                            break;
                        } else {
                            System.out.println("-------------------------------");
                            System.out.println(" VOLTE SEMPRE! ");
                            break;
                        }
                    }

                }

                compraController.addListaCompra(clienteController.getCliente());
                compraController.addCompra();

        }



    }
}
