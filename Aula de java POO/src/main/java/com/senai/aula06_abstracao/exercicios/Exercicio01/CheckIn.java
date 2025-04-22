package com.senai.aula06_abstracao.exercicios.Exercicio01;

public interface CheckIn {
    int PESO_MAXIMO_BAGAGEM = 30;




    static void mensagemFlySecure(){
        System.out.println("Check-in seguro realizado pela FlySecure!!");
    }

    void mensagemFinalizado();
    void validarDocumentos();
    void emitirCartoesEmbarque();

    default int ajustaPeso(int pesobagagem){
        if (validarPeso(pesobagagem)){
            System.out.println("Peso da bagagem é adequado!!");
            return pesobagagem;
        } else {
            System.out.println("Peso da bagagem não é adequado!!!");
            return pesobagagem;
        }
    }

    private boolean validarPeso(int pesoBagagem){
        return (pesoBagagem <= PESO_MAXIMO_BAGAGEM) && (pesoBagagem > 0);
    }





}
