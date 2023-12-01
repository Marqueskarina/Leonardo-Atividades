package com.atividade;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean b = true;
        int opcao;
        Scanner sc = new Scanner(System.in);
        while (b == true) {
            System.out.println("( 1 ) Carro "
                    + "( 2 )Calculadora "
                    + "( 3 )Círculo "
                    + "( 4 )Livro "
                    + "( 0 )SAIR ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("classe é um modelo que define atributos e métodos, enquanto um objeto é uma instância concreta dessa classe");
                    System.out.println("---------SOBRE O CARRO---------");
                    Carro meuCarro = new Carro("Renault kwid", "Branco", 2023);
                    meuCarro.MostrarDadosCarro();
                    break;
                case 2:
                    int x1, x2, num;
                    System.out.println("\nMétodos são blocos de códigos que quando chamados executam ações"
                            + "Para usá-los, se declara o método na classe e o chama quando necessário\n");
                            System.out.println("---------SOBRE A CALCULADORA---------");
                            System.out.print("Digite o primeiro valor: ");
                            x1 = sc.nextInt();
                            System.out.println("Segundo Valor: ");
                            x2 = sc.nextInt();
                    Calculadora calculo = new Calculadora(x1,x2);
                    calculo.Opcoes();
                    num = sc.nextInt();
                    calculo.Calculos(num);
                    break;
                case 3:
                    double raio;
                    System.out.println("\nMétodos são blocos de códigos que quando chamados executam ações,\r\n"
                    + "já o construtor é usado para iniciar um objeto.");
                    System.out.println("Digite o raio do circulo: ");
                    raio = sc.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    circulo.calcularArea();
                    
                    break;
                case 4:
                    System.out.println("Construtores são métodos especiais chamados durante a criação de um objeto."
                    +"\nO construtor padrão é fornecido automaticamente se nenhum construtor é  definido,"
                    +"\nenquanto construtores personalizados são métodos que o programador cria para inicializar objetos com parâmetros específicos.");
                    System.out.println("---------SOBRE O LIVRO---------");
                    Livro livro = new Livro("Alunos que Choram","Leonardo", 2023);
                    livro.verLivro();
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }

        sc.close();
    }
}
