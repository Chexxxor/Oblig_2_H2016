package task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMergeSort {
	@Test
	public void test() {
		Integer[] list = {1, 11, 5, 3, 2, 88, 0, -9};
		Integer[] expected = {-9, 0, 1, 2, 3, 5, 11, 88};
		MergeSort.mergeSort(list);
		assertEquals(expected.toString(), list.toString());
	}

}
