package com.senai.aula06_abstracao.exemplos.exemplo_interface.AparelhoEletronico;

public class Main {
    public static void main(String[] args) {
        AparelhoEletronico aparelhoEletronico1 = new Televisao();
        System.out.println("---------------Testando TV---------------");
        ligarEDesligarAparelhos(aparelhoEletronico1);
        System.out.println();

        System.out.println("---------------Testando PC---------------");
        AparelhoEletronico aparelhoEletronico2 = new Computador();
        ligarEDesligarAparelhos(aparelhoEletronico2
        );
    }
    public static void ligarEDesligarAparelhos(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
