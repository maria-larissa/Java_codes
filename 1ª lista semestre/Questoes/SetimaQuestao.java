package Questoes;

import java.util.Scanner;

public class SetimaQuestao {
    public static void main(String[] args) {
        int  cont = 1;
        boolean continuar = true;
        float  maiorAltura = 0, menorAltura = 0;

        Scanner ent2 = new Scanner(System.in);

//        Comṕarando todas as idades
        do{
            System.out.printf("\n.....%d pessoa.....", cont);
            System.out.print("\nDigite a altura: ");
            float altura = ent2.nextFloat();

            if(altura == -1){
                continuar = false;
                continue;
            }


//          É preciso inicializar a maior e a menor altura com a primeira inserida.
//          Caso contrário não iremos conseguir comparar as alturas.
            if(cont == 1){
                maiorAltura = altura;
                menorAltura = altura;
            }

//            Comparando as alturas
            if (altura > maiorAltura){
               maiorAltura = altura;
            }else if (altura < menorAltura){
                menorAltura = altura;
            }


            cont++;
        }
        while(continuar);

        System.out.println("\nA MENOR altura é " + menorAltura + ".");
        System.out.println("A MAIOR altura é " + maiorAltura + ".");
    }
}

