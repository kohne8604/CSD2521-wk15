/* This program is designed to take a user's name from input and split it into
 * its separate parts, displaying them individually on separate lines with
 * labels for each, up to three names but two at minimum.
 * Author: Ethan James William Kohn
 * Date: November 19, 2019
 */

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get the user's name
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        // trim off blank spaces from the front and back of the string
        name = name.trim();
        // split the trimmed name string into an array consisting of its parts
        String[] nameSplit = name.split(" ");
        
        // check the length of the array
        switch (nameSplit.length) {
            // if it's 2 words long, print only first and last name
            case 2:
                System.out.println("First Name: " + nameSplit[0]);
                System.out.println("Last Name:  " + nameSplit[1]);
                break;
            // if it's 3 words long, include a section for the middle name
            case 3:
                System.out.println("First Name:  " + nameSplit[0]);
                System.out.println("Middle Name: " + nameSplit[1]);
                System.out.println("Last Name:   " + nameSplit[2]);
                break;
            // otherwise, print error that the user entered too much or too little
            default:
                System.out.println("Please enter both your first and last name. "
                        + "Middle name is optional, but choose only one if you have more.");
                break;
        }
    }
}
