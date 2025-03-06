package com.senai.aula04_heranca.exercicios.Exercicio04;

public class Main {
    public static void main(String[] args) {
        Paciente_Particular pacienteParticular1 = new Paciente_Particular("Lucas",62,623);
        Paciente_Convenio pacienteConvenio1 = new Paciente_Convenio("Maria",51,789,500);
        System.out.println(pacienteParticular1.getCustoConsulta());
        System.out.println(pacienteConvenio1.getCustoConvenio());
    }
}
