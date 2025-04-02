package com.senai.aula06_abstracao.exemplos.classe_abstrata.gerenciamento_de_funcionarios;

class FuncionarioEfetivo extends Funcionario {
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public void calcularBonus(){
        salario += bonusMensal;
    }
}
