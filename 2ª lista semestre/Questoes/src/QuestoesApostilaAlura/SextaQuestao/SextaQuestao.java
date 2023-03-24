package QuestoesApostilaAlura.SextaQuestao;

public class SextaQuestao {
    public static void main(String[] args) {
        Conta2 cliente6 = new Conta2();
        cliente6.setDataAbertura(24, 6, 2021);
        cliente6.setTitular("Danilo");
        cliente6.setAgencia("24621");
        cliente6.setNumero(4976260);
        cliente6.deposito(100);
        cliente6.info();

        System.out.println(" ");
        Conta2 cliente7 = new Conta2();
        cliente7.setDataAbertura(24, 12, 2015);
        cliente7.setTitular("Danilo");
        cliente7.setAgencia("24621");
        cliente7.setNumero(4976260);
        cliente7.deposito(100);
        cliente7.info();
    }
}
