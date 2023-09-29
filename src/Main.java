import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Preferidas preferidas = new Preferidas();

        Musica musica = new Musica();
        musica.setTitulo("Velha Infância");
        musica.setCantor("Tribalistas");

        System.out.println(String.format("Música em reprodução: %s de %s.", musica.getTitulo(), musica.getCantor()));
        System.out.println("Qual a quantidade de repetições?");
        int reproducoes = sc.nextInt();
        musica.setTotalDeReproducoes(reproducoes);
        preferidas.inclui(musica);

        Podcast podcast = new Podcast();
        podcast.setTitulo("Pod Delas");
        podcast.setTema("Maternidade");
        podcast.setAprentador("Viih Tube");
        podcast.setConvidados("Carolina");

        System.out.println(String.format("Podcast em reprodução: %s de %s.", podcast.getTitulo(), podcast.getConvidados()));
        System.out.println("Qual a quantidade de curtidas?");
        int curt = sc.nextInt();
        musica.setCurtidas (curt);
        preferidas.inclui(podcast);

    }
}