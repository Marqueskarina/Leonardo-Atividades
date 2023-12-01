package com.atividade;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void verLivro(){
        System.out.printf("Titulo %s\nAutor: %s\nAno de Publicação: %d\n", titulo,autor,ano);
    }
}
