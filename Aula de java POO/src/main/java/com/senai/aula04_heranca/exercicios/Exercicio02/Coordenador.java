package com.senai.aula04_heranca.exercicios.Exercicio02;

import java.util.ArrayList;

class Coordenador extends Funcionario {
    private ArrayList<Professor> equipeDeProfessores;

    public Coordenador(String nome, double salario, ArrayList<Professor> equipeDeProfessores) {
        super(nome, salario);
        this.equipeDeProfessores = equipeDeProfessores;
    }

    public ArrayList <Professor>getEquipeDeProfessores() {
        return equipeDeProfessores;
    }

    public void setEquipeDeProfessores(ArrayList<Professor> equipeDeProfessores) {
        this.equipeDeProfessores = equipeDeProfessores;
    }

    @Override
    public String toString() {
        return String.format("Coordenador: %s | Salário: R$%s | Equipe de Professores:  %s",getNome(),getSalario(),getEquipeDeProfessores());
    }
}
