package com.senai.aula02_colecoes_em_java.Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Produto> produtosList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        String menu = """
                --- Controle de Estoque ---
                1. Cadastrar  Produto
                2. Listar Produtos
                3. Atualizar Quantidade
                4. Remover Produto
                5. Buscar Produto
                6. Sair
                ---------------------------
                """;
        do {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeProduto = scanner.nextInt();
                    produtosList.add(new Produto(nomeProduto, quantidadeProduto));
                    System.out.println("Tarefa cadastrada com sucesso!!");
                    System.out.println();
                    break;
                case 2:
                    exibirProdutos();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Digite o nome do produto para atualizar: ");
                    String produtoAtualizar = scanner.nextLine();
                    for (Produto produto : produtosList) {
                        if (produto.nomeProduto.equals(produtoAtualizar)) {
                            System.out.print("Quantidade que deseja atualizar: ");
                            produto.quantidadeEstoque = scanner.nextInt();
                            System.out.println("Quantidade atualizada com sucesso!!!");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Digite um nome para ser removido: ");
                    String produtoRemover = scanner.nextLine();
                    for (int posicao = 0; posicao < produtosList.size(); posicao++) {
                        if (produtosList.get(posicao).nomeProduto.equals(produtoRemover)) {
                            produtosList.remove(posicao);
                            System.out.println("Produto removido com sucesso!!");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Digite o nome do produto para buscar: ");
                    String produtoBuscar = scanner.nextLine();
                    for (Produto produto : produtosList) {
                        if (produto.nomeProduto.equals(produtoBuscar)) {
                            System.out.println("Produto encontrado: ");
                            System.out.println("Nome: " + produto);
                        }
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Fim Programa");
                    scanner.close();
                    break;
            }

        }while (opcao != 6);

    }
    public static void exibirProdutos(){
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtosList){
            System.out.println((produtosList.indexOf(produto)+1)+" - "+produto);
        }
    }

}
