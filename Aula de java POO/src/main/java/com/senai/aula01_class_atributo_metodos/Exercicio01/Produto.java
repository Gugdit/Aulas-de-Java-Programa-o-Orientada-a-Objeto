package com.senai.aula01_class_atributo_metodos.Exercicio01;

import java.util.Objects;
import java.util.Scanner;

public class Produto {
    Scanner scanner = new Scanner(System.in);

    String nome;
    double preco;
    int quantidade;

    public void exibirDetalhes(){
        System.out.println("O nome do produto é: "+ nome);
        System.out.println("O preço do produto é: "+ preco);
        System.out.println("A quantidade do produto é: "+ quantidade);
    }

    public void atualizaEstoque(int alteraçaoQuantidade){
        quantidade += alteraçaoQuantidade;
        System.out.println("A quantidade atual do produto agora é: " + quantidade);
    }

    public void calcularValorEstoque(){
        double valorTotal = preco * (double) quantidade;
        System.out.println("Valor total do estoque do produto é: "+ valorTotal);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && quantidade == produto.quantidade && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, quantidade);
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
