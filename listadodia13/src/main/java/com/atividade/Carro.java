package com.atividade;

public class Carro {
    String modelo;
    String cor;
    int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void MostrarDadosCarro(){
        System.out.printf("Modelo: %s\nCor: %s\nAno: %d\n\n",modelo,cor,ano);
    }
}
