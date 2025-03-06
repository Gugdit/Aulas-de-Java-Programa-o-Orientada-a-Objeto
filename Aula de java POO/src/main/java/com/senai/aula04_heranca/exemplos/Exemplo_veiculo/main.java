package com.senai.aula04_heranca.exemplos.Exemplo_veiculo;

public class main {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda",2015,4);
        Moto moto = new Moto("Voltz",2020,true);

        carro.exibirDetalhes();
        moto.exibirDetalhes();

    }
}
