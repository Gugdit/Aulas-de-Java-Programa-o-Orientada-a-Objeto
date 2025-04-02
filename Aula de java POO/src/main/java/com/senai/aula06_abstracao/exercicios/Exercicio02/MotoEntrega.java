package com.senai.aula06_abstracao.exercicios.Exercicio02;

public class MotoEntrega extends VeiculoEntrega{
    private int capacidadeAtual;

    public MotoEntrega(double velocidadeAtual, double distanciaDestino, int capacidadeAtual) {
        super(velocidadeAtual, distanciaDestino);
        this.capacidadeAtual = capacidadeAtual;
        super.setCapacidadeMaxima(capacidadeAtual);
    }

    @Override
    public void capacidadeMaxima() {
        if (validarCapacidade(getCapacidadeMaxima())){
            System.out.println("Capacidade adequada,capacidade: "+getCapacidadeMaxima());
        } else {
            System.out.println("Capacidade inadequada, capacidade: "+getCapacidadeMaxima());
        }
    }

    @Override
    double aumentarVelocidade() {
        setVelocidadeAtual(getVelocidadeAtual()+5);
        System.out.println("Velocidade da moto agora é: " + getVelocidadeAtual() +"km/h");
        return getVelocidadeAtual();
    }

    @Override
    double diminuirVelocidade() {
        setVelocidadeAtual(getVelocidadeAtual()-5);
        System.out.println("Velocidade da moto agora é: " + getVelocidadeAtual() +"km/h");
        return getVelocidadeAtual();
    }

    @Override
    void calcularTempoEstimado() {
        double velocidadeResultado = super.getVelocidadeAtual() / super.getDistanciaDestino();
        double velocidadeResultado2 = velocidadeResultado * 60;
        System.out.println("O tempo até chegar ao destino é: "+velocidadeResultado+" horas!!!, ou "+velocidadeResultado2+" minutos");
    }

    @Override
    void detalhesVeiculo() {
        System.out.println("""
                Veículo: Moto
                Rodas: 2
                Marca: BMW R1250 GS Premium Brasil Special Edition
                Data de fabricação: 01/05/2019
                """);
    }

    private boolean validarCapacidade(int capacidadeMaxima){
        return (super.getCapacidadeMaxima() <= 30) && (capacidadeMaxima > 0);
    }

}
