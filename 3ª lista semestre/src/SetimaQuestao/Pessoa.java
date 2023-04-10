package SetimaQuestao;

/*
Crie uma classe para representar uma pessoa, com os atributos privados de
nome, idade e altura. Crie pelo menos um método construtor e os métodos de
acesso (sets e gets) e também um método para imprimir os dados de uma
pessoa. Crie os atributos como privados e os métodos como públicos.
*/

public class Pessoa{
    
    private String nome;
    private int idade;
    private double altura;

    /*contrutor que o java faz por default*/

    public Pessoa(){
        this.nome = null;
        this.idade = 0;
        this.altura = 0.0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    
    public void infoPessoa(){

        System.out.println("Informações");

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }


}