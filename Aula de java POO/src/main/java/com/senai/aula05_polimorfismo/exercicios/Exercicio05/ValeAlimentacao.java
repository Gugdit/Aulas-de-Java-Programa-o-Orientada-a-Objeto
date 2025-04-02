package com.senai.aula05_polimorfismo.exercicios.Exercicio05;

public class ValeAlimentacao extends Beneficio {
    private double descontoAlimentacao;

    public ValeAlimentacao(double valor) {
        super(valor);
        this.descontoAlimentacao = 0.15;
    }

    @Override
    public double calcularDesconto(double salario) {
        double desconto = super.calcularDesconto(salario) * descontoAlimentacao;
        double total = super.calcularDesconto(salario) - desconto;
        System.out.println("O desconto do vale alimentação no salário é: "+ desconto + " o salário agora é "+ total);
        return total;
    }
}
