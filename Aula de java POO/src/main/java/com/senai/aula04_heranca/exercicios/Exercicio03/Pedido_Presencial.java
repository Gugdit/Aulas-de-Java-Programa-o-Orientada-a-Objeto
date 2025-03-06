package com.senai.aula04_heranca.exercicios.Exercicio03;

class Pedido_Presencial extends Pedido {

    public Pedido_Presencial(int numeroPedido, double valorTotal) {
        super(numeroPedido, valorTotal);
    }



    @Override
    public double getValorTotal() {
        double desconto = super.getValorTotal() * 0.30;
        return super.getValorTotal() - desconto;
    }

    @Override
    public String toString() {
        return "Pedido_Presencial{}";
    }
}


