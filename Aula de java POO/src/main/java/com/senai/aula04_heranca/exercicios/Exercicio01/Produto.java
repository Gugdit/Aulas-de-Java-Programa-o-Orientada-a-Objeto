package com.senai.aula04_heranca.exercicios.Exercicio01;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preco = preço;
        this.quantidade = quantidade;
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
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Preço: %s | Quantidade: %s",nome,preco,quantidade);
    }
}
