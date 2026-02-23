package br.com.project.BancoPraticaPoo;

public class Teste {
    public static void main(String[] args) {
        // Está classe é apenas para testar as funcionalidades da Classe Conta
        Conta contaCorrente = new Conta(001, 12345);
        Conta contaCorrente2 = new Conta(002, 54321);



        contaCorrente.depositar(50);
        System.out.println(contaCorrente.getSaldo());
        contaCorrente.sacar(30);

        

        contaCorrente.transferir(contaCorrente2, 10);
        System.out.println(contaCorrente2.getSaldo());
        
    }
}
