package Questoes;

import java.util.Scanner;

/*Dado um número entre 0 e 80, exibir seu sucessor, sabendo que no caso do
número 80 o sucessor é 0*/
public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("\nDigite um número de 0 e 80: ");
        int num = entrada.nextInt();

        if (num == 80){
            System.out.println("");
            System.out.println("O sucessor de 80 é 0.");
        } else if (0 <= num  && num < 80) {
            System.out.println("");
            System.out.printf("O sucessor de %d é %d.", num, num+1);
        }else{
            System.out.println("");
            System.out.println("TENTE NOVAMENTE! Número não pertence ao intervalo especificado.");
        }
    }
}
