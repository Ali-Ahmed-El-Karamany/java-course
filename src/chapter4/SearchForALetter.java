package chapter4;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter ‘A’.
 */

import java.util.Scanner;

public class SearchForALetter {

    public static void main(String[] args){

        //Get text from the user
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search for letter 'A' in the text
        for(int i=0; i<text.length(); i++){

            char currentLetter = text.charAt(i);

            if(currentLetter == 'a' || currentLetter == 'A'){
                letterFound = true;
                break;
            }
        }

        //Determine if the letter found or not
        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}