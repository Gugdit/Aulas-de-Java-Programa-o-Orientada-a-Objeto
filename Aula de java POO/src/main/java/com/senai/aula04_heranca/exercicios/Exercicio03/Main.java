package com.senai.aula04_heranca.exercicios.Exercicio03;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Pedido_Presencial pedidoPresencial1 = new Pedido_Presencial(841,100);
        Pedido_Online pedidoOnline1 = new Pedido_Online(412,100);

        System.out.println(pedidoPresencial1.getValorTotal());
        System.out.println(pedidoOnline1.getValorTotal());
    }
}
