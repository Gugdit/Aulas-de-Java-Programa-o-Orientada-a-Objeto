package com.senai.aula03_encapsulamento.exercicios.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Funcionario> funcionariosList = new ArrayList<>();
    static String cargos = """
                ---------------------------
                1.Gerente
                2.Analista
                3.Programador
                Escolha um cargo:
                ---------------------------
                """;
    public static void main(String[] args) {
        int opcao;
        String menu = """
                --- Menu dos Funcionários ---
                1. Cadastrar Usuário
                2. Listar usuários
                3. Alterar Salário
                4. Dar aumento
                5. Deletar Usuário
                6. Sair
                ---------------------------
                """;
        do {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.nextLine();
                System.out.print("Escolha uma opção: ");
            }
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    System.out.println();
                    break;
                case 2:
                    exibirUsuarios();
                    System.out.println();
                    break;
                case 3:
                    alterarSalario();
                    System.out.println();
                    break;
                case 4:
                    darAumento();
                    System.out.println();
                    break;
                case 5:
                    deletarUsuarios();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Fim do programa!!");
                    break;
                default:
                    if (opcao > 6){
                        System.out.println("Opção não é válida!!!!");
                    }
                    break;
            }
        } while (opcao != 6);


    }
    public static void exibirUsuarios(){
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionariosList){
            System.out.println((funcionariosList.indexOf(funcionario)+1)+" - "+funcionario);
        }
    }
    public static void cadastrarFuncionario(){
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do funcionário: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Opção inválida! Por favor, digite um número.");
            scanner.nextLine();
            System.out.print("Salário do funcionário: ");
        }
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print(cargos);
        while (!scanner.hasNextInt()) {
            System.out.println("Opção inválida! Por favor, digite um número.");
            scanner.nextLine();
            System.out.print("Escolha um cargo: ");
        }
        int opcaoCargos = scanner.nextInt()-1;
        scanner.nextLine();
        funcionariosList.add(new Funcionario(nome,salario,opcaoCargos));
        System.out.println("Usuário cadastrado com sucesso!!!");
    }
    public static void alterarSalario(){
        System.out.print("Digite o nome do Funcionário, que deseja alterar o salário: ");
        System.out.println();
        exibirUsuarios();
        String nomeUsuario = scanner.nextLine();
        for (Funcionario funcionario : funcionariosList) {
            if (funcionario.getNome().equals(nomeUsuario)) {
                System.out.print("Quantidade que deseja alterar: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Opção inválida! Por favor, digite um número.");
                    scanner.nextLine();
                    System.out.print("Quantidade que deseja alterar: ");
                }
                funcionario.alterarSalario(scanner.nextDouble());
                System.out.println("Alteração realizada com sucesso!!!");
            } else {
                System.out.println("Nome inválido!!!");
            }
        }
    }
    public static void darAumento(){
        System.out.print("Digite o nome do Funcionário, que deseja dar um aumento: ");
        System.out.println();
        exibirUsuarios();
        String nomeUsuario2 = scanner.nextLine();
        for (Funcionario funcionario : funcionariosList) {
            if (funcionario.getNome().equals(nomeUsuario2)) {
                System.out.print("Digite o percentual do aumento: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Opção inválida! Por favor, digite um número.");
                    scanner.nextLine();
                    System.out.print("Digite o percentual do aumento: ");
                }
                funcionario.alterarSalarioPercentual(scanner.nextDouble());
                System.out.println("Alteração realizada com sucesso!!!");
            } else {
                System.out.println("Nome inválido!!!!");
            }
        }
    }
    public static void deletarUsuarios(){
        System.out.print("Digite o nome da conta que deseja deletar: ");
        exibirUsuarios();
        String usuarioDeletar = scanner.nextLine();
        for (int posicao = 0; posicao < funcionariosList.size(); posicao++) {
            if (funcionariosList.get(posicao).getNome().equals(usuarioDeletar)) {
                funcionariosList.remove(posicao);
                System.out.println("Usuário  removido com sucesso!!");
            }
        }
    }
}

/*Funcionario funcionario1 = new Funcionario(
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
                System.out.println(funcionario1);
    }*/


