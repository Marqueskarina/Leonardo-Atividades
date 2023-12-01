package com.orientacaoaobjeto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta[] = new Conta[2];
        conta[0] = new Conta("Carol", 132, 0);
        conta[1] = new Conta("Pedro", 243, 1);
        int x = 1;
        int numeroConta;
        boolean b = true;

        while (b == true) {
            System.out.println("\nESCOLHA UMA OPÇÃO"
                    + "\n( 1 ) DEPOSITAR"
                    + "\n( 2 ) SACAR"
                    + "\n( 3 ) VER SALDO"
                    + "\n( 4 ) VISUALIZAR CONTA"
                    + "\n( 5 ) Ver SE AS CONTAS SÃO IGUAIS"
                    + "\n( 0 ) SAIR\n");
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
            System.out.println("Digite o Número da Conta: ");
            numeroConta = sc.nextInt();
            switch (x) {
                case 1:
                    int valorDeposito;
                    System.out.println("Digite o Valor que Será Depositado?");
                    valorDeposito = sc.nextInt();
                    if (conta[numeroConta].depositar(valorDeposito) == true) {
                        System.out.println("VALOR DEPOSITADO COM SUCESSO!");
                    }
                    break;
                case 2:
                    int valorSaque;
                    System.out.printf("DIGITE O VALOR A SER SACADO: \n");
                    valorSaque = sc.nextInt();
                    if (conta[numeroConta].sacar(valorSaque) == true) {
                        System.out.println("SAQUE EFETUADO COM SUCESSO!");
                    } else {
                        System.out.println("SALDO INSUFICIENTE!");
                    }
                    break;
                case 3:
                    double saldo = conta[numeroConta].getSaldo();
                    System.out.println(saldo);
                    break;
                case 4:
                    conta[numeroConta].visualizarConta();
                    break;
                case 5:
                    if (conta[0] == conta[1]) {
                        System.out.println("AS CONTAS SÃO IGUAIS!");
                    } else {
                        System.out.println("AS CONTAS SÃO DIFERENTES!");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
}
