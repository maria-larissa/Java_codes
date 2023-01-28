package alura.projetoBanco2;

public class cliente {
    public String nomeCompleto;
    private String cpf;
    public String profissao;


    public void insereCpf(String cpfCliente){
        this.cpf = cpfCliente;
    }
    public String consultaCpf(){
        return this.cpf;
    }
}
