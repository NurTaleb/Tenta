package Q34;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * this constructs a Person with a specified firstName, lastName and favoriteMovie
 */
public class Person {
    private String firstName;
    private String lastName;
    private String favoriteMovie;

    /**
     * Getter and Setters
     * This gets you firstName, lastName and favoriteMovie
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(String favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }


    public Person(String firstName, String lastName, String favoriteMovie) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteMovie = favoriteMovie;
    }

    /**
     * Saved in Arraylist
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<Person>();

        boolean isRunning = true;

        while(isRunning){

            System.out.println("Enter your first name, last name and favoriteMovie: ");
            String firstName = scan.nextLine();
            String lastName = scan.nextLine();
            String favouriteName = scan.nextLine();

            if(firstName.equals("1")) {
                break;
            }
            Person newPerson = new Person(firstName, lastName, favouriteName);
            list.add(newPerson);

        }

        Scanner scan1 = new Scanner(System.in);
        ArrayList<Person> list1 = new ArrayList<Person>();

        boolean isRunning1 = true;

        while(isRunning){

            System.out.println("Enter your first name: ");

            String firstName = scan.nextLine();

            System.out.println("Enter your last name: ");
            String lastName = scan.nextLine();

            System.out.println("Enter your favourite name: ");
            String favouriteName = scan.nextLine();

            if(firstName.equals("1") || lastName.equals("1") || favouriteName.equals("1") ) {
                break;
            }
            Person newPerson = new Person(firstName, lastName, favouriteName);
            list.add(newPerson);

        }

        for(Person t: list) {
            System.out.println("firstName: " + t.getFirstName() + "Amount: " + t.getLastName() + "" +
                    "Amount: " + t.getFavoriteMovie());
            System.out.println();
        }

    }


}



