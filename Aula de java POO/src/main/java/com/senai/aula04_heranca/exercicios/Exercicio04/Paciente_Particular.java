package com.senai.aula04_heranca.exercicios.Exercicio04;

public class Paciente_Particular extends Paciente {
    private double custoConsulta;

    public Paciente_Particular(String nome, int idade, double custoConsulta) {
        super(nome, idade);
        this.custoConsulta = custoConsulta;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    @Override
    public String toString() {
        return "Paciente_Particular{" +
                "custoConsulta=" + custoConsulta +
                '}';
    }
}
