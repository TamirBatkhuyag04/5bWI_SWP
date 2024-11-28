package at.tamir.algodat.tests;

import org.junit.jupiter.api.Test;
import at.tamir.algodat.DataGenerator;
import static org.junit.jupiter.api.Assertions.*;

class DataGeneratorTest {

    @Test
    void testGenerateDataArray() {
        int size = 10;
        int[] result = DataGenerator.generateDataArray(size);

        // Test 1: Größe des Arrays überprüfen
        assertEquals(size, result.length);
    }

    @Test
    void testGenerateDataArray2() {
        int size = 10;
        int min = 5;
        int max = 15;
        int[] result = DataGenerator.generateDataArray2(size, min, max);

        // Test 1: Größe des Arrays überprüfen
        assertEquals(size, result.length);

        // Test 2: Sicherstellen, dass Werte innerhalb der Grenzen liegen
        for (int num : result) {
            assertTrue(num >= min && num <= max);
        }
    }

    @Test
    void testPrintArray() {
        int[] data = { 1, 2, 3, 4, 5 };
        String expectedOutput = "1 2 3 4 5 ";
        assertDoesNotThrow(() -> {
            DataGenerator.printArray(data);
        });
    }
}