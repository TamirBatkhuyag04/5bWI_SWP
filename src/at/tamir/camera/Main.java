package at.tamir.camera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objects
        Producer producer = new Producer("Name of Producer", "Japan");
        Lens lens = new Lens("Name of Lens", 1080);
        MemoryCard memoryCard = new MemoryCard(1024);
        Camera camera = new Camera(4000, 540, "grey", producer, lens, memoryCard);

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
                System.out.println("Taking picture");
                camera.takePicture();
            } else if (userOption == 2) {
                System.out.println("Opening storage");

            } else if (userOption == 3) {
                System.out.println("Process finished");

            } else {
                System.out.println("Invalid option");
            }
        }

    }

}
