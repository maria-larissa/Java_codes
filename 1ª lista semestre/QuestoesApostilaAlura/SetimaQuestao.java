package QuestoesApostilaAlura;

import java.util.Scanner;

public class SetimaQuestao {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.printf("\nDigite um numero: ");
        int x = num.nextInt();

        while( x != 1){
            if(x % 2 == 0){
                x = x / 2;
            }else{
                x = (3 * x) + 1;
            }
            System.out.printf("%d  ", x);
        }

    }
}
