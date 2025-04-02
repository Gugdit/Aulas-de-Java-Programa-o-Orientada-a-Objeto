package com.senai.aula06_abstracao.exemplos.classe_abstrata.conta_bancaria;

public abstract class Conta {
    private String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    abstract void aplicarTaxaMensal();

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular + ", Saldo: R$" + saldo);
    }
}
