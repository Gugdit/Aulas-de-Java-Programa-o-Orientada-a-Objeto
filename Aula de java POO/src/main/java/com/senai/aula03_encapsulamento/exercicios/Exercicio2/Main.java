package com.senai.aula03_encapsulamento.exercicios.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria1 = new ContaBancaria(
                040,
                new Usuario(
                        "Gustavo",
                        545198,
                        "04/04/2007"
                ),
                15,
                "Santander",
                "Conta Corrente"
        );

        ContaBancaria contaBancaria2 = new ContaBancaria(
                040,
                new Usuario(
                        "Lucas",
                        51251,
                        "15/09/2002"
                ),
                40,
                "Santander",
                "Conta Corrente"
        );
        
        System.out.print("Fale a quantidade que deseja sacar: ");
        contaBancaria1.sacar(scanner.nextDouble());

        System.out.print("Fale a quantidade que deseja depositar: ");
        contaBancaria1.depositar(scanner.nextDouble());

        System.out.print("Fale o valor que deseja transferir para o outro: ");
        contaBancaria1.transferencia(scanner.nextDouble(), contaBancaria2);

        contaBancaria1.getSaldo();
       
    }
}
