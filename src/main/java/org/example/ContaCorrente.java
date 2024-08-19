package org.example;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtratoBancario() {
        System.out.println("===  Extrato Conta Corrente ===");
        super.imprimirInfosConta();
    }

}
