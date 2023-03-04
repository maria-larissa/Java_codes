package Questoes;

import java.util.Scanner;

/*
* Escreva um programa em Java para exibir a tabela de multiplicação de um
determinado número inteiro.*/
public class DecimaQuestao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = entrada.nextInt();


        System.out.printf("\n.......Tabuada da multiplicação do %d.......\n", num);

        for(int j=1 ; j<=9 ; j++){
            System.out.printf("\n %d * %d = %d", num, j, num * j);
        }
    }
}
