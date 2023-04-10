package OitavaQuestao;

public class Filme {
    // Attributes
    private String titulo;
    private int duracaoEmMinutos;

    // Constructors
    public Filme(){
        this.titulo = "xxxxxx xx xxxxxx ";
        this.duracaoEmMinutos = 0;
    }

    public Filme(String titulo, int duracaoEmMinutos){
        if(duracaoEmMinutos > 0){
            this.titulo = titulo;
            this.duracaoEmMinutos = duracaoEmMinutos;
        }else{
            System.out.println("Tempo de duração inválido!");
        }
    }

    // Setters and getters 
    public void setTitulo(String titulo) {
        if(titulo != null){
            this.titulo = titulo;
        }
    }
    public String getTitulo() {
        return titulo;
    }
    
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        if(duracaoEmMinutos > 0){
            this.duracaoEmMinutos = duracaoEmMinutos;
        }
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // Methods
    public void exibirDuracaoEmHoras(){
        if (this.duracaoEmMinutos % 3600 ==0){
            int horas = this.duracaoEmMinutos / 60;
            System.out.println("O filme " + horas + " possui " + this.duracaoEmMinutos*60 + " horas e 0 minutos de duração.");
        }else{
            int minutosRestantes = this.duracaoEmMinutos % 60;
            int horas = (this.duracaoEmMinutos - minutosRestantes) / 60; 
            System.out.println("O filme " + this.titulo + " possui " + horas + " horas e " + minutosRestantes + " minutos de duração.");
        }
    }
    
}
