package OitavaQuestao;

import java.util.Scanner;

public class OitavaQuestao {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();


        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int num1 = ler.nextInt();

        System.out.printf("Digite um número: ");
        int num2 = ler.nextInt();

        System.out.printf("\nA soma dos número é %.2f.", calc.soma(num1, num2) );
        System.out.printf("\nA subtraçao (%d - %d) é %.2f.", num1, num2, calc.subtracao(num1, num2) );
        System.out.printf("\nA subtraçao (%d - %d) é %.2f.", num2, num1, calc.subtracao(num2, num1) );
        System.out.printf("\nA multiplicação dos número é %.2f.", calc.multiplicacao(num1, num2) );
        System.out.printf("\nA divisão (%d / %d) é %.2f.",num1, num2, calc.divisao(num1, num2) );
        System.out.printf("\nA divisão (%d / %d) é %.2f.",num2, num1, calc.divisao(num2, num1) );


    }

}
