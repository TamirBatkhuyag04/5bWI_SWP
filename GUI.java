package at.tamir.camera;

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
            System.out.println("What do you want to do?");
            System.out.println("1. Take picture"); // TODO: ongoing
            System.out.println("2. Show all pictures"); // ! not started
            System.out.println("3. Options for memoryCard"); // ! not started
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
                        System.out.println("showPictures() not finished"); // ! not done
                        break;

                    case 3:
                        System.out.println("Options for memoryCard not finished"); // ! not done
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
