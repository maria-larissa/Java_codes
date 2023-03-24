package QuestoesApostilaAlura.SextaQuestao;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void setData(int dia, int mes, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    public String getData(){
        String data;
        if(1 <= this.mes && this.mes <= 9 ){
            data = String.format("%d / 0%d / %d",this.dia, this.mes, this.ano);
        }else{
            data = String.format("%d / %d / %d",this.dia, this.mes, this.ano);
        }
        return data;
    }
}
