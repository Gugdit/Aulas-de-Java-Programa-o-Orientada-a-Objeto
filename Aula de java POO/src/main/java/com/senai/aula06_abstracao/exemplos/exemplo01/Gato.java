package com.senai.aula06_abstracao.exemplos.exemplo01;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " está miando: MIAU MIAU MIAU MIAU!!!!!!!!");
    }
}
