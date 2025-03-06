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
                3. Deletar Produto
                4. Sair
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
                    cadastrarProduto();
                    break;
                case 2:
                    exibirProdutos();
                    System.out.println();
                    break;
                case 3:
                    deletarProduto();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Fim Programa!!!");
                    scanner.close();
                    break;
                default:
                    if (opcao > 4){
                        System.out.println("Opção não é válida!!!!");
                    }
            }

        } while (opcao != 4);
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
            while (!scanner.hasNextDouble()) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.nextLine();
                System.out.print("Digite o preço: ");
            }
            double precoProduto = scanner.nextDouble();
            produtosList.add(new Produto(nomeProduto, precoProduto));
            System.out.println("Produto cadastrado com sucesso!!");
        }
        public static void deletarProduto(){
            System.out.print("Digite um nome para ser removido: ");
            exibirProdutos();
            String produtoRemover = scanner.nextLine();
            for (int posicao = 0; posicao < produtosList.size(); posicao++) {
                if (produtosList.get(posicao).getNome().equals(produtoRemover)) {
                    produtosList.remove(posicao);
                    System.out.println("Produto removido com sucesso!!");
                }
            }
        }

    }

