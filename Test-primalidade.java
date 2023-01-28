import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = input.nextInt();
        int cont = 1;
        for(int i=2 ; i <= valor; i++ ) {
            if(cont > 2){
                System.out.println("O número não é primo.\n");
                break;
            }else if (valor % i == 0) {
                cont++;
            }
        }

        if(cont == 2){
            System.out.println("O número é primo.\n");
        }
    }
}


