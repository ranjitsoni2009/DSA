package arrays;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintSubArrayTest {

    @Test
    void testPrintSubArrayElement_singleElementArray() {
        PrintSubArray printSubArray = new PrintSubArray();
        int[] array = {1};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            printSubArray.printSubArrayElement(array);
            String expectedOutput = "[1]\n";
            assertEquals(expectedOutput, outContent.toString());
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void testPrintSubArrayElement_multipleElementsArray() {
        PrintSubArray printSubArray = new PrintSubArray();
        int[] array = {1, 2, 3};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        printSubArray.printSubArrayElement(array);

        String expectedOutput = "[1]\n[1,2]\n[1,2,3]\n[2]\n[2,3]\n[3]\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintSubArrayElement_emptyArray() {
        PrintSubArray printSubArray = new PrintSubArray();
        int[] array = {};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        printSubArray.printSubArrayElement(array);

        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintSubArrayElement_largeArray() {
        PrintSubArray printSubArray = new PrintSubArray();
        int size = 500;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        printSubArray.printSubArrayElement(array);

        // Due to the large output, we will just check if the output is not empty
        assertFalse(outContent.toString().isEmpty());
    }
}