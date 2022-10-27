package Q1;

import java.util.Scanner;

/**
 * This constructs Name and the Letter it starts with
 */
public class Q1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String name = sc.next();
        char firstChar = name.charAt(0);
        System.out.println("The name starts with letter: " + firstChar);
    }


}
