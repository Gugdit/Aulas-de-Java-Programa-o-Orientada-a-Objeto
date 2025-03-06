package com.senai.aula04_heranca.exemplos.Exemplo_funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Lucio",5000);
        Gerente gerente = new Gerente("José",100000,20000);

        funcionario1.exibirDados();
        gerente.exibirDados();
    }
}
