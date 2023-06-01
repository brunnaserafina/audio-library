import br.com.alura.audiolibrary.Music;
import br.com.alura.audiolibrary.Podcast;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Music rehab = new Music();
        rehab.setTitle("Rehab");
        rehab.setArtist("Amy Winehouse");
        rehab.setAlbum("Back To Black");
        rehab.setGenre("Soul");
        rehab.setDurationInMinutes(3.33);
        rehab.displayTechnicalSheet();


        Podcast pressentimento = new Podcast();
        pressentimento.setTitle("Pressentimento");
        pressentimento.setHost("Déia Freitas");
        pressentimento.setTheme("Histórias do cotidiano");
        pressentimento.setDurationInMinutes(11.57);
        pressentimento.displayTechnicalSheet();
    }
}