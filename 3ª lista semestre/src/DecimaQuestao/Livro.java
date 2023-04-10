package DecimaQuestao;

public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;


    public Livro(){
        this.titulo = "xxxxx xxx xxxxxxx";
        this.qtdPaginas = 0;
        this.paginasLidas = 0;
    }

    public Livro(String titulo){
        if(titulo != null){
            this.titulo = titulo;
            this.qtdPaginas = 0;
            this.paginasLidas = 0;
        }
    }

    public Livro(String titulo, int qtdPaginas, int paginasLidas){
        if(titulo != null){
            if(qtdPaginas > 0 && paginasLidas >= 0){
                this.titulo = titulo;
                this.qtdPaginas = qtdPaginas;
                this.paginasLidas = paginasLidas;
            }
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setQtdPaginas(int qtdPaginas) {
        if(qtdPaginas > 0){
            this.qtdPaginas = qtdPaginas;
        }
    }
    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setPaginasLidas(int paginasLidas) {
        if(paginasLidas >= 0){
            this.paginasLidas = paginasLidas;
        }
    }
    public int getPaginasLidas() {
        return paginasLidas;
    }

   
    public void verificarProgresso(){
        double percentual = (paginasLidas *100) / this.qtdPaginas;
        System.out.println("Você já leu " + percentual + " % do paginasLidaslivro.");
    }
}
