package at.tamir.algodat.notations;

import java.util.Random;

public class ArraySortTimeQuick {

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
            quickSort(arrays[i], 0, arrays[i].length - 1);
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

    // Implementierung von Quick Sort
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Werte tauschen
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Pivot an die richtige Stelle setzen
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
