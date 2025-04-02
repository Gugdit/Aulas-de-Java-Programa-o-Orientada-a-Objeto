package com.senai.aula05_polimorfismo.exercicios.Exercicio03;

public class ProdutoServico  extends Produto{
    private double taxaServico;

    public ProdutoServico(String nome, double preco, int quantidade, double taxaServico) {
        super(nome, preco, quantidade);
        this.taxaServico = taxaServico;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularTotal() {
        return (getPreco() + taxaServico) * getQuantidade();
    }
}
