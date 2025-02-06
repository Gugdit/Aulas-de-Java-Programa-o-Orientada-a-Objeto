package com.senai.aula03_encapsulamento.exercicios.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario(
                "Pedrinho",
                4000,
                1
        );
        System.out.println(funcionario1);
        System.out.println("Preencha as informações do funcionário:");
        System.out.print("Nome: ");
        while (funcionario1.setNome(scanner.nextLine())){
            System.out.println("Digite um nome válido!!!");
        }
        System.out.print("Cargo: ");
        while (funcionario1.setCargo(scanner.nextInt())){
            System.out.println("Digite um cargo válido!!!");
        }
        System.out.println("Salário:");
        while (funcionario1.setSalario(scanner.nextDouble())){
            System.out.println("Digite um salário válido!!!");
        }
    }
        }


