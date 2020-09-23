package com.company.controller;

import com.company.model.ProdutoModel;

import java.io.*;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class ProdutoController {

    private String path = "C:\\Users\\006179\\Documents\\Desenvolvimento\\ecommerce-proj-arq\\src\\com\\company\\dados\\baseProdutos.txt";
    private ArrayList<ProdutoModel> listaProdutos = new ArrayList<>();


    public void addProduto(int id, String nomeProd, double valor, int qtd) throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.path, true));
        ProdutoModel produto = new ProdutoModel(id, nomeProd, valor, qtd);
        buffWrite.append(produto + "\n");
        buffWrite.close();
    }

    private void addProdutoLista(String[] textoSeparado) {
        ProdutoModel produtoModel = new ProdutoModel();

        produtoModel.setId(parseInt(textoSeparado[0]));
        produtoModel.setNomeProduto(textoSeparado[1]);
        produtoModel.setValor(Double.parseDouble(textoSeparado[2]));
        produtoModel.setQuantidade(Integer.parseInt(textoSeparado[3]));
        listaProdutos.add(produtoModel);
    }

    public void percorrerArquivo() throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(this.path));

        String linha = "";
        while (true) {
            if (linha != null) {
                String[] textoSeparado = linha.split(";");
                if (textoSeparado.length > 1) {
                    addProdutoLista(textoSeparado);
                }
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public void listarProdutos() throws IOException {
        percorrerArquivo();
        System.out.println("---------------------------");
        System.out.println("      LISTA DE PRODUTOS   ");
        System.out.println("---------------------------");
        for (ProdutoModel item : listaProdutos) {
            System.out.println(item.imprimeLista());
        }
    }

    public ProdutoModel getProduto(int id) {
        for (ProdutoModel item : listaProdutos) {
            if (item.getId() == id){
                return item;
            }

        }
        return null;
    }
}
