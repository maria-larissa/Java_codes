package Questoes;

import java.util.Scanner;


public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite a idade do nadador: ");
        int idade = entrada.nextInt();

        if (idade < 0) {
            System.out.println("IDADE INVÁLIDA!");
        }else if(0 < idade && idade <5 ){
            System.out.println("Essa idade não se enquadra nas categorias existentes.");
        }else if(5 <= idade && idade < 8) {
            System.out.println("O nadador pertence a categoria Infantil A.");
        }else if (8<= idade && idade < 11){
            System.out.println("O nadador pertence a categoria Infantil B.");
        }else if(11 <= idade && idade < 14){
            System.out.println("O nadador pertence a categoria Juvenil A.");
        }else if(14 <= idade && idade < 18){
            System.out.println("O nadador pertence a categoria Juvenil B.");
        }else if(idade >= 18){
            System.out.println("O nadador pertence a categoria Senior.");
        }
    }
}
