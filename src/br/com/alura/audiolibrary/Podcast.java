package br.com.alura.audiolibrary;

public class Podcast extends Audio {
    private String host;
    private String theme;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public void displayTechnicalSheet() {
        System.out.println("O título do podcast é: " + title);
        System.out.println("O(a) apresentador(a) do podcast é: " + host);
        System.out.println("O tema do podcast é: " + theme);
        super.displayTechnicalSheet();
    }

    @Override
    public int getRating() {
        if (this.getLikeCount() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
