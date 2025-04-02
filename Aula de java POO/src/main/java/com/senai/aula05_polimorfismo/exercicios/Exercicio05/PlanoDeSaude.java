package com.senai.aula05_polimorfismo.exercicios.Exercicio05;

public class PlanoDeSaude extends  Beneficio{
    private double descontoSaude;

    public PlanoDeSaude(double valor) {
        super(valor);
        this.descontoSaude = 0.20;
    }

    @Override
    public double calcularDesconto(double salario) {
        double desconto = super.calcularDesconto(salario) * descontoSaude;
        double total = super.calcularDesconto(salario) - desconto;
        System.out.println("O desconto do plano de saúde no salário é: "+ desconto + " o salário agora é "+ total);
        return total;
    }
}
