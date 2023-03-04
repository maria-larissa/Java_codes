package Questoes;

import java.util.Scanner;


public class OitavaQuestao {
    public static void main(String[] args) {
        Scanner ent1 = new Scanner(System.in);

        System.out.print("\nDigite a idade da 1ª mulher: ");
        int mu1 = ent1.nextInt();
        System.out.print("\nDigite a idade da 2ª mulher: ");
        int mu2 = ent1.nextInt();

        System.out.print("\nDigite a idade da 1º homen: ");
        int ho1 = ent1.nextInt();
        System.out.print("\nDigite a idade da 2º homem: ");
        int ho2 = ent1.nextInt();

        int idadeMulherNova, idadeHomemVelho, idadeMulherVelha, idadeHomemNovo;

        if (mu1 > mu2){
            idadeMulherVelha = mu1;
            idadeMulherNova = mu2;
        }else{
            idadeMulherVelha = mu2;
            idadeMulherNova = mu1;
        }

        if(ho1 > ho2){
            idadeHomemVelho = ho1;
            idadeHomemNovo  = ho2;
        }else{
            idadeHomemVelho = ho2;
            idadeHomemNovo = ho1;
        }

        System.out.printf("\nA soma da idade do HOMEM mais VELHO e a MULHER mais NOVA é %d.\n", (idadeHomemVelho + idadeMulherNova));
        System.out.printf("\nO produto da idade do HOMEM mais NOVO e a MULHER mais VELHA é %d.\n", (idadeHomemNovo * idadeMulherVelha));
    }
}
