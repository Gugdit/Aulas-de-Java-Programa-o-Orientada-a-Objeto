package com.senai.aula01_class_atributo_metodos.Exercicios.Exercicio02;

public class principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 16, 5.5);

        aluno1.exibirInformacoes();
        aluno1.atualizaNota(1);
        if (aluno1.verificarAprovacao()){
            System.out.println("O aluno está aprovado");
        }else {
            System.out.println("O aluno está reprovado");
        }

        System.out.println();

        Aluno aluno2 = new Aluno("Maria",15,10.0);

        aluno2.exibirInformacoes();
        aluno2.atualizaNota(0);
        if (aluno2.verificarAprovacao()){
            System.out.println("O aluno está aprovado");
        }else {
            System.out.println("O aluno está reprovado");
        }

        System.out.println();

        Aluno aluno3 = new Aluno("Pedro",17,4.5);

        aluno3.exibirInformacoes();
        aluno3.atualizaNota(0);
        if (aluno3.verificarAprovacao()){
            System.out.println("O aluno está aprovado");
        }else {
            System.out.println("O aluno está reprovado");
        }

    }
}
