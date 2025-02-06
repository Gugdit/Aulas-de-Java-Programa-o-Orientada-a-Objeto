package com.senai.aula03_encapsulamento.exercicios.Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ContaBancaria> contasBancariasList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        String menu = """
                --- Menu do Banco ---
                1. Cadastrar Usuário
                2. Sacar
                3. Depositar
                4. Listar usuários
                5. Sair
                ---------------------------
                """;
        do {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    System.out.println();
                    break;
                case 2:
                    saqueUsuarios();
                    System.out.println();
                    break;
                case 3:
                    depositoUsuarios();
                    System.out.println();
                    break;
                case 4:
                    exibirUsuarios();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Fim do programa!!");
                    break;
            }

        }while (opcao != 5);


    }
    public static void cadastrarUsuario(){
        System.out.print("O número da conta do usuário: ");
        int numeroDaConta = scanner.nextInt();
        System.out.print("Nome do usuário: ");
        scanner.nextLine();
        String nomeUsuario = scanner.nextLine();
        System.out.print("CPF do usuário: ");
        String CPF = scanner.nextLine();
        System.out.print("Data de nascimento do usuário: ");
        String dataDeNascimento = scanner.nextLine();
        System.out.print("Qual o Banco do usuário: ");
        String bancoDaConta = scanner.nextLine();
        System.out.print("Tipo da conta do usuário: ");
        String tipoDaConta = scanner.nextLine();
        contasBancariasList.add(new ContaBancaria(numeroDaConta,(new Usuario(nomeUsuario,CPF,dataDeNascimento)),100,bancoDaConta,tipoDaConta));
        System.out.println("Usuário cadastrado com sucesso!!!");
    }
    public static void exibirUsuarios(){
        System.out.println("Lista de Produtos:");
        for (ContaBancaria contaBancaria : contasBancariasList){
            System.out.println((contasBancariasList.indexOf(contaBancaria)+1)+" - "+contaBancaria);
        }
    }
    public static void saqueUsuarios(){
        System.out.print("Digite o número da Conta Bancária que deseja sacar: ");
        int contabancariaOpcao = scanner.nextInt();
        for (ContaBancaria contaBancaria : contasBancariasList) {
            if (contaBancaria.getNumeroDaConta() == contabancariaOpcao) {
                System.out.print("Quantidade que deseja sacar: ");
                contaBancaria.sacar(scanner.nextDouble());
                System.out.println("Saque realizado com sucesso!!!");
            }
        }
    }
    public static void depositoUsuarios(){
        System.out.print("Digite o número da Conta Bancária que deseja depositar: ");
        int contabancariaOpcao = scanner.nextInt();
        for (ContaBancaria contaBancaria : contasBancariasList) {
            if (contaBancaria.getNumeroDaConta() == contabancariaOpcao) {
                System.out.print("Quantidade que deseja depositar: ");
                contaBancaria.depositar(scanner.nextDouble());
                System.out.println("Depósito realizado com sucesso!!!");
            }
        }
    }
}
/*Scanner scanner = new Scanner(System.in);
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

        contaBancaria1.getSaldo();*/