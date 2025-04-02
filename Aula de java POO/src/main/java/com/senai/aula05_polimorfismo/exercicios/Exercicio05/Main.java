package com.senai.aula05_polimorfismo.exercicios.Exercicio05;

public class Main {
    public static void main(String[] args) {
        AuxilioTransporte auxilioTransporte = new AuxilioTransporte(1000);
        PlanoDeSaude planoDeSaude = new PlanoDeSaude(1000);
        ValeAlimentacao valeAlimentacao = new ValeAlimentacao(1000);
        auxilioTransporte.calcularDesconto(2000);
        planoDeSaude.calcularDesconto(2000);
        valeAlimentacao.calcularDesconto(2000);
    }
}
