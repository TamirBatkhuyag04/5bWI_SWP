package at.tamir.Camera;

import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class GUI {
    public static void main(String[] args) {
        // Objects
        Producer producer = new Producer("Canon EOS R6 Mark II", "Japan");
        Lens lens = new Lens("Canon", 1080);
        MemoryCard memoryCard = new MemoryCard(16);
        Camera camera = new Camera(1000, 200, "Black", producer, lens, memoryCard);

        boolean isDone = false;

        Scanner scanner = new Scanner(System.in);

        while (!isDone) {
            System.out.println("- - -");
            System.out.println("What do you want to do?");
            System.out.println("1. Take picture");
            System.out.println("2. Show all pictures");
            System.out.println("3. Options for memoryCard");
            System.out.println("4. Turn off the camera");

            try {
                int userInput = scanner.nextInt();

                switch (userInput) {
                    case 1:
                        System.out.println("- - -");
                        System.out.println("What size do you want to take");
                        System.out.println("1. small, 2 MB");
                        System.out.println("2. medium, 4 MB");
                        System.out.println("3. large, 8 MB");
                        System.out.println("- - -");

                        int sizeInput = scanner.nextInt();
                        if (sizeInput == 1) {
                            camera.takePicture(2);
                        } else if (sizeInput == 2) {
                            camera.takePicture(4);
                        } else if (sizeInput == 3) {
                            camera.takePicture(8);
                        } else {
                            System.out.println("Invalid Input");
                        }
                        break;

                    case 2:
                        System.out.println("All pictures: ");
                        camera.showAllPictures();
                        break;

                    case 3:
                        System.out.println("- - -");
                        System.out.println("1. Check remaining memory");
                        System.out.println("2. Clear memory card");
                        System.out.println("3. Insert new memory card");

                        int memoryInput = scanner.nextInt();
                        if (memoryInput == 1) {
                            System.out.println(
                                    "Remaining memory: " + camera.getMemoryCard().getRemainingMemory() + " MB.");
                        } else if (memoryInput == 2) {
                            camera.getMemoryCard().clearMemory();
                            System.out.println("Memeory cleared");
                        } else if (memoryInput == 3) {
                            System.out.println("Enter the size of the new memory card (in MB): ");
                            double newMemoryInput = scanner.nextDouble();
                            camera.replaceMemoryCard(new MemoryCard(newMemoryInput));
                        } else {
                            System.out.println("Invalid Input");
                        }
                        break;

                    case 4:
                        System.out.println("Turning off the camera");
                        isDone = true;
                        break;

                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
