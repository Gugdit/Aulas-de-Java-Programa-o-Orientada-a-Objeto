package com.senai.aula06_abstracao.exemplos.exemplo_interface.smartwatch_avancado;

public class SmartWatchAvancado implements SensorCardiaco,SensorPasso,SensorSono {

    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardiaca: 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos Hoje: 50000");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade do sono: Sono profundo!");
    }
    void exibirDispositivos(){
        System.out.println("SmartWatch conectado aos dispositivos: ..........");
    }
}
