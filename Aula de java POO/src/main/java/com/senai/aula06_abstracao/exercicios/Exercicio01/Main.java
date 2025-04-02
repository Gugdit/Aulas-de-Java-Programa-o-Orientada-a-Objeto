package com.senai.aula06_abstracao.exercicios.Exercicio01;

public class Main {
    public static void main(String[] args) {
        checkIN(new CheckInAzul());
        checkIN(new CheckInLatam());

    }
    private static void checkIN(CheckIn checkIn){
        CheckIn.mensagemFlySecure();
        if(checkIn instanceof CheckInAzul checkInAzul){
            checkInAzul.validarDocumentos();
            checkInAzul.emitirCartoesEmbarque();
            checkInAzul.ajustaPeso(30);
            checkInAzul.ajustaPeso(40);
            checkInAzul.mensagemFinalizado();
        } else if (checkIn instanceof CheckInLatam checkInLatam) {
            checkInLatam.validarDocumentos();
            checkInLatam.emitirCartoesEmbarque();
            checkInLatam.ajustaPeso(30);
            checkInLatam.ajustaPeso(40);
            checkInLatam.mensagemFinalizado();
        }
    }
}
