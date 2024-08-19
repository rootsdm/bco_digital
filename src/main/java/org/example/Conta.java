package org.example;

public abstract class Conta implements Iconta{
    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private Cliente cliente;

    public Conta() {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta(Cliente cliente) {
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo =+ valor;
    }

    @Override
    public void transferir(double valor, Iconta contaDeDestino) {
        this.sacar(valor);
        contaDeDestino.depositar(valor);

    }



    public void imprimirInfosConta(){
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
    }


}
