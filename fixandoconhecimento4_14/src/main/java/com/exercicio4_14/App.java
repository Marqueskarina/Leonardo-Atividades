package com.exercicio4_14;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        boolean b = true;
        int numPorta;

        while (b == true) {
            System.out.println("----ESCOLHA UMA OPÇÃO----\n"
                    + "( 1 )ANIVERSÁRIO DE LEONARDO "
                    + "( 2 )PORTA "
                    + "( 3 )CASA "
                    + "( 0 )SAIR");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Pessoa pessoa = new Pessoa();
                    pessoa.fazAniversario();
                    break;
                case 2:
                    boolean bPorta = true;
                    Porta porta = new Porta();
                    while (bPorta == true) {
                        System.out.println("\n----ESCOLHA UMA DAS OPÇÕES----\n"
                                + "( 1 )PINTAR PORTA\n"
                                + "( 2 )ABRIR PORTA\n"
                                + "( 3 )FECHAR PORTA\n"
                                + "( 0 )VOLTAR");
                        int x = sc.nextInt();
                        switch (x) {
                            case 1:
                                System.out.println("DIGITE A COR DESEJADA:");
                                String cor = new String();
                                cor = sc.next();
                                porta.pintarPorta(cor);
                                break;
                            case 2:
                                porta.abrirPorta();
                                break;
                            case 3:
                                porta.fecharPorta();
                                break;
                            case 0:
                                bPorta = false;
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA!");
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean bCasa = true;
                    while (bCasa == true) {
                        Casa casa = new Casa();
                        System.out.println("\n----ESCOLHA UMA DAS OPÇÕES----\n"
                                + "( 1 )PINTAR CASA\n"
                                + "( 2 )ABRIR UMA PORTA\n"
                                + "( 3 )FECHAR UMA PORTA\n"
                                + "( 0 )VOLTAR");
                        int x = sc.nextInt();
                        switch (x) {
                            case 1:
                                String corCasa = new String();
                                System.out.println("DIGITE A COR DESEJADA:");
                                corCasa = sc.next();
                                casa.pintarCasa(corCasa);
                                break;
                            case 2:
                                System.out.println("QUAL O NUMERO DA PORTA QUE DESEJA ABRIR: ");
                                numPorta = sc.nextInt();
                                casa.abrirPortas(numPorta);
                                casa.quantasPortasEstaoAbertas();
                                break;
                            case 3:
                                System.out.println("QUAL O NUMERO DA PORTA QUE DESEJA FECHAR: ");
                                numPorta = sc.nextInt();
                                casa.fecharPortas(numPorta);
                                casa.quantasPortasEstaoAbertas();

                                break;
                            case 0:
                                bCasa = false;
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA!");
                                break;
                        }
                    }
            }
        }
        sc.close();
    }
}
