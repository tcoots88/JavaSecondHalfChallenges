package CodeChallenges.sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class sortTest {

    @Test
    public void insertionSort() {
    }

    @Test
    public void testForInsertOnEmptyArray(){
        Sort testSort = new Sort();
        int[] emptyArray = {};

        assertArrayEquals("Array should return as empty", emptyArray, Sort.insertionSort(emptyArray));
        System.out.println("testSort = " + testSort);
    }
}