package NonaQuestao;

public class ControleRemoto {
    private int volume;
    private int canal;

    public ControleRemoto(){
        this.volume = 0;
        this.canal = 9;
    }

    public ControleRemoto(int volume, int canal){
        if(volume >=0 && volume<=100 && canal>=0 && canal<=15){
            this.canal = canal;
            this.volume = volume;        
        }
    }


    public int getCanal() {
        return canal;
    }
    public int getVolume() {
        return volume;
    }


    public void aumentaVolume(){
        if(this.volume < 100){
            this.volume++;
        }
    }
    public void diminuiVolume(){
        if(this.volume > 0){
            this.volume--;
        }
    }


    public void aumentaCanal(){
        if(this.canal < 15){
            this.canal++;
        }
    }
    public void diminuiCanal(){
        if(this.canal > 0){
            this.canal--;
        }
    }
    
    public void trocaCanalIndicado(int canal){
        if(canal<=0 && canal <=15){
            this.canal = canal;
        }
    }

}
