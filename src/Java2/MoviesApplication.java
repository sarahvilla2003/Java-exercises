package Java2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SarahVillareal on 5/22/17.
 */
public class MoviesApplication {
    public static void main(String[] args) {

        MoviesArray listObject = new MoviesArray();
        Movie[] listofMovies = listObject.findAll();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("" +
            "What would you like to do?\n" + "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - Add a movie, provide name and category");
            System.out.println("Choose one");

            int option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for(Movie m : listofMovies){
                        System.out.println( m.getName() + " - " + m.getCategory() );
                    }
                    break;
                case 2:
                    printByCategory(listofMovies, "animated");
                    break;
                case 3:
                    printByCategory(listofMovies, "drama");
                    break;

                case 4:
                    printByCategory(listofMovies, "horror");
                    break;
                case 5:
                    printByCategory(listofMovies, "scifi");
                    break;
                case 6:
                    listofMovies = addMovie(scan, listofMovies);
                    break;
                default:
                    System.out.println("No valid, try again");

            }
        }


    }

    //Prints the list of movies by a specific category
    public static void printByCategory(Movie[] movies, String category){

        for(Movie m : movies){
            if(m.getCategory().equalsIgnoreCase(category)){
                System.out.println( m.getName() + " - " + m.getCategory() );
            }
        }

    }

    // Adds a new Movie object to the list of movies array and returns it so it could be used in the main method
    public static Movie[] addMovie(Scanner scan, Movie[] listOfMovies){

        System.out.println("Give me the name:");
        String name = scan.nextLine();

        System.out.println("Give me the category:");
        String category = scan.nextLine();

        Movie newMovie = new Movie(name, category);

        //Makes a copy of the array and adds a new index position so we can add the new Movie object
        listOfMovies = Arrays.copyOf(listOfMovies, listOfMovies.length+1);
        listOfMovies[listOfMovies.length-1] = newMovie;
        return listOfMovies;

    }

}

