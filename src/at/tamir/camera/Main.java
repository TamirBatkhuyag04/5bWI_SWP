package at.tamir.camera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objects
        Producer producer = new Producer("Name of Producer", "Japan");
        Lens lens = new Lens("Name of Lens", 1080);
        Camera camera = new Camera(4000, 540, "grey");

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
                int userOption2 = input.nextInt();
                if (userOption2 == 1) {
                    System.out.println("took small picture");
                } else if (userOption2 == 2) {
                    System.out.println("took medium picture");
                } else if (userOption2 == 3) {
                    System.out.println("took large picture");
                } else {
                    System.out.println("invalid option");
                }

            } else if (userOption == 3) {
                System.out.println("process finished");
            }
        }

    }

}
