package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] listOfMovies = new String[25];
        int count = 0;
        try {
            File file = new File("movies.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                listOfMovies[count] = line;
                // Use that line to do any calculations, processing, etc ..
                count++;
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        }

        int random = (int) ((Math.random() * listOfMovies.length));
        String randomFilm = listOfMovies[random];
        System.out.println(randomFilm);
        GuessMovie guessMovie = new GuessMovie(randomFilm);
        String un = guessMovie.makeMovieUnderscore();
        System.out.println(un);

        int wrong=0;
        String wrongChar="";
        while(wrong<10){
            System.out.println("You have guessed ("+wrong+") wrong letters"+wrongChar);
            System.out.println("Guess a letter:");
            Scanner scanner = new Scanner(System.in);
            char predict =scanner.next().charAt(0);

            StringBuilder check=guessMovie.checkCharExist(predict,un);
            if(!un.equals(String.valueOf(check))) {
                un=String.valueOf(check);
            }else {
                wrong++;
                wrongChar+=" "+predict;
            }
            System.out.println("You are guessing:"+un);
            if(un.equals(randomFilm)){
                break;
            }
        }

        if(wrong==10){
            System.out.println("you Lost");
        }else {
            System.out.println("You Win");
        }






    }
}
