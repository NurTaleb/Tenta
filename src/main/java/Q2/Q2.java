package Q2;

import java.util.Scanner;

public class Q2 {

    /**
     * This constructs if-sat
     * @param args
     */
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();

        int i;

        for (i = 0; i < name.length(); i++) {

            if (i == 0)
                System.out.print("The name starts with letter: " + name.charAt(i));

        }
    }

}
