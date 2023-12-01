package com.exercicio4_14;

public class Pessoa {
    public String nome = "Leonardo";
    private int idade;

    String[] letra = {
        "Parabéns pra você",
        "Nesta data querida",
        "Muitas felicidades",
        "Muitos anos de vida"
    };

    public void fazAniversario() {
        idade += 1;
        for(int i = 0; i<=3; i++){
        System.out.println(letra[i]);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
        }
    System.out.println("\nParabéns "+ this.nome+" Por completar "+idade+" ano de vida\n");
    }
}
