package com.senai.aula05_polimorfismo.exercicios.Exercicio05;

public class Beneficio {
    private double valor;

    public Beneficio(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public double calcularDesconto(double salario){
        return salario;
    }
}
