package alura.projetoBanco2;

public class criaCliente2 {
    public static void main(String[] args) {

//                                      TESTE BANCO

        cliente naza = new cliente();
        naza.nomeCompleto = "Nazareno Mateus de Sousa";
        naza.insereCpf("000.000.000-00");
        naza.profissao = "Estudante";

        conta2 contaDoNaza = new conta2();
        contaDoNaza.numero = 1;
        contaDoNaza.titular = naza;

        System.out.println("\n\t\t*******  INFORMÇÕES DO CLIENTE  *******\n" );
        System.out.printf("Nome completo: %s\n", contaDoNaza.titular.nomeCompleto);
//        System.out.println("Nome completo: " + contaDoNaza.titular.nomeCompleto);
        System.out.println("CPF: " + contaDoNaza.titular.consultaCpf());
        System.out.println("Profissão: " + contaDoNaza.titular.profissao);
        System.out.println("\n\n\t***  CONTA  ***\n");
        System.out.println("Agencia: " + contaDoNaza.agencia);
        System.out.println("numero da conta: " + contaDoNaza.numero);
        System.out.println("Saldo: " + contaDoNaza.consultarSaldo());





//                                   TESTE CONTA SEM CLIENTE
//        Teste para ver valor default se não instanciar objeto cliente dentro da contaNova
        conta2 contaDaLarissa = new conta2();
        System.out.println("\n\t\t*******  INFORMÇÕES DO CLIENTE  *******\n" );
        System.out.println("\n\n\t***  CONTA  ***\n");
        System.out.println("Agencia: " + contaDaLarissa.agencia);
        System.out.println("numero da conta: " + contaDaLarissa.numero);
        System.out.println("Saldo: " + contaDaLarissa.consultarSaldo());
        System.out.println("Titular: " + contaDaLarissa.titular);






//                              TESTE SAlDO NEGATIVO
        conta2 contaDoPaulo = new conta2();
        contaDoPaulo.depositar(100);
        System.out.println("\nSaldo conta do Paulo: " + contaDoPaulo.consultarSaldo());
//        Tentando sacar um valor maior que o saldo
        boolean sacou = contaDoPaulo.sacar(200);
        if(sacou){
            System.out.println("\nSaldo conta do Paulo: " + contaDoPaulo.consultarSaldo());
        }else{
            System.out.println("Não foi possível realizar o saque!");
        }
        boolean depositou = contaDoPaulo.depositar(-50);
        if(depositou){
            System.out.println("\nSaldo conta do Paulo: " + contaDoPaulo.consultarSaldo());
        }else{
            System.out.println("Não foi possível realizar o deposito!");

        }


    }
}
