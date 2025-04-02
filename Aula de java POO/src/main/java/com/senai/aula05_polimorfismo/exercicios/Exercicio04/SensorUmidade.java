package com.senai.aula05_polimorfismo.exercicios.Exercicio04;

public class SensorUmidade extends Sensor {
    private int valorUmidade;

    public SensorUmidade(int valorUmidade) {
        this.valorUmidade = valorUmidade;
    }

    public int getValorUmidade() {
        return valorUmidade;
    }

    public void setValorUmidade(int valorUmidade) {
        this.valorUmidade = valorUmidade;
    }

    @Override
    void escanear() {
        System.out.printf("""
                -------------Sensor de Umidade-------------
                Umidade: %%%s
                Data: - 
                Horário: -
                -----------------------------------------------
                """,valorUmidade);
    }
}
