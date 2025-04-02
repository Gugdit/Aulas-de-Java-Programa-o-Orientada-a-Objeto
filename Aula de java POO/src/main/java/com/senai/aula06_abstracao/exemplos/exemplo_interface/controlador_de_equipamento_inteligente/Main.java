package com.senai.aula06_abstracao.exemplos.exemplo_interface.controlador_de_equipamento_inteligente;

public class Main {
    public static void main(String[] args) {
        testeAparelhos(new TVSmart(20));
        testeAparelhos(new LampadaInteligente(30));

    }

    private static void testeAparelhos(AparelhoInteligente aparelhoInteligente){
        System.out.println("----------Teste Aparelhos----------");

        aparelhoInteligente.ligar();
        if (aparelhoInteligente instanceof TVSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.aumentarVolume();
        } else if (aparelhoInteligente instanceof LampadaInteligente lampadaInteligente) {
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.baixarBrilho();
        }
        aparelhoInteligente.desligar();

    }
}
