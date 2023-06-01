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
}
