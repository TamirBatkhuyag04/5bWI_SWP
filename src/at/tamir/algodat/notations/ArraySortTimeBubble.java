package at.tamir.algodat.notations;

import java.util.Random;

public class ArraySortTimeBubble {

    public static void main(String[] args) {
        // Array-Größen
        int[] sizes = { 10000, 100000, 400000 };

        // Arrays erstellen
        int[][] arrays = new int[sizes.length][];
        for (int i = 0; i < sizes.length; i++) {
            arrays[i] = generateRandomArray(sizes[i]);
        }

        // Sortiere Arrays und messe die Zeit
        for (int i = 0; i < sizes.length; i++) {
            System.out.println("Sorting array of size " + sizes[i] + "...");
            long startTime = System.nanoTime();
            bubbleSort(arrays[i]);
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

    // Implementierung von Bubble Sort
    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Werte tauschen
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Wenn kein Tausch stattgefunden hat, ist das Array sortiert
            if (!swapped)
                break;
        }
    }
}