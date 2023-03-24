package QuestoesApostilaAlura.QuartaQuestao;

import QuestoesApostilaAlura.TerceiraQuestao.Conta1;

public class QuartaQuestao {
    public static void main(String[] args) {
        Conta1 cliente3 = new Conta1();
        cliente3.setDataAbertura("24/06/2021");
        cliente3.setTitular("Danilo");
        cliente3.setAgencia("24621");
        cliente3.setNumero(4976260);
        cliente3.deposito(100);


        Conta1 cliente4 = new Conta1();
        cliente4.setDataAbertura("24/06/2021");
        cliente4.setTitular("Danilo");
        cliente4.setAgencia("24621");
        cliente4.setNumero(4976260);
        cliente4.deposito(100);



        System.out.println("Comparando cliente3 e cliente4");
        if(cliente3 == cliente4){
            System.out.println("São iguais!");
        }else{
            System.out.println("Não são iguais!");
        }




    }
}
