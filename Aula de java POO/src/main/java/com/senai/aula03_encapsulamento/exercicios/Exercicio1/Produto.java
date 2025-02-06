package com.senai.aula03_encapsulamento.exercicios.Exercicio1;

import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo!!!");
        }
    }

    @Override
    public String toString() {
        return String.format("%s | Preço(R$): %s ", nome, preco );
    }

}
