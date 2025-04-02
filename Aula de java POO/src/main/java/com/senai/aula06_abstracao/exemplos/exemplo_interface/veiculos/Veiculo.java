package com.senai.aula06_abstracao.exemplos.exemplo_interface.veiculos;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("BEE BEE!!!");
    }
}
