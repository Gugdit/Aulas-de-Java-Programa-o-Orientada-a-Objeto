package com.senai.aula05_polimorfismo.exemplos.exemplo04;

public class Pagamento {
    private String nome;

    public Pagamento(String nome) {
        this.nome = nome;
    }

    public double calcularPagamento(){
        return 0.0;
    }

    public String getNome() {
        return nome;
    }
}
