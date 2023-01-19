package alura.projetoBanco2;

public class contaNova {
//    atributos da classe conta
    double saldo = 0;
    int agencia = 159;
    int numero;
    cliente titular;

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("\n\nFoi depositado "+ saldo +" na sua conta.");
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

    public boolean tranferir(double valor, contaNova contaDestino){
        if(0 < valor && valor <= this.saldo){
            contaDestino.saldo += valor;
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }


}
