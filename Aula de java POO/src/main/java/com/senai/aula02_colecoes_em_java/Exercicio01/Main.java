package com.senai.aula02_colecoes_em_java.Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Tarefa> tarefasList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        String menu = """
                    --- Gerenciador de tarefas ---
                    1. Adicionar Tarefa
                    2. Lista Tarefas
                    3. Marcar Tarefa como Concluída
                    4. Remover Tarefa
                    5. Sair
                    ------------------------------
                    """;
        do {
            System.out.println(menu);
            System.out.print("Ecolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nomeTarefa = scanner.nextLine();
                    tarefasList.add(new Tarefa(nomeTarefa,false));
		            System.out.println("Tarefa cadastrada com sucesso!!");
                    break;
                case 2:
                    exibirTarefas();
                    break;
		        case 3:
		            exibirTarefas();
		            System.out.println("Escolha uma tarefa pelo id para marcar como concluida!");
                    tarefasList.get(scanner.nextInt()-1).status = true;
                    System.out.println("Tarefa atualizada com sucesso!!");
                    break;
		        case 4:
                    exibirTarefas();
                    System.out.println("Escolha uma tarefa pelo id para ser removida");
                    tarefasList.remove(scanner.nextInt()-1);
                    System.out.println("Tarefa removida com sucesso!!");
                    break;
                case 5:
                    System.out.println("Fim Programa");
                    scanner.close();
                    break;	
            }
        }while (opcao != 5);
    }
    public static void exibirTarefas(){
        for (Tarefa tarefa : tarefasList){
            System.out.println((tarefasList.indexOf(tarefa)+1)+" - "+tarefa);
        }
    }
}
