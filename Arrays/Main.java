package DSA.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3};
        PrintSubArray printSubArrayElement = new PrintSubArray();
        printSubArrayElement.printSubArrayElement(array);

        PrintSubArraySum printSubArraySum = new PrintSubArraySum();
        printSubArraySum.printSubArrayElementSum(array);
    }

}
