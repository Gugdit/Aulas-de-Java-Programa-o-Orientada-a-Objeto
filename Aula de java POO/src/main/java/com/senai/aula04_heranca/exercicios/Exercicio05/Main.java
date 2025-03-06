package com.senai.aula04_heranca.exercicios.Exercicio05;

public class Main {
    public static void main(String[] args) {
        Livro_Fisico livroFisico1 = new Livro_Fisico("Linda Sereia","Marcelo Abreu",156);
        Livro_Digital livro_digital1 = new Livro_Digital("Livro do Johnson","Cicero da Silva",15);

        System.out.println(livroFisico1);
        System.out.println(livro_digital1);
    }
}
