package com.company;

public class GuessMovie {
    String movie;

    GuessMovie(String movie) {
        this.movie = movie;
    }

    String makeMovieUnderscore() {
        char[] charMovie = movie.toCharArray();
        String underscoreMovie = "";
        for (int i = 0; i < movie.length(); i++) {

            if (charMovie[i] != ' ') {
                underscoreMovie += "_";
            } else {
                underscoreMovie += charMovie[i];
            }

        }
        return underscoreMovie;
    }

    StringBuilder checkCharExist(char pred, String un) {
        char predict = Character.toLowerCase(pred);
        StringBuilder underscore = new StringBuilder(un);


        for (int i = 0; i < movie.length(); i++) {
            if (movie.charAt(i) == predict) {

                underscore.setCharAt(i, predict);
            }

        }

        return underscore;
    }

}
