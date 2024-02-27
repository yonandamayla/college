public class RatingFilm {
    public static void main(String[] args) {
        // Array 3x4 untuk menyimpan rating film
        int[][] movieRatings = {
            {4, 3, 4, 4},
            {1, 1, 2, 3},
            {1, 2, 3, 4}
        };

        // Menampilkan rata-rata rating untuk setiap film
        displayAverageRatings(movieRatings);

        // Menampilkan film dengan rata-rata rating tertinggi dan terendah
        displayHighestAndLowestRatedMovies(movieRatings);
    }

    // Fungsi untuk menampilkan rata-rata rating untuk setiap film
    private static void displayAverageRatings(int[][] ratings) {
        System.out.println("Rata-rata Rating untuk Setiap Film:");
        for (int i = 0; i < ratings.length; i++) {
            double avgRating = calculateAverageRating(ratings[i]);
            System.out.println("Film " + (i + 1) + ": " + avgRating);
        }
    }

    // Fungsi untuk menghitung rata-rata rating dari sebuah array
    private static double calculateAverageRating(int[] ratings) {
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.length;
    }

    // Fungsi untuk menampilkan film dengan rata-rata rating tertinggi dan terendah
    private static void displayHighestAndLowestRatedMovies(int[][] ratings) {
        int highestRatedMovie = findHighestRatedMovie(ratings);
        int lowestRatedMovie = findLowestRatedMovie(ratings);

        System.out.println("\nFilm dengan Rata-rata Rating Tertinggi: Film " + (highestRatedMovie + 1));
        System.out.println("Film dengan Rata-rata Rating Terendah: Film " + (lowestRatedMovie + 1));
    }

    // Fungsi untuk mencari film dengan rata-rata rating tertinggi
    private static int findHighestRatedMovie(int[][] ratings) {
        int highestRatedMovie = 0;
        double highestAvgRating = calculateAverageRating(ratings[0]);

        // Iterasi melalui setiap film untuk mencari yang memiliki rata-rata rating tertinggi
        for (int i = 1; i < ratings.length; i++) {
            double avgRating = calculateAverageRating(ratings[i]);
            if (avgRating > highestAvgRating) {
                highestAvgRating = avgRating;
                highestRatedMovie = i;
            }
        }

        return highestRatedMovie;
    }

    // Fungsi untuk mencari film dengan rata-rata rating terendah
    private static int findLowestRatedMovie(int[][] ratings) {
        int lowestRatedMovie = 0;
        double lowestAvgRating = calculateAverageRating(ratings[0]);

        // Iterasi melalui setiap film untuk mencari yang memiliki rata-rata rating terendah
        for (int i = 1; i < ratings.length; i++) {
            double avgRating = calculateAverageRating(ratings[i]);
            if (avgRating < lowestAvgRating) {
                lowestAvgRating = avgRating;
                lowestRatedMovie = i;
            }
        }

        return lowestRatedMovie;
    }
}
