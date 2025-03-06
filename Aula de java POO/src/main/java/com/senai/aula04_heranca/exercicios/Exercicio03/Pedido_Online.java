package com.senai.aula04_heranca.exercicios.Exercicio03;

class Pedido_Online extends Pedido {

    public Pedido_Online(int numeroPedido, double valorTotal) {
        super(numeroPedido, valorTotal);

    }

    @Override
    public double getValorTotal() {
        double taxa = super.getValorTotal() * 0.10;
        return super.getValorTotal() + taxa;
    }

    @Override
    public String toString() {
        return "Pedido_Online{}";
    }
}
