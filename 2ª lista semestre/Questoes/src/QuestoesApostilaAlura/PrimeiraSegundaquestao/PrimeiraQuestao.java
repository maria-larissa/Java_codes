package QuestoesApostilaAlura.PrimeiraSegundaquestao;

public class PrimeiraQuestao {
    public static void main(String[] args) {
       Conta cliente1 = new Conta();
       cliente1.setAgencia("390514");
       cliente1.setNumero(45631812);
       cliente1.setDataAbertura("24/03/2023");
       cliente1.setTitular("Maria Larissa");

        System.out.printf("\tConta do(a) cliente %s\n", cliente1.getTitular());
        System.out.println("Data de abertura = " + cliente1.getDataAbertura());
        System.out.println("Agencia = " + cliente1.getAgencia());
        System.out.println("Numero = " + cliente1.getNumero());
        System.out.println("Saldo = " + cliente1.getSaldo());


        System.out.println(" ");
        if( cliente1.deposito(5000)){
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo = " + cliente1.getSaldo());
        }else{
            System.out.println("Erro ao depositar o valor!");
        }


        System.out.println(" ");
        if(cliente1.saque(800)){
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo = " + cliente1.getSaldo());
        }else{
            System.out.println("Erro ao sacar o valor!");
        }

        System.out.printf("\nO rendimento da sua conte é de %.2f.\n", cliente1.calculaRendimento());
    }
}
