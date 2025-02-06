package com.senai.aula03_encapsulamento.exercicios.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Sabonete",5.99);
        System.out.println(produto1.getPreco());
        produto1.setPreco(6.99);
        System.out.println(produto1.getPreco());
        produto1.setPreco(-1.00);
        System.out.println(produto1.getPreco());

    }
}
