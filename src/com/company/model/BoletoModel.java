package com.company.model;

import java.time.LocalDate;
import java.util.Random;

public class BoletoModel {

    private int codigo;
    private LocalDate dataVencimento;

    public BoletoModel() {
    }

    public BoletoModel(int codigo, LocalDate dataVencimento) {
        this.codigo = codigo;
        this.dataVencimento = dataVencimento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public int geradorCodigo() {
        int  cod = (int)(Math.random() * 1000000000);
        return cod;
    }

    public LocalDate vencimentoBoleto() {
        LocalDate inicio = LocalDate.now();
        LocalDate fim = LocalDate.of(
                inicio.getYear(),
                inicio.getMonth(),
                inicio.getDayOfMonth() + 7);
        return fim;
    }

    @Override
    public String toString() {
        return  codigo +
                ";" + dataVencimento ;
    }
}
