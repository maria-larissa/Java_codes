package QuestoesApostilaAlura;

public class SextaQuestao {
    public static void main(String[] args) {
        int f1 = 0, f2 = 1, resultado = f1 + f2;

        System.out.println("SEQUÊNCIA DE FIBONACCI");
        System.out.printf("%d ", f1);
        System.out.printf("%d ", f2);
        System.out.printf("%d ", resultado);
        while(resultado <= 100){
            f1 = f2;
            f2 = resultado;
            resultado = f1 + f2;
            System.out.printf("%d ", resultado);
        }
    }
}
