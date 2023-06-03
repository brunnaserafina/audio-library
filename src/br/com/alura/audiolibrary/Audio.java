package br.com.alura.audiolibrary;

public class Audio {
    protected String title;
    private double durationInMinutes;
    private int playCount;
    private int likeCount;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getPlayCount() {
        return playCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getRating() {
        return rating;
    }

    public void like() {
        likeCount++;
    }

    public void play() {
        playCount++;
    }

    public void displayTechnicalSheet() {
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Quantidade de curtidas: " + likeCount);
        System.out.println("Número de reproduções: " + playCount);
        System.out.println("Classificação de 0 a 5: " + rating);
    }

}
