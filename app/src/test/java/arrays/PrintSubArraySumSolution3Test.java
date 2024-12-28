package arrays;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintSubArraySumSolution3Test {

    @Test
    void testPrintSubArrayElementSum_singleElementArray() {
        PrintSubArraySumSolution3 printSubArraySum = new PrintSubArraySumSolution3();
        int[] array = {1};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            printSubArraySum.printSubArrayElementSum(array);
            String expectedOutput = "Sum of [0,0] is 1-->%n";
            assertEquals(String.format(expectedOutput), outContent.toString());
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void testPrintSubArrayElementSum_multipleElementsArray() {
        PrintSubArraySumSolution3 printSubArraySum = new PrintSubArraySumSolution3();
        int[] array = {1, 2, 3};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            printSubArraySum.printSubArrayElementSum(array);
            String expectedOutput = "Sum of [0,0] is 1-->%n" +
                    "Sum of [0,1] is 3-->%n" +
                    "Sum of [0,2] is 6-->%n" +
                    "Sum of [1,1] is 2-->%n" +
                    "Sum of [1,2] is 5-->%n" +
                    "Sum of [2,2] is 3-->%n";
            assertEquals(String.format(expectedOutput), outContent.toString());
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void testPrintSubArrayElementSum_emptyArray() {
        PrintSubArraySumSolution3 printSubArraySum = new PrintSubArraySumSolution3();
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
        PrintSubArraySumSolution3 printSubArraySum = new PrintSubArraySumSolution3();
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