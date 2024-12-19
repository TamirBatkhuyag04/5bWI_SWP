package at.tamir.algodat.sorting;

import at.tamir.algodat.dataGenerator.DataGenerator;

public class Main {
    public static void insertionSort(int[] numbers, InsertionSort insertionSort) {
        int[] numbersCopy = numbers.clone();
        insertionSort.sort(numbersCopy);
        DataGenerator.printArray(numbersCopy);
    }

    public static void selectionSort(int[] numbers, SelectionSort selectionSort) {
        int[] numbersCopy = numbers.clone();
        selectionSort.sort(numbersCopy);
        DataGenerator.printArray(numbersCopy);
    }

    public static void bubbleSort(int[] numbers, BubbleSort bubbleSort) {
        int[] numbersCopy = numbers.clone();
        bubbleSort.sort(numbersCopy);
        DataGenerator.printArray(numbersCopy);
    }
}