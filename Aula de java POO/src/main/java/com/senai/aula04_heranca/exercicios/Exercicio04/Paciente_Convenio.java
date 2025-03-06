package com.senai.aula04_heranca.exercicios.Exercicio04;

public class Paciente_Convenio extends Paciente {
    private double custoConvenio;
    private double descontoDoConvenio;

    public Paciente_Convenio(String nome, int idade, double custoConvenio, double descontoDoConvenio) {
        super(nome, idade);
        this.custoConvenio = custoConvenio;
        this.descontoDoConvenio = descontoDoConvenio;
    }

    public double getCustoConvenio() {
        return custoConvenio - descontoDoConvenio;
    }

    public void setCustoConvenio(double custoConvenio) {
        this.custoConvenio = custoConvenio;
    }

    public double getDescontoDoConvenio() {
        return descontoDoConvenio;
    }

    public void setDescontoDoConvenio(double descontoDoConvenio) {
        this.descontoDoConvenio = descontoDoConvenio;
    }

    @Override
    public String toString() {
        return "Paciente_Convenio{" +
                "custoConvenio=" + custoConvenio +
                '}';
    }
}
