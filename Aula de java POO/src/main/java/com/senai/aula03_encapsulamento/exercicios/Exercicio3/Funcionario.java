package com.senai.aula03_encapsulamento.exercicios.Exercicio3;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private String[] cargos = {"Gerente", "Analista", "Programador"};

    public Funcionario(String nome, double salario,int idCargo) {
        this.nome = nome;
        if (salario<1320) {
            this.salario = 1320;
            System.out.println("O salário não pode ser menor ou igual a um salário minímo!!!");
        }else{
            this.salario=salario;
        }
        if (idCargo > 3 && idCargo <= 0) {
            this.cargo = cargos[3];
            System.out.println("Digite um número entre os listados!!!!");
        } else{
            this.cargo = cargos[idCargo];
        }
    }
    public String getNome() {
        return nome;
    }

    public Boolean setNome(String nome) {
        if (nome ==null || nome.isEmpty()){
            System.out.println("O nome está vazio!!!!");
            return true;
        }else {
            this.nome = nome;
            return false;
        }
    }

    public double getSalario() {
        return salario;
    }

    public Boolean setSalario(double salario) {
        if (salario > 1320){
            this.salario = salario;
            return false;
        } else{
            System.out.println("O salário não pode ser menor ou igual a um salário minímo!!!");
            return true;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public Boolean setCargo(int idCargo){
        if (idCargo > 0 && idCargo < 3){
            this.cargo = cargos[idCargo];
            return false;
        }else {
            System.out.println("Escolha um cargo válido!!!");
            return true;
        }

    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Cargo: %s | Salário: R$%s ",nome, cargo,salario);
    }

    public void visualizarSalario(){
        System.out.println("Salário do funcionário R$: " + this.getSalario());
    }

    public Boolean alterarSalario(double novoValor){
        return this.setSalario(novoValor);
    }

    public double alterarSalarioPercentual(double valorPercentual){
        return this.salario += (this.salario * (valorPercentual /100));

    }
}
