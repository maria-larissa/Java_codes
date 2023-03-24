package SetimaQuestao;


public class SetimaQuestao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Mercedes-Benz");
        carro1.setModelo("Mercedes-Benz A 200");
        carro1.setVelocidadeAtual(20);

        System.out.printf("Carro %s", carro1.getModelo());
        System.out.printf("\nMarca = %s",carro1.getMarca());
        System.out.printf("\nVelocidade = %.2f\n\n",carro1.getVelocidadeAtual());

        System.out.println("Carro acelerando!");
        carro1.acelera();
        carro1.acelera();
        System.out.printf("Velocidade = %.2f\n\n",carro1.getVelocidadeAtual());

        System.out.println("Carro freiando!");
        carro1.freia();
        carro1.freia();
        carro1.freia();
        carro1.freia();
        System.out.printf("Velocidade = %.2f\n",carro1.getVelocidadeAtual());
    }
}
