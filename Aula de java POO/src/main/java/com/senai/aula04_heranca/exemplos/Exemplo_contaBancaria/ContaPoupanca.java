package com.senai.aula04_heranca.exemplos.Exemplo_contaBancaria;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    public void aplicarRendimento(){
        super.setSaldo(super.getSaldo()+(super.getSaldo()*taxaRendimento));
    }
}
