package com.senai.aula05_polimorfismo.exercicios.Exercicio02;

public class Main {
    public static void main(String[] args) {
        ReservaSimples reservaSimples = new ReservaSimples(6,105,1200);
        ReservaVip reservaVip = new ReservaVip(6,105,1200);
        System.out.println(reservaSimples.calcularTotal());
        System.out.println(reservaVip.calcularTotal());
    }
}
