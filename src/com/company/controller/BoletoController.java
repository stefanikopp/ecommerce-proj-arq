package com.company.controller;

import com.company.model.BoletoModel;

import java.time.LocalDate;

public class BoletoController {

    private BoletoModel geraBoleto = new BoletoModel();


    public BoletoModel geraBoleto() {

        int codBoleto = geraBoleto.geradorCodigo();
        LocalDate dataVencimento = geraBoleto.vencimentoBoleto();
        geraBoleto.setCodigo(codBoleto);
        geraBoleto.setDataVencimento(dataVencimento);

        return geraBoleto;
    }


}
