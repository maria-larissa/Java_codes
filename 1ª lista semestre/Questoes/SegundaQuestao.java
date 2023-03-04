package Questoes;

import java.util.Scanner;

public class SegundaQuestao {

    private static float calDistanciaTotal(float velMedia, float tempo){
        return ( velMedia * (tempo / 60));
    }

    private static float calCombustivelGasto(float distTotal){
        return (distTotal / 12);
    }


    public static void main(String[] args) {
        Scanner ent1 = new Scanner(System.in);
        System.out.print("\nDigite o valor da velocidade media: ");
        float velMedia = ent1.nextFloat();


        Scanner ent2 = new Scanner(System.in);
        System.out.print("Digite o tempo total (min): ");
        float tempo = ent2.nextFloat();

//        Calculando a distância total percorrida em Km
        float distTotal = calDistanciaTotal(velMedia, tempo);

//        Calculando a quantidade de combustível em litros
        float combustivelTotal = calCombustivelGasto(distTotal);

        System.out.printf("\nCom a velocidade media de %.1fkm/h  em %.0fmin você percorreu %.1fkm e gastou %.2fL de combustível.\n", velMedia, distTotal, tempo, combustivelTotal);

    }
}
