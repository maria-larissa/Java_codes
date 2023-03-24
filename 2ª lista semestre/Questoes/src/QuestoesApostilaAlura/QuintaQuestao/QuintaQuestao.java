package QuestoesApostilaAlura.QuintaQuestao;

import QuestoesApostilaAlura.TerceiraQuestao.Conta1;

public class QuintaQuestao {
    public static void main(String[] args) {
        Conta1 cliente4 = new Conta1();
        cliente4.setDataAbertura("24/06/2021");
        cliente4.setTitular("Danilo");
        cliente4.setAgencia("24621");
        cliente4.setNumero(4976260);
        cliente4.deposito(100);



        Conta1 cliente5 = cliente4;

        System.out.println("Comparando cliente4 e cliente5");
        if(cliente4 == cliente5){
            System.out.println("São iguais!");
        }else{
            System.out.println("Não são iguais!");
        }
    }
}
