package com.senai.aula06_abstracao.exemplos.classe_abstrata.gerenciamento_de_funcionarios;

class FuncionarioTemporario extends Funcionario {
    private int horasExtras;
    private double valorHoraExtra;

    public FuncionarioTemporario(String nome, double salario, int horasExtras, double valorHoraExtra) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public void calcularBonus() {
        salario += horasExtras * valorHoraExtra;
    }
}
