package com.senai.aula04_heranca.exemplos.Exemplo_contaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Lucas",100,10);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Lucas",500,0.10);

        contaCorrente.sacar(105);
        contaCorrente.exibirSaldo();

        contaPoupanca.aplicarRendimento();
        contaPoupanca.exibirSaldo();
    }
}
