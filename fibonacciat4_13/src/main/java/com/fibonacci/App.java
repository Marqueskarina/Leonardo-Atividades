package com.fibonacci;

public class App {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.imprimirSequenciaFibonacci(10);

        System.out.println("\nO método recursivo é mais lento para calcular a sequência de Fibonacci porque ele recalcula os mesmos"
             +"\nvalores várias vezes, resultando em muitas operações redundantes." 
             +"\nIsso cria uma carga de trabalho exponencial, tornando-o ineficiente para valores maiores."
             +"\nEm contraste, o método iterativo evita essa redundância,"
             +"\ncalculando cada valor apenas uma vez, o que o torna mais rápido e eficiente.\n");
        
            System.out.println();
    }
}
