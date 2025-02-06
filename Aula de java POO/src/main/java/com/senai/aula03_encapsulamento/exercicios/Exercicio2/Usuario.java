package com.senai.aula03_encapsulamento.exercicios.Exercicio2;

import java.util.Objects;

public class Usuario {
    private String nome;
    private String cpf;
    private String dataDeNascimento;

    public Usuario(String nome, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Data de Nascimento: %s", nome, cpf, dataDeNascimento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(cpf, usuario.cpf) && Objects.equals(dataDeNascimento, usuario.dataDeNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, dataDeNascimento);
    }
}
