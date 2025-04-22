package com.senai.aula06_abstracao.exercicios.Exercicio04;

public class EventosSociais implements Eventos{

    @Override
    public void iniciarEvento() {
        System.out.println("""
                Evento social iniciado às 19:00 no Salão Principal.
                Participantes estão sendo recepcionados.
                """);
    }

    @Override
    public void encerrarEvento() {
        System.out.println("""
                Evento social encerrado às 23:00.
                Atividades concluídas com sucesso.
                Agradecemos a presença de todos.
                """);
    }

    @Override
    public void premiarEvento() {
        System.out.println("""
                Cerimônia de premiação realizada.
                Vencedores: João Silva (Melhor Apresentação), Maria Oliveira (Participação Destaque).
                Parabéns!
                """);
    }
}
