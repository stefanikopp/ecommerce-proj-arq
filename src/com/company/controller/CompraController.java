package com.company.controller;

import com.company.model.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class CompraController {

    private String path = "C:\\Users\\006179\\Documents\\Desenvolvimento\\ecommerce-proj-arq\\src\\com\\company\\dados\\compra.txt";
    private ArrayList<ProdutoCompraModel> listaProdutos = new ArrayList<>();
    private ArrayList<CompraModel> listaCompra = new ArrayList<>();
    private BoletoController dadosBoleto = new BoletoController();
    private ArrayList<BoletoCompletoModel> dadosBoletoList = new ArrayList<>();
    private BoletoCompletoModel finalBoleto = new BoletoCompletoModel();


    public void addCompra() throws IOException {

        ClienteModel cliente = getClienteModel().getCliente() ; //cliente
                                                           // lista produto percorrendo o for
        double total = getClienteModel().totalCompra();  //total compra
        BoletoModel boleto = dadosBoleto.geraBoleto();  //dados boleto

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.path, true));
        buffWrite.append(cliente +";");
        for (ProdutoCompraModel item: listaProdutos) {
            buffWrite.append(item +";");
        }
        buffWrite.append(total +";");
        buffWrite.append(boleto +"\n");
        buffWrite.close();

    }

    public void addProduto(ProdutoModel produtoModel, int qtd) {
        listaProdutos.add(new ProdutoCompraModel(produtoModel, qtd));
    }

    public void addListaCompra(ClienteModel clienteModel) {
        listaCompra.add(new CompraModel(clienteModel, listaProdutos));
    }

    public CompraModel getClienteModel() {
        for (CompraModel item: listaCompra) {
            return item;
        }
        return null;
    }

    public void percorrerArquivo() throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(this.path));

        String linha = "";
        while (true) {
            if (linha != null) {
                String[] textoSeparado = linha.split(";");
                if (textoSeparado.length > 1) {
                    finalBoleto = addDadosParaBoleto(textoSeparado);
                }
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    private BoletoCompletoModel addDadosParaBoleto(String[] textoSeparado) {

        BoletoCompletoModel boleto = new BoletoCompletoModel();

        boleto.setNome(textoSeparado[0]);
        boleto.setCpf(Integer.parseInt(textoSeparado[1]));
        boleto.setEndereco(textoSeparado[2]);
        boleto.setId(Integer.parseInt(textoSeparado[3]));
        boleto.setNomeProduto(textoSeparado[4]);
        boleto.setValorProduto(Double.parseDouble(textoSeparado[5]));
        boleto.setQuantidadeEstoque(Integer.parseInt(textoSeparado[6]));
        boleto.setQuantidadeCompra(Integer.parseInt(textoSeparado[7]));
        boleto.setTotal(Double.parseDouble(textoSeparado[8]));
        boleto.setCodigoBoleto(Integer.parseInt(textoSeparado[9]));
        boleto.setDataVencimento(LocalDate.parse(textoSeparado[10]));
//        dadosBoletoList.add(boleto);

        return boleto;
    }

    public void imprimeBoleto() throws IOException {
        percorrerArquivo();
        System.out.println("---------------------------");
        System.out.println("      Dados da Compra       ");
        System.out.println("---------------------------");
            System.out.println(finalBoleto);

    }
}
