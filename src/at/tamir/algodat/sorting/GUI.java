package at.tamir.algodat.sorting;

import at.tamir.algodat.dataGenerator.DataGenerator;
import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        System.out.println("Enter the lowest occouring number: ");
        int lowestNumber = scanner.nextInt();
        System.out.println("Enter the highest occouring number: ");
        int highestNumber = scanner.nextInt();

        int[] numbers = DataGenerator.generateDataArray2(arraySize, lowestNumber, highestNumber);
        System.out.println("Generated Array: ");
        DataGenerator.printArray(numbers);

        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println(" ");
        System.out.println("Insertion Sort: ");
        Main.insertionSort(numbers, insertionSort);

        System.out.println(" ");
        System.out.println("Selection Sort: ");
        Main.selectionSort(numbers, selectionSort);

        System.out.println(" ");
        System.out.println("Bubble Sort: ");
        Main.bubbleSort(numbers, bubbleSort);
    }
}
