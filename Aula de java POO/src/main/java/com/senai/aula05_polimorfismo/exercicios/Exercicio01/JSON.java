package com.senai.aula05_polimorfismo.exercicios.Exercicio01;

public class JSON extends Relatorio{
    @Override
    void gerar() {
        System.out.println("""
                --------Relatório JSON--------
                Situação do Arquivo:
                Tamanho:
                Data
                -----------------------------
                """);
    }
}
