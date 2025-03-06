package com.senai.aula05_polimorfismo.exemplos.exemplo01;

public class main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(2,3));
        System.out.println(calculadora.somar(2,3,4));
        System.out.println(calculadora.somar(2.0f,3.0f));
        System.out.println(calculadora.somar(2.0f,3));
        System.out.println(calculadora.somar(2,3.0f));
    }
}
