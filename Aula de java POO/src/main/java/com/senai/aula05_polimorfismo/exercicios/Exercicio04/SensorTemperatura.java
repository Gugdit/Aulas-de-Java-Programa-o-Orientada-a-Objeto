package com.senai.aula05_polimorfismo.exercicios.Exercicio04;

public class SensorTemperatura extends Sensor{
    private double valorTemperatura;

    public SensorTemperatura(double valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    public double getValorTemperatura() {
        return valorTemperatura;
    }

    public void setValorTemperatura(double valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    @Override
    void escanear() {
        System.out.printf("""
                -------------Sensor de Temperatura-------------
                Temperatura: C°%s
                Data: - 
                Horário: -
                -----------------------------------------------
                """,valorTemperatura);

    }
}
