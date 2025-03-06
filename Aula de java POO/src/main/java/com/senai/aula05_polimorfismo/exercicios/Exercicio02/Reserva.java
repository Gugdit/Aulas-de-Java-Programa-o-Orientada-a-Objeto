package com.senai.aula05_polimorfismo.exercicios.Exercicio02;

public class Reserva {
    private int diasReservados;
    private double precoPorDia;


    public Reserva(int diasReservados, double precoPorDia) {
        this.diasReservados = diasReservados;
        this.precoPorDia = precoPorDia;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public void setDiasReservados(int diasReservados) {
        this.diasReservados = diasReservados;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public double calcularTotal(){
        return diasReservados + precoPorDia;
    }
}
