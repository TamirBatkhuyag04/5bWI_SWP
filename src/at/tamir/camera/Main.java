package at.tamir.camera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            // User Options
            System.out.println("1. Take a Picture");
            System.out.println("2. Check storage");
            System.out.println("3. Done");

            // Read user input
            Scanner input = new Scanner(System.in);
            int userOption = input.nextInt();

            // User input results
            if (userOption == 1) {
                System.out.println("Which size should the picture be");
                System.out.println("1. small: 2 MB");
                System.out.println("2. medium: 4 MB");
                System.out.println("3. large: 6 MB");

            } else if (userOption == 3) {
                System.out.println("process finished");
            }
        }

    }

}
