package kr.co.algo.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectSortTest {

    @Test
    public void select() {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int[] rst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertArrayEquals(SelectSort.sortList(arr), rst);
    }

}