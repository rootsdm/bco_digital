package org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void imprimirExtratoBancario() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosConta();
    }
}

