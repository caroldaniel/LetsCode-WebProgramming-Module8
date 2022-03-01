package com.example.santander.model;

public class ClienteModel {
    // Atributos privados
    private String nome;
    private String email;
    private String dataNasc;

    // Método para requisição de nome
    public String getNome() {
        return nome;
    }

    // Método para requisição de e-mail
    public String getEmail() {
        return email;
    }

    // Método para requisição de data de nascimento
    public String getData() {
        return dataNasc;
    }

    // Método para definição de nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para requisição de email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método para requisição de data de nascimento
    public void setData(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}
