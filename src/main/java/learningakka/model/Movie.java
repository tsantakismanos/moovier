package learningakka.model;

public class Movie {

    final private String title;
    final private String directorName;
    final private int year;
    final private String genre;

    public Movie(String title, String directorName, int year, String genre) {
        this.title = title;
        this.directorName = directorName;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}
