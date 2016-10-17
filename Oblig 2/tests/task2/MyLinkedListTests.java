package task2;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class MyLinkedListTests {
	public MyLinkedList<Integer> list;
	
	@Before
	public void init(){
		int[] intsTemp = {1, 3, 11, 99, 27, 5, 11, 0};
		Integer[] ints = new Integer[intsTemp.length];
		for(int i = 0; i < intsTemp.length; i++){
			ints[i] = new Integer(intsTemp[i]);
		}
		list = new MyLinkedList<>(ints);
	}
	
	@Test
	public void contains() {
		assertEquals(true, list.contains(new Integer(11)));
		assertEquals(false, list.contains(new Integer(2)));
	}
	/*@Test
	public void containsString(){
		String[] strings = {"Hello", "Goodbye", "Good afternoon", "Good evening"};
		MyLinkedList<String> list = new MyLinkedList<>(strings);
		assertEquals(true, list.contains("Goodbye"));
		assertEquals(false, list.contains("Good morning"));
	}*/
	
	@Test
	public void indexOfTest(){
		assertEquals(2, list.indexOf(new Integer(11)));
		assertEquals(-1, list.indexOf(new Integer(2)));
	}
	@Test
	public void lastIndexOfTest(){
		assertEquals(6, list.lastIndexOf(new Integer(11)));
		assertEquals(-1, list.lastIndexOf(new Integer(2)));
	}

}
