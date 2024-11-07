package at.tamir.camera;

import java.util.*;

public class GUI {
    public static void main(String[] args) {
        // Objects
        Producer producer = new Producer("Canon EOS R6 Mark II", "Japan");
        Lens lens = new Lens("Canon", 1080);
        MemoryCard memoryCard = new MemoryCard(16);
        Camera camera = new Camera(1000, 200, "Black", producer, lens, memoryCard);

        // Scanner
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        // User options
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Take picture");
            System.out.println("2. Show all pictures");
            System.out.println("3. Options for memoryCard"); // toDo

            switch (userInput) {
                case 1:

                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("- - -");
            System.out.println("What size do you want to take");
            System.out.println("1. small, 2 MB");
            System.out.println("2. medium, 4 MB");
            System.out.println("3. large, 8 MB");
            System.out.println("- - -");

            // Method: takePicture()
            camera.takePicture(userInput);
        }
    }
}
