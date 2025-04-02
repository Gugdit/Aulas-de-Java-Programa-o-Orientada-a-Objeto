package com.senai.aula06_abstracao.exercicios.Exercicio01;

public class CheckInAzul implements CheckIn{
    @Override
    public void mensagemFinalizado() {
        System.out.println("---------------Check-in realizado pela a empresa AZUL---------------");
    }

    @Override
    public void validarDocumentos() {
        System.out.println("Documentos validados pela companhia AZUL");
    }

    @Override
    public void emitirCartoesEmbarque() {
        System.out.println("Cartão emitido pela companhia AZUL");
    }

}
