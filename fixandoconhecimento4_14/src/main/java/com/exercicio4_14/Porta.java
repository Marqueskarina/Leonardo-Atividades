package com.exercicio4_14;

/* aberta,	cor,	dimensaoX,	dimensaoY,	dimensaoZ
Métodos:	void	abre()
void	fecha()	
void	pinta(String	s)
boolean	estaAberta()*/

public class Porta {
    boolean porta = false;
    private double dimensaoX = 91.0, dimensaoY = 204.0, dimensaoZ = 3.5;
    private String cor;


    public void abrirPorta() {
        if (porta == false) {
            System.out.println("A Porta Foi Aberta.");
            this.porta = true;
        } else {
            System.out.println("A Porta já está aberta!!");
        }
    }

    public void fecharPorta() {
        if (porta == true) {
            System.out.println("A Porta Foi Fechada.");
            this.porta = false;
        } else {
            System.out.println("A Porta já está Fechada!!");
        }
    }

    public void pintarPorta(String cor){
        this.cor = cor;
        System.out.println("Porta Pintada de "+ cor);

    }
}
