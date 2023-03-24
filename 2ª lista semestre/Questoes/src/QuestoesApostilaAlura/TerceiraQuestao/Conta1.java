package QuestoesApostilaAlura.TerceiraQuestao;

public class Conta1 {
    private String dataAbertura;
    private String titular;
    private String agencia;
    private int numero;
    private double saldo;

    public Conta1(){
        this.titular = null;
        this.agencia = null;
        this.dataAbertura= null;
        this.numero = 0;
        this.saldo = 0.0;
    }

    public boolean saque(float valor){
        if(valor > 0 && this.saldo > 0 && valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean deposito(double valor){
        this.saldo += valor;
        return true;
    }

    public double getSaldo() {
        return this.saldo;
    }


    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public String getDataAbertura() {
        return this.dataAbertura;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return this.titular;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getAgencia() {
        return this.agencia;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    public double calculaRendimento(){
        return this.saldo * 0.1;
    }

    public void info(){
        System.out.printf("\tConta do(a) cliente %s\n", this.titular);
        System.out.println("Data de abertura = " + this.dataAbertura);
        System.out.println("Agencia = " + this.agencia);
        System.out.println("Numero = " + this.numero);
        System.out.println("Saldo = " + this.saldo);
    }
}
