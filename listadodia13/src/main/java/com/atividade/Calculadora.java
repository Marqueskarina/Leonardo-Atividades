package com.atividade;

public class Calculadora {
    int primeiroNumero;
    int segundoNumero;

    public Calculadora(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public void Opcoes() {
        System.out.println("( 1 )SOMA "
                + "( 2 )SUBTRAÇÃO "
                + "( 3 )SUTIPLICAÇÃO "
                + "( 4 )DIVISÃO");
    }

    public void Calculos(int opcao) {
        switch (opcao) {
            case 1:
                System.out.printf("%d  + %d = %d\n", primeiroNumero, segundoNumero, primeiroNumero + segundoNumero);
                break;
            case 2:
                System.out.printf("%d  - %d = %d\n", primeiroNumero, segundoNumero, primeiroNumero - segundoNumero);
                break;
            case 3:
                System.out.printf("%d  * %d = %d\n", primeiroNumero, segundoNumero, primeiroNumero * segundoNumero);
                break;
            case 4:
                System.out.printf("%d  + %d = %.2f\n", primeiroNumero, segundoNumero,(double) primeiroNumero / segundoNumero);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
    }

}
