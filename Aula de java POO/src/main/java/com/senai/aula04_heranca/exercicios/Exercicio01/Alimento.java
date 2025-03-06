package com.senai.aula04_heranca.exercicios.Exercicio01;

class Alimento extends Produto {
    private String dataDeValidade;

    public Alimento(String nome, double preço, int quantidade, String dataDeValidade) {
        super(nome, preço, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Tipo: Alimento | Preço: %s | Quantidade: %s | Data de Validade: %s",getNome(),getPreco(),getQuantidade(),getDataDeValidade());
    }
}
