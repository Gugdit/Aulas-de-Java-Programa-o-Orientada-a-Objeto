package com.senai.aula06_abstracao.exemplos.classe_abstrata.conta_bancaria;

class ContaCorrente extends Conta {
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo -= 20;
    }
}
