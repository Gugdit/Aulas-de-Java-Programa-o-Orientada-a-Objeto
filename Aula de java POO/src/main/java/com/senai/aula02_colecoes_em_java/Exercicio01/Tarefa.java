package com.senai.aula02_colecoes_em_java.Exercicio01;

import java.util.Scanner;

public class Tarefa {
    static Scanner scanner = new Scanner(System.in);
    String tarefa;
    boolean status;

    public Tarefa(String tarefa, boolean status) {
        this.tarefa = tarefa;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("%s -[%s] ", tarefa, status ? "Concluída" : "Pendente");
    }
}
