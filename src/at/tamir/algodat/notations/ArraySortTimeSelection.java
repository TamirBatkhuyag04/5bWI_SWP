package at.tamir.algodat.notations;

import java.util.Random;

public class ArraySortTimeSelection {
    public static void main(String[] args) {
        // Array-Größen
        int[] sizes = { 1000, 10000, 100000 };

        // Arrays erstellen
        int[][] arrays = new int[sizes.length][];
        for (int i = 0; i < sizes.length; i++) {
            arrays[i] = generateRandomArray(sizes[i]);
        }

        // Sortiere Arrays und messe die Zeit
        for (int i = 0; i < sizes.length; i++) {
            System.out.println("Sorting array of size " + sizes[i] + "...");
            long startTime = System.nanoTime();
            selectionSort(arrays[i]);
            long endTime = System.nanoTime();

            double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
            System.out.printf("Time taken for size %d: %.2f seconds\n", sizes[i], durationInSeconds);
        }
    }

    // Generiert ein Array mit zufälligen Zahlen
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000); // Zufallszahlen zwischen 0 und 9999
        }
        return array;
    }

    // Implementierung von Selection Sort
    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Werte tauschen
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
