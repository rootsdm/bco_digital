package org.example;

public interface Iconta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Iconta contaDeDestino);

    void imprimirExtratoBancario();

}

