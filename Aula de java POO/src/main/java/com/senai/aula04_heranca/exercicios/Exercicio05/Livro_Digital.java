package com.senai.aula04_heranca.exercicios.Exercicio05;

public class Livro_Digital extends Livro {
    private int tamanhoMB;

    public Livro_Digital(String titulo, String autor, int tamanhoMB) {
        super(titulo, autor);
        this.tamanhoMB = tamanhoMB;
    }

    public int getTamanhoMB() {
        return tamanhoMB;
    }

    public void setTamanhoMB(int tamanhoMB) {
        this.tamanhoMB = tamanhoMB;
    }

    @Override
    public String toString() {
        return String.format("Título: %s  | Autor: %s | Tamanho MB: %s", super.getTitulo(),super.getAutor(),tamanhoMB);
    }
}
