package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicateElementFromSortedArrayTest {

    @Test
    public void testRemoveDuplicateElement_NoDuplicates() {
        RemoveDuplicateElementFromSortedArray1 remover = new RemoveDuplicateElementFromSortedArray1();
        int[] nums = {1, 2, 3, 4, 5};
        int newLength = remover.removeDuplicateElement(nums);
        assertEquals(5, newLength);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Arrays.copyOf(nums, newLength));
    }

    @Test
    public void testRemoveDuplicateElement_WithDuplicates() {
        RemoveDuplicateElementFromSortedArray1 remover = new RemoveDuplicateElementFromSortedArray1();
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int newLength = remover.removeDuplicateElement(nums);
        assertEquals(5, newLength);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Arrays.copyOf(nums, newLength));
    }

    @Test
    public void testRemoveDuplicateElement_AllDuplicates() {
        RemoveDuplicateElementFromSortedArray1 remover = new RemoveDuplicateElementFromSortedArray1();
        int[] nums = {1, 1, 1, 1, 1};
        int newLength = remover.removeDuplicateElement(nums);
        assertEquals(1, newLength);
        assertArrayEquals(new int[]{1}, Arrays.copyOf(nums, newLength));
    }

    @Test
    public void testRemoveDuplicateElement_AllDuplicates2() {
        RemoveDuplicateElementFromSortedArray1 remover = new RemoveDuplicateElementFromSortedArray1();
        int[] nums = {1, 1};
        int newLength = remover.removeDuplicateElement(nums);
        assertEquals(1, newLength);
        assertArrayEquals(new int[]{1}, Arrays.copyOf(nums, newLength));
    }

    @Test
    public void testRemoveDuplicateElement_SingleElement() {
        RemoveDuplicateElementFromSortedArray1 remover = new RemoveDuplicateElementFromSortedArray1();
        int[] nums = {1};
        int newLength = remover.removeDuplicateElement(nums);
        assertEquals(1, newLength);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    public void testRemoveDuplicateElement_EmptyArray() {
        RemoveDuplicateElementFromSortedArray1 remover = new RemoveDuplicateElementFromSortedArray1();
        int[] nums = {};
        int newLength = remover.removeDuplicateElement(nums);
        assertEquals(0, newLength);
        assertArrayEquals(new int[]{}, nums);
    }
}