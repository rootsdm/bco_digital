package org.example;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contaList;

    public Banco() {
    }

    public Banco(String nome, List<Conta> contaList) {
        this.nome = nome;
        this.contaList = contaList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }
}
