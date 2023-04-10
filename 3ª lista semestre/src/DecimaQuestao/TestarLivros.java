package DecimaQuestao;

public class TestarLivros {
    public static void main(String[] args) {
        System.out.println(" ");
        Livro pequenoPrincipe = new Livro("O pequeno Príncipe");
        pequenoPrincipe.setQtdPaginas(98);
        pequenoPrincipe.setPaginasLidas(14);
        System.out.println("O livro " + pequenoPrincipe.getTitulo() + " possui " + pequenoPrincipe.getQtdPaginas() + " páginas.");
        pequenoPrincipe.setPaginasLidas(20);
        pequenoPrincipe.verificarProgresso();
        pequenoPrincipe.setPaginasLidas(50);
        pequenoPrincipe.verificarProgresso();
        
        System.out.println(" ");
        
        Livro meulivro = new Livro("Taking a shot", 218, 151);
        System.out.println("O livro " + meulivro.getTitulo() + " possui " + meulivro.getQtdPaginas() + " páginas.");
        meulivro.verificarProgresso();
        System.out.println(" ");
    }
}
