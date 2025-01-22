package at.tamir.algodat.notations;

import java.util.Random;

public class ArraySortTimeInsertion {
    public static void main(String[] args) {
        int[] sizes = { 1000, 10000, 100000 };
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            long startTime = System.nanoTime();
            insertionSort(array);
            long endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1e9;
            System.out.printf("InsertionSort: Array size %d sorted in %.6f seconds%n", size, duration);
        }
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
