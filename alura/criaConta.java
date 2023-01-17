package alura;

import java.util.Scanner;

public class criaConta {
    public static void main(String[] args) {

//        conta1 é um ponteiro para o objeto do tipo conta que foi criado
        conta conta1 = new conta();
        conta1.saldo = 200;
        conta1.titular = "larissa";
        conta1.numero = 1;
        System.out.println("\t\tConta1\n");
        System.out.println("Titular: "+ conta1.titular);
        System.out.println("Agencia: " + conta1.agencia);
        System.out.println("Numero: " + conta1.numero);
        System.out.println("Saldo: " + conta1.saldo+"\n");


        conta conta2 = new conta();
        conta2.saldo = 30;
        conta2.titular = "lana";
        conta2.numero = 2;
        conta2.agencia = 201;
        System.out.println("\t\tConta2\n");
        System.out.println("Titular: "+ conta2.titular);
        System.out.println("Agencia: " + conta2.agencia);
        System.out.println("Numero: " + conta2.numero);
        System.out.println("Saldo: " + conta2.saldo+"\n");


        conta conta3 = conta2;
        System.out.println("Saldo conta3: "+ conta3.saldo);
        conta3.saldo -=50;
        System.out.println("Saldo conta3: "+ conta3.saldo);
        System.out.println("Saldo conta2: "+ conta2.saldo);



//        testando função depositar
        conta conta4 = new conta();
        System.out.println("\n\t\t-----Depositar-----\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado: ");
        double valor1 = input.nextDouble();
        conta4.depositar(valor1);
        System.out.println("Saldo conta4 = "+ conta4.saldo);


        System.out.println("\n\t\t-----Sacar-----\n");
        System.out.println("Digite o valor a ser sacado: ");
        double valor2 = input.nextDouble();
        if(conta4.sacar(valor2)){
            System.out.println("\nSaque realizado com sucesso!");
        }else{
            System.out.println("\nValor inválido ou saldo insuficiente! Por favor, tente novamente");
        }
        System.out.println("Saldo conta4 = "+ conta4.saldo);



//        testando metodo tranferência

        conta minhaConta = new conta();
        minhaConta.depositar(5000);
        minhaConta.numero = 1;
        minhaConta.titular = "Larissa";
        System.out.println("Saldo minha conta = "+ minhaConta.saldo);

        conta amor = new conta();
        amor.depositar(10.50);
        amor.numero = 2;
        amor.titular = "Nazareno";
        System.out.println("Saldo conta amor = "+ amor.saldo);


        System.out.println("\n\t\t-----Transferir-----\n");
        System.out.println("Quanto voce deseja tranferir para " + amor.titular + "?");
        double trans = input.nextDouble();
        if(minhaConta.tranferir(trans, amor)){
            System.out.println("Novo saldo minha conta = "+ minhaConta.saldo);
            System.out.println("Novo saldo conta amor = "+ amor.saldo);
        }else{
            System.out.println("\nValor inválido ou saldo insuficiente! Por favor, tente novamente");
        }

    }
}
