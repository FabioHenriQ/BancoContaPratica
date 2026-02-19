package br.com.project.BancoPraticaPoo;

public class Conta {
    
    double saldo = 0.0;
    int agencia;
    int numero;
    
    public Conta() {

    }

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Falha ao sacar R$ " + valor +". Saldo insuficiente. Seu saldo atual é: R$ " + this.saldo);  
        } else {
            this.saldo -= valor;
            System.out.println("Você sacou R$ " + valor +". Saldo atual é: R$ " + this.saldo); 
        }

    }

    public String verificarSaldo() {
        return "O saldo da conta é: " + this.saldo;
    }

    public void transferir(Conta NumeroContaDestino, double valor) {
        if (valor > this.saldo) {
            System.out.println("Falha ao transferir R$ " + valor +". Saldo insuficiente. Seu saldo atual é: R$ " + this.saldo);
        } else {
            NumeroContaDestino.depositar(valor);
            this.saldo -= valor;
            System.out.println("Você transferiu R$ " + valor +" Para: " + NumeroContaDestino.numero + ". Seu Saldo atual é: R$ " + this.saldo);
        }
    }
}
