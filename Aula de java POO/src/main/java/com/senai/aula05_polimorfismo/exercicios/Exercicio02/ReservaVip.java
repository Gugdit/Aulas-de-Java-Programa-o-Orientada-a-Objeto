package com.senai.aula05_polimorfismo.exercicios.Exercicio02;

public class ReservaVip extends Reserva{
    private double precoBaseVip;

    public ReservaVip(int diasReservados, double precoPorDia,double precoVipBase) {
        super(diasReservados, precoPorDia);
        this.precoBaseVip = precoVipBase;
    }

    public double getPrecoBaseVip() {
        return precoBaseVip;
    }

    public void setPrecoBaseVip(double precoBaseVip) {
        this.precoBaseVip = precoBaseVip;
    }

    @Override
    public double calcularTotal() {
        double total = (super.getPrecoPorDia() * super.getDiasReservados()) + precoBaseVip * 2;
        return super.calcularTotal() + total;
    }
}
