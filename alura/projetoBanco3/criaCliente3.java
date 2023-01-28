package alura.projetoBanco3;


public class criaCliente3 {
    public static void main(String[] args) {

//                                      Banco encapsulado
        cliente3 larissa = new cliente3();
        larissa.insereCpf("000.000.000-00");
        larissa.insereNome("LARISSA");
        larissa.insereProfissao("Estudante");

        conta3 contaDaLarissa = new conta3();
        contaDaLarissa.depositar(56);
        contaDaLarissa.insereTitular(larissa);

        System.out.println("Saldo = " + contaDaLarissa.consultarSaldo());
        cliente3 titular = contaDaLarissa.consultarTitular();
        System.out.println("Nome = " + titular.consultarNome() );
        System.out.println("CPF = " + titular.consultarCpf() );
        System.out.println("Profissão = " + titular.consultarProfissao());


    }
}
