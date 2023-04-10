package DecimaPrimeiraQuestao;

public class Elevador {
    private int andarAtual;
    private int qtdAndaresTotal;
    private int capacidade;
    private int qtdPessoas;

    public Elevador(int qtdAndaresTotal, int capacidade){
        if(qtdAndaresTotal > 0 && capacidade > 0){
            this.qtdAndaresTotal = qtdAndaresTotal;
            this.capacidade = capacidade;
            this.andarAtual = 0;
            this.qtdPessoas = 0;
        }
    }

    public void setAndarAtual(int andarAtual) {
        if(andarAtual >=0 && andarAtual <= this.qtdAndaresTotal){
            this.andarAtual = andarAtual;
        }else{
            System.out.println("Andar atual inválido!");
        }
    }
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setQtdPessoas(int qtdPessoas) {
        if(qtdPessoas >= 0 && qtdPessoas <= this.capacidade){
            this.qtdPessoas = qtdPessoas;
        }else{
            System.out.println("Quantidade de pessoas inválida!");
        }
    }
    public int getQtdPessoas() {
        return qtdPessoas;
    }


    public void entra(){
        if(this.qtdPessoas < this.capacidade){
            this.qtdPessoas++;
        }
    }
    public void sai(){
        if(this.qtdPessoas > 0){
            this.qtdPessoas--;
        }
    }


    public void sobe(){
        if(this.andarAtual < this.qtdAndaresTotal){
            this.andarAtual++;
        }
    }

    public void desce(){
        if(this.andarAtual > 0){
            this.andarAtual--;
        }
    }

}
