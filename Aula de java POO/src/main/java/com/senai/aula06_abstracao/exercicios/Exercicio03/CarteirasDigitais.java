package com.senai.aula06_abstracao.exercicios.Exercicio03;

public class CarteirasDigitais extends Pagamento{
    public CarteirasDigitais(String nomeDevedor, int idDevedor, String nomeRecebedor, int idRecebedor) {
        super(nomeDevedor, idDevedor, nomeRecebedor, idRecebedor);
    }

    @Override
    protected void autenticacaoUsuario() {
        System.out.println("Usuário autenticado para pagamento com carteiras digitais!!!");
    }

    @Override
    protected void validacaoAntiFraude() {
        System.out.println("Anti-fraude para carteiras digitais validada!!!");
    }

    @Override
    protected void registroDeTransacao() {
        System.out.println("Pagamento utilizando carteiras digitais realizada com sucesso!!!");
    }
}
