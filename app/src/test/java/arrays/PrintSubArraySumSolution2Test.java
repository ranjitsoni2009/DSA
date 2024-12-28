package arrays;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintSubArraySumSolution2Test {

    @Test
    void testPrintSubArrayElementSum_singleElementArray() {
        PrintSubArraySumSolution2 printSubArraySum = new PrintSubArraySumSolution2();
        int[] array = {1};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            printSubArraySum.printSubArrayElementSum(array);
            String expectedOutput = "1 ";
            assertEquals(expectedOutput, outContent.toString());
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void testPrintSubArrayElementSum_multipleElementsArray() {
        PrintSubArraySumSolution2 printSubArraySum = new PrintSubArraySumSolution2();
        int[] array = {1, 2, 3};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            printSubArraySum.printSubArrayElementSum(array);
            String expectedOutput = "1 3 6 2 5 3 ";
            assertEquals(expectedOutput, outContent.toString());
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void testPrintSubArrayElementSum_emptyArray() {
        PrintSubArraySumSolution2 printSubArraySum = new PrintSubArraySumSolution2();
        int[] array = {};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            printSubArraySum.printSubArrayElementSum(array);
            String expectedOutput = "";
            assertEquals(expectedOutput, outContent.toString());
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void testPrintSubArrayElementSum_largeArray() {
        PrintSubArraySumSolution2 printSubArraySum = new PrintSubArraySumSolution2();
        int size = 1000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            printSubArraySum.printSubArrayElementSum(array);
            // Due to the large output, we will just check if the output is not empty
            assertFalse(outContent.toString().isEmpty());
        } finally {
            System.setOut(originalOut);
        }
    }
}