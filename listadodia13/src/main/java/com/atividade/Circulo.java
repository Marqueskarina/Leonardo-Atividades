package com.atividade;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        System.out.printf("A área do raio é igual a: %.2f\n",3.14 * raio * raio);
    }
}
