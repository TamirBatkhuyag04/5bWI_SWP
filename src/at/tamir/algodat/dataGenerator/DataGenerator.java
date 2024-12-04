package at.tamir.algodat.dataGenerator;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt();
        }
        return data;
    }

    public static int[] generateDataArray2(int size, int min, int max) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(max + 1 - min) + min;
            // * max+1 damit die höchste Grenze includiert wird
        }
        return data;
    }

    public static void printArray(int[] data) {
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}