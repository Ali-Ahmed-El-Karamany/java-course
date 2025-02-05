package chapter12;

import java.util.Scanner;

class ThrowExample {
    public static void validateAge(int age) {
        try {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above.");
            }
            System.out.println("Access granted.");
        }catch(IllegalArgumentException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        validateAge(age);  // This will throw an exception
    }
}
