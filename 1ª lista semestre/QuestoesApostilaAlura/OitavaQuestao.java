package QuestoesApostilaAlura;

import java.util.Scanner;

public class OitavaQuestao {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.printf("\nDigite um numero: ");
        int x = num.nextInt(), resultado = 0;

        for(int i = 1; i <= x ; i++){
            for(int j = 1 ; j <= i ; j++){
                resultado = i*j;
                System.out.printf(" %d", resultado);
            }
            System.out.println("");
        }
    }
}
