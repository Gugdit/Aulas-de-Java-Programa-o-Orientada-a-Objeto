package com.senai.aula04_heranca.exercicios.Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Produto> produtosList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        String menu = """
                --- Menu de Produtos  ---
                1. Cadastrar Produtos
                2. Atualizar Quantidade
                3. Deletar
                4. Listar
                5. Sair
                -------------------------
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
                    cadastrarProdutos();
                    System.out.println();
                    break;
                case 2:
                    atualizarProdutos();
                    System.out.println();
                    break;
                case 3:
                    deletarProduto();
                    System.out.println();
                    break;
                case 4:
                    exibirProdutos();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Fim do programa!!");
                    break;
                default:
                    if (opcao > 5){
                        System.out.println("Opção não é válida!!!!");
                    }
            }

        }while (opcao != 5);
    }
    public static void cadastrarProdutos() {
        System.out.print("""
                1. Alimento
                2. Eletrônico
                Escolha o tipo do produto:
                """);
        int escolhaProduto = scanner.nextInt();
        scanner.nextLine();
        if (escolhaProduto == 1){
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
            }
            double precoProduto = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Digite a quantidade do produto: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.nextLine();
                System.out.print("Digite a quantidade do produto: ");
            }
            int quantidadeProduto = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite a data de validade do alimento: ");
            String dataValidade = scanner.nextLine();
            produtosList.add(new Alimento(nomeProduto,precoProduto,quantidadeProduto,dataValidade));
        } else if (escolhaProduto == 2) {
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
            }
            double precoProduto = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Digite a quantidade do produto: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.nextLine();
                System.out.print("Digite a quantidade do produto: ");
            }
            int quantidadeProduto = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite a voltagem do Eletrônico: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.nextLine();
                System.out.print("Digite a voltagem do Eletrônico: ");
            }
            int voltagemEletronico = scanner.nextInt();
            scanner.nextLine();
            produtosList.add(new Eletronico(nomeProduto,precoProduto,quantidadeProduto,voltagemEletronico));
        }
    }

    public static void atualizarProdutos(){
        System.out.print("Digite o nome do produto para atualizar: ");
        exibirProdutos();
        String produtoAtualizar = scanner.nextLine();
        for (Produto produto : produtosList) {
            if (produto.getNome().equals(produtoAtualizar)) {
                System.out.print("Quantidade que deseja atualizar: ");
                produto.setQuantidade(scanner.nextInt());
                System.out.println("Quantidade atualizada com sucesso!!!");
            }
        }
    }

    public static void exibirProdutos(){
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtosList){
            System.out.println((produtosList.indexOf(produto)+1)+" - "+produto);
        }
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

/*Alimento alimento1 = new Alimento("Frango",7.69,657,"07/03/2025");
Eletronico eletronico1 = new Eletronico("Geladeira Consul",2678.99,123,220);

        System.out.println(alimento1);
        System.out.println(eletronico1);*/
