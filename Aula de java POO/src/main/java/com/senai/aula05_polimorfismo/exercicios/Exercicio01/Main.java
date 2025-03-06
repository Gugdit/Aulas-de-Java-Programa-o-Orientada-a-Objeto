package com.senai.aula05_polimorfismo.exercicios.Exercicio01;

public class Main {
    public static void main(String[] args) {
        PDF pdf = new PDF();
        pdf.gerar();
        CSV csv = new CSV();
        csv.gerar();
        JSON json = new JSON();
        json.gerar();

    }
}
