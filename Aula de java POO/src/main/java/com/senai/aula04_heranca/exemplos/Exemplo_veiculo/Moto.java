package com.senai.aula04_heranca.exemplos.Exemplo_veiculo;

class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Patida elétrica: "+(temPartidaEletrica ? "Sim" : "Não"));
    }
}
