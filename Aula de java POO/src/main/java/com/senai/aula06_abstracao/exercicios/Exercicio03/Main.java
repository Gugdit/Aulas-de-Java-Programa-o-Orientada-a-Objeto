package com.senai.aula06_abstracao.exercicios.Exercicio03;

public class Main {
    public static void main(String[] args) {
        testePagamento(new CartaoDeCredito("João",1234,"Lucio",4321));
        testePagamento(new PIX("Jerimundo",1982,"Lucia",4124));
        testePagamento(new CarteirasDigitais("Pedro",1111,"Lucas",5125));

    }
    public static void testePagamento(Pagamento pagamento){
        if (pagamento instanceof CartaoDeCredito cartaoDeCredito){
            System.out.println("-------------Teste Cartão de Crédito-------------");
            cartaoDeCredito.autenticacaoUsuario();
            cartaoDeCredito.validacaoAntiFraude();
            cartaoDeCredito.registroDeTransacao();
            cartaoDeCredito.validarTransacao();
            cartaoDeCredito.registroDeLogs();
        }
        if (pagamento instanceof PIX pix){
            System.out.println("-------------Teste PIX-------------");
            pix.autenticacaoUsuario();
            pix.validacaoAntiFraude();
            pix.registroDeTransacao();
            pix.validarTransacao();
            pix.registroDeLogs();
        }
        if (pagamento instanceof CarteirasDigitais carteirasDigitais){
            System.out.println("-------------Teste Carteiras Digitais-------------");
            carteirasDigitais.autenticacaoUsuario();
            carteirasDigitais.validacaoAntiFraude();
            carteirasDigitais.registroDeTransacao();
            carteirasDigitais.validarTransacao();
            carteirasDigitais.registroDeLogs();
        }
    }
}
