package com.fibonacci;

public class Fibonacci {

    public int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
    
    public void imprimirSequenciaFibonacci(int limite) {
        for (int i = 0; i < limite; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        System.out.println(); 
    }

    //Com operador ternário
   /* public int calcularFibonacci2(int n) {
        return (n <= 1) ? n : calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }*/
    
}
