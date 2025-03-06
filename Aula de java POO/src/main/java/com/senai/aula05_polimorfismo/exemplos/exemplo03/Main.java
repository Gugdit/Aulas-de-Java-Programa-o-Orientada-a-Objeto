package com.senai.aula05_polimorfismo.exemplos.exemplo03;

import com.senai.aula05_polimorfismo.exemplos.exemplo01.Calculadora;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        animal.fazerSom();


        emitirSom(new Cachorro());
        emitirSom(new Gato());
        emitirSom(new Animal());

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
    }

    public static void emitirSom(Animal animal){
        System.out.println("_______________________");
        animal.fazerSom();
    }
}
