package com.senai.aula06_abstracao.exercicios.Exercicio04;

public class Main {
    public static void main(String[] args) {
        testeEvento(new EventosSociais());
        testeEvento(new Competicoes());
        testeEvento(new DesafiosRelampagos());
    }

    public static void testeEvento(Eventos eventos){
        if (eventos instanceof EventosSociais eventosSociais){
            System.out.println("----------------------Teste Eventos Sociais----------------------");
            eventosSociais.iniciarEvento();
            eventosSociais.ajustaCapacidade(500);
            eventosSociais.encerrarEvento();
            eventosSociais.premiarEvento();
        }
        if (eventos instanceof Competicoes competicoes){
            System.out.println("----------------------Teste Competições----------------------");
            competicoes.iniciarEvento();
            competicoes.ajustaCapacidade(40000000);
            competicoes.encerrarEvento();
            competicoes.premiarEvento();
        }
        if (eventos instanceof DesafiosRelampagos desafiosRelampagos){
            System.out.println("----------------------Teste Desafios Relâmpagos----------------------");
            desafiosRelampagos.iniciarEvento();
            desafiosRelampagos.ajustaCapacidade(300);
            desafiosRelampagos.encerrarEvento();
            desafiosRelampagos.premiarEvento();
        }
    }
}
