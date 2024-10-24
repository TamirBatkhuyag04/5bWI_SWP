package at.tamir.camera;

import java.io.File;
import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {
        // Camera cam = new Camera();
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        System.out.println("- - -");
        System.out.println("What size do you want to take");
        System.out.println("1. small, 2 MB");
        System.out.println("2. medium, 4 MB");
        System.out.println("3. large, 8 MB");
        System.out.println("- - -");
        switch (userInput) {
            case 1:
                file = new File("small.png", localDate.now(), 2);
                break;

            case 2:
                file = new File("medium.png", localDate.now(), 4);
                break;

            case 3:
                file = new File("large.png", localData.now(), 8);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
