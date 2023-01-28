package alura.projetoBanco2;

public class conta2 {
//    atributos da classe conta
    private double saldo = 0;
    public int agencia = 159;
    public int numero;
    public cliente titular;

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

    public boolean tranferir(double valor, conta2 contaDestino){
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

}
