package br.com.alura.audiolibrary;

public class Music extends Audio {
    private String artist;
    private String genre;
    private String album;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void displayTechnicalSheet() {
        System.out.println("O nome da música é: " + title);
        System.out.println("O(a) cantor(a) da música é: " + artist);
        System.out.println("O gênero da música é: " + genre);
        System.out.println("A música pertence ao álbum: " + album);
        super.displayTechnicalSheet();
    }
}
