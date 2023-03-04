package QuestoesApostilaAlura;



public class QuintaQuestao {

    private static float fatorialFloat (float num){
        float fat = 1;
        for (float i = 1; i <= num; i ++){
            fat *= i;
//            System.out.printf("\n%f! = %f\n", i, fat);
        }
        return fat;
    }

    private static int fatorialInt (int num){
        int fat = 1;
        for (int i = 1; i <= num; i ++){
            fat *= i;
//            System.out.printf("\n%d! = %d\n", i, fat);
        }
        return fat;
    }


    public static void main(String[] args) {

        int num1 = 20;
        System.out.printf("O fatorial de %d é %d, quando utilizamos variáveis do tipo INT para armazenar os valores.", num1, fatorialInt(num1));

        float num = 20;
        System.out.printf("\nO fatorial de %f é %f, quando utilizamos variáveis do tipo FLOAT para armazenar os valores.\n", num, fatorialFloat(num));
    }

/*
* Quando tenatamos calcular o fatorial de 20, 30, 50 ou números maiores o resultado retornado contém
* erros pelo fato de estarmos a armazenar numa variável do tipo int mais do que ela consegue.*/

}
