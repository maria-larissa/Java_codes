package NonaQuestao;

public class Televisao {
    private String marca;
    private double polegadas;

    public Televisao(){
        this.marca = "xxxxxxxxxxx";
        this.polegadas = 0.0;
    }
    
    public Televisao(String marca, double polegadas){
        if(marca != null){
            if(polegadas > 0){
                this.marca = marca;
                this.polegadas = polegadas;
            }
        }
    }


    // Getters and setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
       if(marca != null){
           this.marca = marca;
       }
    }

    public double getPolegadas() {
        return polegadas;
    }
    public void setPolegadas(double polegadas) {
        if(polegadas > 0.0){
            this.polegadas = polegadas;
        }
    }

}
