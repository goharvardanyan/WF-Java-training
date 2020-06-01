package homeworks.lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Movie[] moviesArray = new Movie[10];
        Random random = new Random();
        initializeMovies(moviesArray, random);
        int highestRating = findHighestRating(moviesArray);
        Movie[] bestMovies = bestMovies(moviesArray, highestRating);
        printBestMoviesTitles(bestMovies);
    }

    public static void initializeMovies(Movie[] moviesArray, Random random) {
        for (int i = 0; i < 10; i++) {
            moviesArray[i] = new Movie(random.nextInt(10), "Director" + (i + 1), "Title" + (i + 1));
        }
    }

    public static int findHighestRating(Movie[] moviesArray) {
        int highestRating = moviesArray[0].getRating();
        for (int i = 1; i < moviesArray.length; i++) {
            if (highestRating < moviesArray[i].getRating()) {
                highestRating = moviesArray[i].getRating();
            }
        }
        return highestRating;
    }

    public static Movie[] bestMovies(Movie[] moviesArray, int highestRating) {
        int count = 0;
        for (int i = 0; i < moviesArray.length; i++) {
            if (highestRating == moviesArray[i].getRating()) {
                count++;
            }
        }
        Movie[] bestMovies = new Movie[count];
        for (int i = 0, j = 0; i < moviesArray.length; i++) {
            if (moviesArray[i].getRating() == highestRating) {
                bestMovies[j] = moviesArray[i];
                j++;
            }
        }
        return bestMovies;
    }

    public static void printBestMoviesTitles(Movie[] bestMovies) {
        if (bestMovies.length > 1) {
            System.out.println("The Title of the best movies are ");
            for (int i = 0; i < bestMovies.length - 1; i++) {
                System.out.print(bestMovies[i].getTitle() + ", ");
            }
            System.out.println(bestMovies[bestMovies.length - 1].getTitle() + ".");
        } else {
            System.out.println("The Title of the best movie is " + bestMovies[0].getTitle());
        }
    }
}
