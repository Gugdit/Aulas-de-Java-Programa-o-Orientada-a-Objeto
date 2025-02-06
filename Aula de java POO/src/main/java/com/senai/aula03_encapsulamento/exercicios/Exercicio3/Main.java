package com.senai.aula03_encapsulamento.exercicios.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario(
                "Leandro",
                4000,
                1
        );
        System.out.println(funcionario1);

        funcionario1.visualizarSalario();
        System.out.print("Digite o novo salário: ");
        funcionario1.alterarSalario(scanner.nextDouble());
        System.out.println("Seu novo salário: "+ funcionario1.getSalario());

        System.out.print("Digite um aumento percentual para o salário: ");
        funcionario1.alterarSalarioPercentual(scanner.nextDouble());
        System.out.print+("Seu novo salário: "+ funcionario1.getSalario());

    }
}
