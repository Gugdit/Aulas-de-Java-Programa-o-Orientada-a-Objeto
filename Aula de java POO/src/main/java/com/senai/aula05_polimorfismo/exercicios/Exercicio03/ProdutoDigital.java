package com.senai.aula05_polimorfismo.exercicios.Exercicio03;

public class ProdutoDigital extends Produto {
    private double frete;

    public ProdutoDigital(String nome, double preco, int quantidade, double frete) {
        super(nome, preco, quantidade);
        this.frete = frete;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    @Override
    public double calcularTotal() {
        return (getPreco() + frete) * getQuantidade();
    }


}
