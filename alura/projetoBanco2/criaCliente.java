package alura.projetoBanco2;

public class criaCliente {
    public static void main(String[] args) {
        cliente naza = new cliente();
        naza.nomeCompleto = "Nazareno Mateus de Sousa";
        naza.cpf = "000.000.000-00";
        naza.profissao = "Estudante";

        contaNova contaDoNaza = new contaNova();
        contaDoNaza.numero = 1;
        contaDoNaza.titular = naza;

        System.out.println("\n\t\t*******  INFORMÇÕES DO CLIENTE  *******\n" );
        System.out.printf("Nome completo: %s\n", contaDoNaza.titular.nomeCompleto);
//        System.out.println("Nome completo: " + contaDoNaza.titular.nomeCompleto);
        System.out.println("CPF: " + contaDoNaza.titular.cpf);
        System.out.println("Profissão: " + contaDoNaza.titular.profissao);
        System.out.println("\n\n\t***  CONTA  ***\n");
        System.out.println("Agencia: " + contaDoNaza.agencia);
        System.out.println("numero da conta: " + contaDoNaza.numero);
        System.out.println("Saldo: " + contaDoNaza.saldo);


//        Teste para ver valor default se não instanciar objeto cliente dentro da contaNova
        contaNova contaDaLarissa = new contaNova();
        System.out.println("\n\t\t*******  INFORMÇÕES DO CLIENTE  *******\n" );
        System.out.println("\n\n\t***  CONTA  ***\n");
        System.out.println("Agencia: " + contaDaLarissa.agencia);
        System.out.println("numero da conta: " + contaDaLarissa.numero);
        System.out.println("Saldo: " + contaDaLarissa.saldo);
        System.out.println("Titular: " + contaDaLarissa.titular);


    }
}
