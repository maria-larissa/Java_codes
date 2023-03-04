package Questoes;

/*Faça um programa em Java que calcule e mostre o valor do rendimento e o valor
total depois do rendimento, sabendo-se que o valor de depósito foi de R$ 800,00
e o valor da taxa de juros foi de 5%.
• Rendimento = depósito * taxaJuros/100;
• valorTotal = depósito + rendimento.*/
public class SextaQuestao {

    private static float calRedimento(float deposito, float taxa){
        return deposito * (taxa / 100);
    }



    public static void main(String[] args) {
        float deposito = 800, taxa = (float)5 / (float) 100;

        float rendimento = calRedimento(deposito, taxa);
        System.out.println("O valor do RENDIMENTO é " + rendimento + ".");

        System.out.println("O valor TOTAL é " + (deposito + rendimento) + ".");
    }
}
