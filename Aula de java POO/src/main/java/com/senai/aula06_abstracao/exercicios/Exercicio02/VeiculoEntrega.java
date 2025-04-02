package com.senai.aula06_abstracao.exercicios.Exercicio02;

public abstract class VeiculoEntrega {
    private double velocidadeAtual;
    private int capacidadeMaxima;
    private double distanciaDestino;

    public VeiculoEntrega(double velocidadeAtual, double distanciaDestino) {
        this.velocidadeAtual = velocidadeAtual;
        this.distanciaDestino = distanciaDestino;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getDistanciaDestino() {
        return distanciaDestino;
    }

    public void setDistanciaDestino(double distanciaDestino) {
        this.distanciaDestino = distanciaDestino;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    abstract double aumentarVelocidade();
    abstract double diminuirVelocidade();
    abstract void calcularTempoEstimado();
    abstract void detalhesVeiculo();


    public void verificarVelocidade() {
        System.out.println("A velocidade atual é: " +velocidadeAtual+"km/h");
    }

    public void distanciaDestino() {
        System.out.println("A distância atual do destino é: " +distanciaDestino+"Km");
    }

    public void capacidadeMaxima(){
        System.out.println("A capacidade máxima do veículo é: "+ capacidadeMaxima);
    }


}
