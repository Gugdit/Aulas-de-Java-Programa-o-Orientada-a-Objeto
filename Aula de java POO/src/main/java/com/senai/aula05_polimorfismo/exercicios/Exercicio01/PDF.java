package com.senai.aula05_polimorfismo.exercicios.Exercicio01;

public class PDF extends Relatorio{
    @Override
    void gerar() {
        System.out.println("""
                --------Relatório PDF--------
                Situação do Arquivo:
                Tamanho:
                Data
                -----------------------------
                """);
    }
}
