package com.senai.aula05_polimorfismo.exercicios.Exercicio02;

public class ReservaSimples extends Reserva{
    private double precoBaseSimples;

    public ReservaSimples(int diasReservados, double precoPorDia,double precoBase) {
        super(diasReservados, precoPorDia);
        this.precoBaseSimples = precoBase;
    }

    public double getPrecoBaseSimples() {
        return precoBaseSimples;
    }

    public void setPrecoBaseSimples(double precoBaseSimples) {
        this.precoBaseSimples = precoBaseSimples;
    }

    @Override
    public double calcularTotal() {
        double total = super.getPrecoPorDia() * super.getDiasReservados() + precoBaseSimples;
        return super.calcularTotal() + total;
    }
}
