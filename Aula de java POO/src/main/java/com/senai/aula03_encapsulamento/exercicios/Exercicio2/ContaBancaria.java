package com.senai.aula03_encapsulamento.exercicios.Exercicio2;

public class ContaBancaria {
    private int numeroDaConta;
    private Usuario usuario;
    private double saldo;
    private String banco;
    private String tipo;

    public ContaBancaria(int numeroDaConta, Usuario usuario, double saldo, String banco, String tipo) {
        this.numeroDaConta = numeroDaConta;
        this.usuario = usuario;
        this.saldo = saldo;
        this.banco = banco;
        this.tipo = tipo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        System.out.println("Saldo: o cliente "+ this.usuario.getNome()+" tem saldo de "+ this.saldo);
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Você não pode ter saldo negativo");
        }

    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque: de valor de "+valor+" foi sacado da conta do usuario "+this.usuario.getNome()+ ". Saldo depois da ação: "+ this.saldo);
        } else {
            System.out.println("Saldo nsuficiente para sacar, saldo atual: "+ saldo);
        }
        return saldo;
    }

    public double depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor depositado não é positivo, ou é nulo!!. Saldo atual: "+saldo);

        } else if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito: de valor de "+valor+" foi colocado na conta do usuario "+this.usuario.getNome()+ ". Saldo depois da ação: "+ this.saldo);
        }
        return saldo;
    }


    @Override
    public String toString() {
        return String.format("Número da Conta: %s | Usuário: (%s) | Saldo: %s | Banco: %s | Tipo: %s", numeroDaConta,usuario,saldo,banco,tipo);
    }
}

/*public double transferencia(double valor, ContaBancaria contaDestino){
        System.out.println("");
        System.out.println("Saldo da conta do recebedor: "+ contaDestino.saldo);
        contaDestino.depositar(valor);
        return this.sacar(valor);
    }*/