package com.senai.aula01_class_atributo_metodos.Exercicio02;

import java.util.Objects;

public class Aluno {
    String nome;
    int idade;
    double nota;

    public void exibirInformacoes (){
        System.out.println("O nome do aluno é: "+ nome);
        System.out.println("A idade do aluno é: "+ idade);
        System.out.println("A nota do aluno é: "+ nota);
    }

    public void atualizaNota (double alteracaoNota){
        nota += alteracaoNota;
        System.out.println("A nota do aluno após alteração é: "+ nota);
    }

    public boolean verificarAprovacao () {
        boolean aprovacao;
        aprovacao = nota >= 6.0;
        return aprovacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Double.compare(nota, aluno.nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, nota);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                '}';
    }

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
}
