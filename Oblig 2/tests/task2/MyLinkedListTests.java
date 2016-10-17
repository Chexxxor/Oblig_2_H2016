package task2;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class MyLinkedListTests {
	private MyLinkedList<Integer> list;

	@Before
	public void init(){
		int[] intsTemp = {1, 3, 11, 99, 27, 5, 0};
		Integer[] ints = new Integer[intsTemp.length];
		for(int i = 0; i < intsTemp.length; i++){
			ints[i] = new Integer(intsTemp[i]);
		}
		list = new MyLinkedList<Integer>(ints);
	}

	@Test
	public void contains() {
		assertEquals(true, list.contains(new Integer(11)));
		assertEquals(false, list.contains(new Integer(2)));
	}

}
