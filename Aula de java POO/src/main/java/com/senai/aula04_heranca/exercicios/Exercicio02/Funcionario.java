package com.senai.aula04_heranca.exercicios.Exercicio02;

import java.util.ArrayList;

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 5124) {
            this.salario = salario;
            System.out.println("Mudança realizada com sucesso!!!!");
        } else {
            System.out.println("O salário digitado está menor do que o Piso Salarial!!!!");
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Salário: R$%s ",nome,salario);
    }
}
