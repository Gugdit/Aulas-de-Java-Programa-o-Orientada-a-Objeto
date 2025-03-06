package com.senai.aula04_heranca.exercicios.Exercicio02;

class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return String.format(" Nome: Prof.%s - R$%s - %s", getNome(),getSalario(),getDisciplina());
    }
}
