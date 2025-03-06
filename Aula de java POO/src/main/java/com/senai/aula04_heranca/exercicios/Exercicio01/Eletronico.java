package com.senai.aula04_heranca.exercicios.Exercicio01;
class Eletronico extends Produto {
    private int voltagem;

    public Eletronico(String nome, double preço, int quantidade, int voltagem) {
        super(nome, preço, quantidade);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Tipo: Eletrônico | Preço: %s | Quantidade: %s | Voltagem: %sv",getNome(),getPreco(),getQuantidade(),getVoltagem());
    }
}
