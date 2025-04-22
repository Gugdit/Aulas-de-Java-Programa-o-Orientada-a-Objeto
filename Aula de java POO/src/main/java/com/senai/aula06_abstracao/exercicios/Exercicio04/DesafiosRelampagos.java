package com.senai.aula06_abstracao.exercicios.Exercicio04;

public class DesafiosRelampagos implements Eventos{
    @Override
    public void iniciarEvento() {
        System.out.println("""
                Desafio Relâmpago iniciado às 16:00 na Sala de Inovação.
                Participantes têm tempo limitado para resolver os desafios propostos.
                Agilidade e criatividade são essenciais!
                """);
    }

    @Override
    public void encerrarEvento() {
        System.out.println("""
                Desafio Relâmpago encerrado às 17:00.
                Soluções foram apresentadas e analisadas pela banca avaliadora.
                Parabéns a todos pela energia e empenho!
                """);
    }

    @Override
    public void premiarEvento() {
        System.out.println("""
                Premiação finalizada!
                Destaques:
                - 1º lugar: Equipe Lâmina Rápida
                - 2º lugar: Equipe Código Veloz
                Reconhecimento especial para criatividade: Equipe Relâmpago Azul.
                """);
    }
}
