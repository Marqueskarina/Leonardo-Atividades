package com.orientacaoaobjeto;

import java.util.Date;

public class Conta {
    private String nomeTitular;
    private int agencia;

    private double saldo = 0.0;
    private Date dataDeAbertura;
    private double limite;
    private int numConta;

    public Conta(String nomeTitular, int agencia, int numConta) {
        this.nomeTitular = nomeTitular;
        this.agencia = agencia;
        this.numConta = numConta;
        Date data = new Date();
        this.dataDeAbertura = data;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    //////////////////// get and set////////////////////////
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Date getDataDeAbertura() {
        return dataDeAbertura;
    }

    ///////////////////////////// MÉTODOS////////////////////////////////
    public boolean sacar(double valor) {
        if (valor < this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }

    public double rendimento() {
        double rendimento = saldo * 0.1;
        return rendimento;
    }

    public void visualizarConta() {
        System.out.printf(
                "Numero da conta: %d\nNumero da Agencia: %d\nNome do Proprietário: %s\nData de abertura: %tF\nSaldo: %.2f\nRendimentro: %.2f",
                this.numConta, this.agencia, this.nomeTitular, dataDeAbertura, this.saldo, rendimento());
    }



}
