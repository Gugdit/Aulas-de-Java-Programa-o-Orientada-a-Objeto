package com.senai.aula06_abstracao.exemplos.exemplo_interface.controlador_de_equipamento_inteligente;

public class TVSmart implements AparelhoInteligente {
    private int volume;

    public TVSmart(int volume) {
        this.volume =0;
    }

    @Override
    public void ligar() {
        System.out.println("TVSmart ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("TVSmart desligada!");
    }

    public void aumentarVolume(){
        System.out.println("Volume: " + (volume = ajustaNivel(volume,1)));
    }

    public void baixarVolume(){
        System.out.println("Volume: " + (volume = ajustaNivel(volume,-1)));
    }
}
