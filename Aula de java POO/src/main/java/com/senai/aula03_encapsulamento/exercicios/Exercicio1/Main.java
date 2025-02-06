package com.senai.aula03_encapsulamento.exercicios.Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Produto> produtosList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        String menu = """
                --- Menu de Produtos ---
                1. Cadastrar Produto
                2. Listar Produtos
                3. Sair
                ---------------------------
                """;
        do {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    exibirProdutos();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Fim Programa!!!");
                    scanner.close();
                    break;
            }

        } while (opcao != 3);
    }

        public static void exibirProdutos(){
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtosList){
                System.out.println((produtosList.indexOf(produto)+1)+" - "+produto);
            }
        }
        public static void cadastrarProduto(){
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Digite o preco: ");
            double precoProduto = scanner.nextDouble();
            produtosList.add(new Produto(nomeProduto, precoProduto));
            System.out.println("Produto cadastrado com sucesso!!");
        }

    }

