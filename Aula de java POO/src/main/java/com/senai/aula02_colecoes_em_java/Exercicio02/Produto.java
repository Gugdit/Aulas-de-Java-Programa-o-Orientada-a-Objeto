package com.senai.aula02_colecoes_em_java.Exercicio02;

import java.util.Objects;

public class Produto {
    String nomeProduto;
    int quantidadeEstoque;

    @Override
    public String toString() {
        return String.format("%s | Quantidade: %s ", nomeProduto, quantidadeEstoque );
    }

    public Produto(String nomeProduto, int quantidadeEstoque) {
        this.nomeProduto = nomeProduto;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return quantidadeEstoque == produto.quantidadeEstoque && Objects.equals(nomeProduto, produto.nomeProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeProduto, quantidadeEstoque);
    }
}
