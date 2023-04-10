public class QuintaQuestao {
    public static void main(String[] args) {
        System.out.println("A palavra \"final\" indica um tipo de variável que");
        System.out.println("nunca irá mudar o seu valor, após estabelecido pela");
        System.out.println("primeira vez.");


        //Exemplo, não é possível modificar o valor de x durante a execução
        final int x = 10;
        System.out.println("x = " + x);

        //x = 15;
        System.out.println("x = " + x);
    }
}
