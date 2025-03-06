package com.senai.aula04_heranca.exercicios.Exercicio05;

public class Livro_Fisico extends Livro {
    private int numeroDePaginas;

    public Livro_Fisico(String titulo, String autor, int numeroDePaginas) {
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return String.format("Título: %s  | Autor: %s | Número de Páginas: %s", super.getTitulo(),super.getAutor(),numeroDePaginas);
    }
}
