package alura.projetoBanco3;

import alura.projetoBanco2.cliente;

public class conta3 {
//    atributos da classe conta
    private double saldo = 0;
    private int agencia = 159;
    private int numero;
    private cliente3 titular;


    public boolean depositar(double valor){
        if(valor >= 0){
            this.saldo += valor;
            System.out.println("\n\nFoi depositado "+ saldo +" na sua conta.");
            return true;
        }else {
            return false;
        }
    }
    public boolean sacar(double valor){
        if(0 < valor && valor <= this.saldo){
            this.saldo -= valor;
//            System.out.println("\nSaque realizado com sucesso!");
            return true;
        }else{
//            System.out.println("\nValor inválido! Tente novamente");
            return false;
        }
    }
    public boolean tranferir(double valor, conta3 contaDestino){
        if(0 < valor && valor <= this.saldo){
            contaDestino.saldo += valor;
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public double consultarSaldo(){
        return this.saldo;
    }



    public void insereNumero(int numero){
        this.numero = numero;
    }
    public int consultarNumero(){
        return this.numero;
    }



    public void insereAgencia(int agencia){
        this.agencia = agencia;
    }
    public int consultarAgencia(){
        return this.agencia;
    }



    public void insereTitular(cliente3 titular){
        this.titular = titular;
    }
    public cliente3 consultarTitular(){
        return this.titular;
    }
}
