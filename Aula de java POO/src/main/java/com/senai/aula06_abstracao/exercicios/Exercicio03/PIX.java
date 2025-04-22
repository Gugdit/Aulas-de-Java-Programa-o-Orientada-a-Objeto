package com.senai.aula06_abstracao.exercicios.Exercicio03;

public class PIX extends Pagamento{
    public PIX(String nomeDevedor, int idDevedor, String nomeRecebedor, int idRecebedor) {
        super(nomeDevedor, idDevedor, nomeRecebedor, idRecebedor);
    }

    @Override
    protected void autenticacaoUsuario() {
        System.out.println("Usuário autenticado para pagamento pelo PIX!!!");
    }

    @Override
    protected void validacaoAntiFraude() {
        System.out.println("Anti-fraude para PIX validada!!!");
    }

    @Override
    protected void registroDeTransacao() {
        System.out.println("Pagamento utilizando PIX realizada com sucesso!!!");
    }
}
