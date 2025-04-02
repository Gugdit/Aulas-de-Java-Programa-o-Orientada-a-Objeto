package com.senai.aula05_polimorfismo.exercicios.Exercicio04;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensorTemperatura = new SensorTemperatura(30);
        SensorUmidade sensorUmidade = new SensorUmidade(50);
        sensorTemperatura.escanear();
        sensorUmidade.escanear();
    }
}
