package com.senai.aula06_abstracao.exercicios.Exercicio04;

public interface Eventos {
    int PESSOAS_MAXIMAS_PERMITIDAS = 500;


    void iniciarEvento();
    void encerrarEvento();
    void premiarEvento();

    static void mensagemBemVindo(){
        System.out.println("Bem-vindo ao evento!!!!");
    }

    default int ajustaCapacidade(int pessoasEvento){
        if (validarCapacidade(pessoasEvento)){
            System.out.println("O evento está com capacidade normal.");
            return pessoasEvento;
        } else {
            System.out.println("O número de pessoas comprometem a integridade do evento!!!!");
            return pessoasEvento;
        }

    }

    private boolean validarCapacidade(int pessoasEvento){
        return (pessoasEvento <= PESSOAS_MAXIMAS_PERMITIDAS) && (pessoasEvento > 0);
    }

}
