package quotes;

import java.util.List;

public class Quote {
    private String author;
    private String text;
    private String body;
    private int favorites_count;
    private List<String> tags;
    private String likes;


    public Quote(String author, String text, List<String> tags, String likes) {
        this.author = author;
        this.text = text;
        this.tags = tags;
        this.likes = likes;
    }

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public Quote(String author, String body, int favorites_count) {
        this.author = author;
        this.body = body;
        this.favorites_count = favorites_count;
    }

    public Quote(String author, String body, List<String> tags, int favorites_count) {
        this.author = author;
        this.body = body;
        this.favorites_count = favorites_count;
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public String getText() {
        return text;
    }

    public int getFavorites_count() {
        return favorites_count;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "quote='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    public void setFavorites_count(int i) {
    }
}
