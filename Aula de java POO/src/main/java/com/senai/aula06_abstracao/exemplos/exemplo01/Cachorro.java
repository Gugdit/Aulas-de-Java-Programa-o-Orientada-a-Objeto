package com.senai.aula06_abstracao.exemplos.exemplo01;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void fazerSom() {
        System.out.println(nome + " está fazendo: AUAUAUAUAUAUAU!!!!");
    }
}
