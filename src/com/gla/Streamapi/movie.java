package src.com.gla.Streamapi;
import java.util.*;

public class movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}

class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("MovieA", 8.5, 2023),
                new Movie("MovieB", 9.0, 2024),
                new Movie("MovieC", 8.8, 2022),
                new Movie("MovieD", 9.2, 2024),
                new Movie("MovieE", 8.7, 2023),
                new Movie("MovieF", 9.1, 2024)
        );

        movies.stream()
                .filter(m -> m.year >= 2023)
                .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))
                .limit(5)
                .forEach(m -> System.out.println(m.name + " - " + m.rating));
    }
}
