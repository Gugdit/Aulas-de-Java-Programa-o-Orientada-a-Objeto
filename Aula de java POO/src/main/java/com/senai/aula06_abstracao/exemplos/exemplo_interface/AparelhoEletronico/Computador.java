package com.senai.aula06_abstracao.exemplos.exemplo_interface.AparelhoEletronico;

public class Computador implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("Computador Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador Desligado");
    }
}
