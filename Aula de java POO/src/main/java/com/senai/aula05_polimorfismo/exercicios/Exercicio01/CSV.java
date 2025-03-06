package com.senai.aula05_polimorfismo.exercicios.Exercicio01;

public class CSV extends Relatorio{
    @Override
    void gerar() {
        System.out.println("""
                --------Relatório CSV--------
                Situação do Arquivo:
                Tamanho:
                Data
                -----------------------------
                """);
    }
}
