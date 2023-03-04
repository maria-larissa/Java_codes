package Questoes;

import java.util.Scanner;

public class NonaQuestao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite o 1º número: ");
        float num1 = entrada.nextFloat();
        System.out.print("Digite o 2º número: ");
        float num2 = entrada.nextFloat();

        System.out.println("............OPERAÇÕES............");
        System.out.printf("\nA SOMA dos números é %.2f.", num1+num2);
        System.out.printf("\nA SUBTRAÇÃO (%.2f - %.2f) é %.2f.",num1, num2, num1-num2);
        System.out.printf("\nA SUBTRAÇÃO (%.2f - %.2f) é %.2f.",num2, num1, num2-num1);
        System.out.printf("\nO PRODUTO dos números é %.2f.", num1*num2);
        System.out.printf("\nO DIVISÃO (%.2f / %.2f) é %.2f.", num1, num2, num1/num2);
        System.out.printf("\nO DIVISÃO (%.2f / %.2f) é %.2f.", num2, num1, num2/num1);
        System.out.printf("\nO RESTO de (%.2f / %.2f) é %.0f.", num1, num2, num1%num2);
        System.out.printf("\nO RESTO de (%.2f / %.2f) é %.0f.", num2, num1, num2%num1);
    }
}
