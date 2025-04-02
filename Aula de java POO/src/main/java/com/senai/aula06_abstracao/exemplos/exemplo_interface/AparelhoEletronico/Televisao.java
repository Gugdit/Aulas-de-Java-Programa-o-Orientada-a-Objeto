package com.senai.aula06_abstracao.exemplos.exemplo_interface.AparelhoEletronico;

public class Televisao implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("Televisão Ligada");

    }

    @Override
    public void desligar() {
        System.out.println("Televisão Desligado");
    }
}
