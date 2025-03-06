package com.senai.aula06_abstracao.exemplos.exemplo01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("David");
        Gato gato = new Gato("Julio");
        emitirSom(cachorro);
        emitirSom(gato);

        List<Animal> listaAnimal = new ArrayList<>();

        listaAnimal.add(cachorro);
        listaAnimal.add(gato);

        listaAnimal.forEach(Animal::dormir);
    }

    public static void emitirSom(Animal animal){
        animal.fazerSom();
    }
}
