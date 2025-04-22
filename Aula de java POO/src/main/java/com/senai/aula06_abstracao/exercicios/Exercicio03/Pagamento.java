package com.senai.aula06_abstracao.exercicios.Exercicio03;

public abstract class Pagamento {
    protected String nomeDevedor;
    protected int idDevedor;
    protected String nomeRecebedor;
    protected int idRecebedor;

    public Pagamento(String nomeDevedor, int idDevedor, String nomeRecebedor, int idRecebedor) {
        this.nomeDevedor = nomeDevedor;
        this.idDevedor = idDevedor;
        this.nomeRecebedor = nomeRecebedor;
        this.idRecebedor = idRecebedor;
    }

    public String getNomeDevedor() {
        return nomeDevedor;
    }

    public void setNomeDevedor(String nomeDevedor) {
        this.nomeDevedor = nomeDevedor;
    }

    public int getIdDevedor() {
        return idDevedor;
    }

    public void setIdDevedor(int idDevedor) {
        this.idDevedor = idDevedor;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public int getIdRecebedor() {
        return idRecebedor;
    }

    public void setIdRecebedor(int idRecebedor) {
        this.idRecebedor = idRecebedor;
    }

    protected abstract void autenticacaoUsuario();
    protected abstract void validacaoAntiFraude();
    protected abstract void registroDeTransacao();

    public void validarTransacao(){
        System.out.println("Transação do Devedor: "+nomeDevedor+" -  Id: "+idDevedor+ " com o Recebedor: "+nomeRecebedor+" - Id: "+idRecebedor+" é válida");
    }
    public void registroDeLogs(){
        System.out.println("Transação entre devedor e recebedor: "+nomeDevedor+" e "+nomeRecebedor+" foi realizada com sucesso!!!");
    }


}
