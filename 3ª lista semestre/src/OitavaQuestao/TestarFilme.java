package OitavaQuestao;

public class TestarFilme {
    public static void main(String[] args) {
        System.out.println(" ");
        Filme filme1 = new Filme("Titanic", 194 );
        System.out.println("Informações do filme");
        System.out.println("Título: " + filme1.getTitulo());
        System.out.println("Duração em segundos: " + filme1.getDuracaoEmMinutos());
        filme1.exibirDuracaoEmHoras();

        System.out.println(" ");
        
        Filme melhorFilme = new Filme("Forrest Gump", 142);
        System.out.println("Informações do filme");
        System.out.println("Título: " + melhorFilme.getTitulo());
        System.out.println("Duração em segundos: " + melhorFilme.getDuracaoEmMinutos());
        melhorFilme.exibirDuracaoEmHoras();

        System.out.println(" ");
        
        Filme meuFilmeFavorito = new Filme("Alitta Battle Angel", 100);
        System.out.println("Informações do filme");
        System.out.println("Título: " + meuFilmeFavorito.getTitulo());
        System.out.println("Duração em segundos: " + meuFilmeFavorito.getDuracaoEmMinutos());
        meuFilmeFavorito.exibirDuracaoEmHoras();
        
        System.out.println(" ");
        
        meuFilmeFavorito.setDuracaoEmMinutos(122);
        System.out.println("Informações do filme");
        System.out.println("Título: " + meuFilmeFavorito.getTitulo());
        System.out.println("Duração em segundos: " + meuFilmeFavorito.getDuracaoEmMinutos());
        meuFilmeFavorito.exibirDuracaoEmHoras();
        
        System.out.println(" ");

    }
    
}
