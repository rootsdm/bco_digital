package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        cli1.setNome("Jose da silva");

        Conta ctaCorrente = new ContaCorrente(cli1);
        ctaCorrente.setAgencia(123);
        ctaCorrente.setCliente(cli1);
        ctaCorrente.setNumero(999);
        ctaCorrente.setSaldo(0.0);
        Conta ctaPoupanca = new ContaPoupanca(cli1);
        ctaPoupanca.setAgencia(987);
        ctaPoupanca.setNumero(555);
        ctaPoupanca.setSaldo(1.0);
        ctaPoupanca.setCliente(cli1);
        ctaCorrente.depositar(500);
        ctaCorrente.transferir(100, ctaPoupanca);
        ctaCorrente.imprimirExtratoBancario();
        ctaPoupanca.imprimirExtratoBancario();


    }
}