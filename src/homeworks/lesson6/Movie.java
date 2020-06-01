package homeworks.lesson6;

public class Movie {

    private int rating;
    private String director;
    private String title;

    public Movie(int rating, String director, String title) {
        this.rating = rating;
        this.director = director;
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
