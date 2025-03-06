package com.senai.aula04_heranca.exercicios.Exercicio02;

import com.senai.aula03_encapsulamento.exercicios.Exercicio2.ContaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Professor> professorsList = new ArrayList<>();
    public static void main(String[] args) {


        professorsList.add(new Professor("Carlos", 5678,"História"));
        professorsList.add(new Professor("Maria", 5000,"Português"));
        professorsList.add(new Professor("João", 4897,"Matemática"));

        Coordenador coordenador = new Coordenador("Felipe",8647,professorsList);

        System.out.print("Digite o nome do funcionário que deseja mudar: ");
        String funcionarioSalarioOpcao = scanner.nextLine();
        for (Professor professor : professorsList) {
            if (professor.getNome().equals(funcionarioSalarioOpcao)) {
                System.out.print("Novo salário: ");
                professor.setSalario(scanner.nextDouble());
            }
        }
        System.out.println(coordenador);


    }
}
