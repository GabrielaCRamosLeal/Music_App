public class Podcast extends Audio{
    private String aprentador;
    private String convidados;
    private String tema;

    public String getAprentador() {
        return aprentador;
    }

    public void setAprentador(String aprentador) {
        this.aprentador = aprentador;
    }

    public String getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public int getClassificacao() {
        if (getCurtidas() > 200) {
            return 10;
        } else {
            return 8;
        }
    }
}
