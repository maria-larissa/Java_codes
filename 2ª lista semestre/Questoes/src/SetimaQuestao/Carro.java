package SetimaQuestao;

public class Carro {
    private String marca;
    private String modelo;
    private float velocidadeAtual;

    public Carro(){
        this.velocidadeAtual = 0;
        this.marca = "xxxxx";
        this.modelo = "xxxxx";
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidadeAtual() {
        return this.velocidadeAtual;
    }
    public void setVelocidadeAtual(float velocidadeAtual) {
        if(velocidadeAtual >=0 ){
            this.velocidadeAtual = velocidadeAtual;
        }
    }

    public void acelera(){
        this.velocidadeAtual += 10.0;
    }

    public void freia(){
        if(this.velocidadeAtual > 0){
            this.velocidadeAtual -= 10.0;
        }else if(this.velocidadeAtual == 0){
            System.out.println("O carro já está parado!");
        }
    }
}
