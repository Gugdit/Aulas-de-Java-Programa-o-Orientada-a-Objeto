package com.senai.aula05_polimorfismo.exercicios.Exercicio05;

public class AuxilioTransporte extends Beneficio{
    private double descontoTransporte;

    public AuxilioTransporte(double valor) {
        super(valor);
        this.descontoTransporte = 0.05;
    }

    @Override
    public double calcularDesconto(double salario) {
        double desconto = super.calcularDesconto(salario) * descontoTransporte;
        double total = super.calcularDesconto(salario) - desconto;
        System.out.println("O desconto do vale transporte no salário é: "+ desconto + " o salário agora é "+ total);
        return total;
    }
}
