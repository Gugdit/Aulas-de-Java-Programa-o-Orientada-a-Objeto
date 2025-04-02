package com.senai.aula06_abstracao.exemplos.exemplo_interface.controlador_de_equipamento_inteligente;

public interface AparelhoInteligente {
    int NIVEL_MAXIMO = 100;

    void ligar();
    void desligar();

    default int ajustaNivel(int nivelAtual, int ajuste){
        if(validarNivel(nivelAtual,ajuste)){
            return  nivelAtual+ajuste;
        }else {
            return nivelAtual;
        }
    }

    static void mensagemBemVindo(){
        System.out.println("Bem-vindo ao Controle Remoto Inteligente");
    }

    private boolean validarNivel(int nivel,int ajuste){
        return (nivel>=0) && (nivel<= NIVEL_MAXIMO) && (nivel+ajuste != -1) && (nivel+ajuste != NIVEL_MAXIMO+1);
    }
}
