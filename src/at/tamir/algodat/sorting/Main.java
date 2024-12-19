package at.tamir.algodat.sorting;

import at.tamir.algodat.dataGenerator.DataGenerator;

public class Main {
    public static void main(String[] args) {

        // Kapsulation
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println("Generated Array: ");
        int[] numbers = DataGenerator.generateDataArray2(10, 1, 100);
        DataGenerator.printArray(numbers);
        System.out.println("");
        System.out.println("--------------------------------");

        System.out.println("Insertion Sort: ");
        insertionSort.sort(numbers);
        DataGenerator.printArray(numbers);
        System.out.println(" ");
        System.out.println("             ---");

        System.out.println("Selection Sort: ");
        selectionSort.sort(numbers);
        DataGenerator.printArray(numbers);
        System.out.println(" ");
        System.out.println("             ---");

        System.out.println("Bubble Sort: ");
        bubbleSort.sort(numbers);
        DataGenerator.printArray(numbers);
    }

}
