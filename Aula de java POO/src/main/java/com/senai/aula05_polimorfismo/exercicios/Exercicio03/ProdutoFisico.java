package com.senai.aula05_polimorfismo.exercicios.Exercicio03;

public class ProdutoFisico extends Produto{
    private double descontoProduto;

    public ProdutoFisico(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
        this.descontoProduto = 0.15;
    }

    public double getDescontoProduto() {
        return descontoProduto;
    }

    public void setDescontoProduto(double descontoProduto) {
        this.descontoProduto = descontoProduto;
    }

    @Override
    public double calcularTotal() {
        return (getPreco() - getPreco() * descontoProduto) * getQuantidade();
    }
}
