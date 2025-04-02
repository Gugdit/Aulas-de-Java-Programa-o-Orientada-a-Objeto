package com.senai.aula06_abstracao.exemplos.classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testeContas(new ContaCorrente("Gustavo", 10000));
        testeContas(new ContaPoupanca("Rafael", 10000));
    }

    private static void testeContas(Conta conta) {
        System.out.println("--------------Teste Conta--------------");
        System.out.println("antes");
        conta.consultarSaldo();
        conta.aplicarTaxaMensal();
        System.out.println("depois");
        conta.consultarSaldo();

    }
}
