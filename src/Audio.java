public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes){
        this.totalDeReproducoes = totalDeReproducoes;
    }
}
