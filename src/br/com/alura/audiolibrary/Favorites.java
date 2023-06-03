package br.com.alura.audiolibrary;

public class Favorites {
    public void include(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitle() + " também é um dos que todo mundo está curtindo");
        }
    }
}
