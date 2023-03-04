package Questoes;

import java.util.Scanner;
import java.lang.String;


public class Terceiraquestao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(".........INVERTENDO NÚMEROS.........");
        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();
        String invertida = "";

        String original = Integer.toString( num);

        for(int i = original.length(); i >= 1 ; i--){
            invertida += original.substring(i - 1, i);
        }

        System.out.printf("\nO número invertido é %s.", invertida);
    }
}
