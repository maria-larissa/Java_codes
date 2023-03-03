package QuestoesApostilaAlura;

public class QuartaQuestao {
    public static void main(String[] args) {
        int fat = 1;
        for (int i = 1; i <= 10; i ++){
            fat *= i;
            System.out.printf("\n%d! = %d\n", i, fat);
        }
    }
}
