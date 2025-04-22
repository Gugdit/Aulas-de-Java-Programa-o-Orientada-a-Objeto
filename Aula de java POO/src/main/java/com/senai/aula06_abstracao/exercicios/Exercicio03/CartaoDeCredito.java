package com.senai.aula06_abstracao.exercicios.Exercicio03;

public class CartaoDeCredito extends Pagamento{
    public CartaoDeCredito(String nomeDevedor, int idDevedor, String nomeRecebedor, int idRecebedor) {
        super(nomeDevedor, idDevedor, nomeRecebedor, idRecebedor);
    }

    @Override
    protected void autenticacaoUsuario() {
        System.out.println("Usuário autenticado para pagamento com cartão de crédito!!!");
    }

    @Override
    protected void validacaoAntiFraude() {
        System.out.println("Anti-fraude para cartão de crédito validada!!!");
    }

    @Override
    protected void registroDeTransacao() {
        System.out.println("Pagamento utilizando cartão de crédito realizado com sucesso!!!");
    }
}
