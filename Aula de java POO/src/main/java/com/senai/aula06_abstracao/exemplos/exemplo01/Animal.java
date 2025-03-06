package com.senai.aula06_abstracao.exemplos.exemplo01;

abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void dormir(){
        System.out.println(nome + " esta dormindo.");
    }

    abstract public void fazerSom();


}
