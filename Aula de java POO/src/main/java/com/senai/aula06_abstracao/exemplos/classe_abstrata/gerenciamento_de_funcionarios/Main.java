package com.senai.aula06_abstracao.exemplos.classe_abstrata.gerenciamento_de_funcionarios;



public class Main {
    public static void main(String[] args) {
        testeFuncionario(new FuncionarioEfetivo("Gustavo",10000,2000));
        testeFuncionario(new FuncionarioTemporario("Lucas",4000,10,200));
    }
    private static void testeFuncionario(Funcionario funcionario){
        System.out.println("-------------Teste Funcionario-------------");
        funcionario.exibirDados();
        funcionario.aumentarSalario(10);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
