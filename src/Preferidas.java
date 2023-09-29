
public class Preferidas {

    public void inclui(Audio  audio){
       if(audio.getClassificacao()>8) {
           System.out.println(audio.getTitulo() + " é sucesso!! Na lista dos mais ouvidos.");
       } else {
           System.out.println(audio.getTitulo() + " é uma boa opção!");
       }
    }
}
