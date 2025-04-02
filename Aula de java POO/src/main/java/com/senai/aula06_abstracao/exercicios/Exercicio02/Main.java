package com.senai.aula06_abstracao.exercicios.Exercicio02;

public class Main {
    public static void main(String[] args) {
        testeVeiculo(new BicicletaEntrega(20,100,20));
        testeVeiculo(new MotoEntrega(20,100,30));
    }

    public static void testeVeiculo(VeiculoEntrega veiculoEntrega){
        System.out.println("-------------Teste veículos-------------");
        if (veiculoEntrega instanceof BicicletaEntrega bicicletaEntrega){
            bicicletaEntrega.detalhesVeiculo();
            veiculoEntrega.capacidadeMaxima();
            veiculoEntrega.verificarVelocidade();
            veiculoEntrega.distanciaDestino();
            bicicletaEntrega.aumentarVelocidade();
            bicicletaEntrega.verificarVelocidade();
            bicicletaEntrega.diminuirVelocidade();
            bicicletaEntrega.verificarVelocidade();
            bicicletaEntrega.calcularTempoEstimado();
        } else if (veiculoEntrega instanceof MotoEntrega motoEntrega) {
            motoEntrega.detalhesVeiculo();
            veiculoEntrega.capacidadeMaxima();
            veiculoEntrega.verificarVelocidade();
            veiculoEntrega.distanciaDestino();
            motoEntrega.aumentarVelocidade();
            motoEntrega.verificarVelocidade();
            motoEntrega.diminuirVelocidade();
            motoEntrega.verificarVelocidade();
            motoEntrega.calcularTempoEstimado();
        }
    }
}
