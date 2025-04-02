package com.senai.aula06_abstracao.exercicios.Exercicio02;

class BicicletaEntrega extends VeiculoEntrega{
    private int capacidadeAtual;

    public BicicletaEntrega(double velocidadeAtual, double distanciaDestino, int capacidadeAtual) {
        super(velocidadeAtual, distanciaDestino);
        this.capacidadeAtual = capacidadeAtual;
        super.setCapacidadeMaxima(capacidadeAtual);
    }

    @Override
    public void capacidadeMaxima() {
        if (validarCapacidade(getCapacidadeMaxima())){
            System.out.println("Capacidade adequada,capacidade: "+getCapacidadeMaxima());
        } else {
            System.out.println("Capacidade inadequada, capacidade: "+getCapacidadeMaxima());
        }
    }

    @Override
    double aumentarVelocidade() {
        System.out.println("Velocidade da bicicleta agora é: " + getVelocidadeAtual()+"km/h");
        return getVelocidadeAtual();
    }

    @Override
    double diminuirVelocidade() {
        setVelocidadeAtual(getVelocidadeAtual()-5);
        System.out.println("Velocidade da bicicleta agora é: " + getVelocidadeAtual() +"km/h");
        return getVelocidadeAtual();
    }


    @Override
    void calcularTempoEstimado() {
        double velocidadeResultado = super.getVelocidadeAtual() / super.getDistanciaDestino();
        double velocidadeResultado2 = velocidadeResultado * 2;
        double velocidadeResultado3 = velocidadeResultado2 *60;
        System.out.println("O tempo até chegar ao destino é: "+velocidadeResultado2+" horas!!!, ou "+velocidadeResultado3+" minutos");
    }



    @Override
    void detalhesVeiculo() {
        System.out.println("""
                Veículo: Bicicleta
                Rodas: 2
                Marca: ARO 29 KRW Alumínio
                Data de fabricação: 07/12/2020
                """);
    }

    private boolean validarCapacidade(int capacidadeMaxima){
        return (super.getCapacidadeMaxima() <= 30) && (capacidadeMaxima > 0);
    }


}
