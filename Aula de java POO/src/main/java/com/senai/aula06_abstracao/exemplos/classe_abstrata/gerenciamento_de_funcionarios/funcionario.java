package com.senai.aula06_abstracao.exemplos.classe_abstrata.gerenciamento_de_funcionarios;

abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagemAumento){
        salario += salario * porcentagemAumento / 100;
    }

    public abstract void calcularBonus();

    public void exibirDados(){
        System.out.printf("%s recebe R$%,.2f\n",nome,salario);
    }
}
