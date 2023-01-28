package alura.projetoBanco3;

public class cliente3 {
    private String nomeCompleto;
    private String cpf;
    private String profissao;


    public void insereCpf(String cpfCliente){
        this.cpf = cpfCliente;
    }
    public String consultarCpf(){
        return this.cpf;
    }

    public void insereNome(String nome){
        this.nomeCompleto = nome;
    }
    public String consultarNome(){
        return this.nomeCompleto;
    }

    public void insereProfissao(String prof){
        this.profissao = prof;
    }
    public String consultarProfissao(){
        return this.profissao;
    }


}
