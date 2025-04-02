package com.senai.aula05_polimorfismo.exercicios.Exercicio03;

public class Main {
    public static void main(String[] args) {
        ProdutoDigital produtoDigital = new ProdutoDigital("Celular",1500,1,125);
        ProdutoFisico produtoFisico =  new ProdutoFisico("Camisa",100,5);
        ProdutoServico produtoServico = new ProdutoServico("Pedreiro",300,1,200);

        System.out.println(produtoDigital.calcularTotal());
        System.out.println(produtoFisico.calcularTotal());
        System.out.println(produtoServico.calcularTotal());
    }
}
