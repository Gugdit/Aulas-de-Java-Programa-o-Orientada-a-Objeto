package com.senai.aula06_abstracao.exercicios.Exercicio04;

public class Competicoes implements Eventos{
    @Override
    public void iniciarEvento() {
        System.out.println("""
                Competição iniciada às 14:00 na Arena de Esportes.
                Equipes e competidores já posicionados para as primeiras disputas.
                Boa sorte a todos!
                """);
    }

    @Override
    public void encerrarEvento() {
        System.out.println("""
                Competição encerrada às 20:00.
                Todas as partidas e desafios foram concluídos.
                Agradecemos a todos os competidores pela dedicação!
                """);
    }

    @Override
    public void premiarEvento() {
        System.out.println("""
                Cerimônia de premiação concluída com sucesso.
                Medalhistas:
                - Ouro: Equipe Alpha
                - Prata: Equipe Bravo
                - Bronze: Equipe Delta
                Parabéns aos vencedores!
                """);
    }
}
