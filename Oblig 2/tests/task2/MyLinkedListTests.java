package task2;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
import org.junit.BeforeClass;

public class MyLinkedListTests {
	private MyLinkedList<Integer> list;
	private static int firstElement = 1;
	private static int lastElement = 0;
	private static int recurringElement = 11;
	private static int nonExistElement = 2;
	private static int[] intsTemp = {firstElement, 3, recurringElement, 99, 27, 5, recurringElement, lastElement};
	static Integer[] ints = new Integer[intsTemp.length];
	
	@BeforeClass
	public static void initBefore(){
		for(int i = 0; i < intsTemp.length; i++){
			ints[i] = new Integer(intsTemp[i]);
		}
	}
	
	@Before
	public void initForEach(){
		list = new MyLinkedList<>(ints);
	}
	
	@Test
	public void contains() {
		assertEquals(true, list.contains(new Integer(firstElement)));
		assertEquals(true, list.contains(new Integer(lastElement)));
		assertEquals(true, list.contains(new Integer(recurringElement)));
		assertEquals(false, list.contains(new Integer(nonExistElement)));
	}

	@Test
	public void getTest(){
		assertEquals(firstElement, list.get(0).intValue());
		assertEquals(lastElement, list.get(7).intValue());
		assertEquals(recurringElement, list.get(2).intValue());
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void getTestWithInvalidArgument(){
		list.get(10);
		list.get(-1); //Not gonna be reached
	}
	
	@Test
	public void indexOfTest(){
		assertEquals(0, list.indexOf(new Integer(firstElement)));
		assertEquals(7, list.indexOf(new Integer(lastElement)));
		assertEquals(2, list.indexOf(new Integer(recurringElement)));
		assertEquals(-1, list.indexOf(new Integer(nonExistElement)));
	}
	
	@Test
	public void lastIndexOfTest(){
		assertEquals(0, list.lastIndexOf(new Integer(firstElement)));
		assertEquals(7, list.lastIndexOf(new Integer(lastElement)));
		assertEquals(6, list.lastIndexOf(new Integer(recurringElement)));
		assertEquals(-1, list.lastIndexOf(new Integer(nonExistElement)));
	}
	
	@Test
	public void setTest(){
		assertEquals(99, list.get(3).intValue());
		list.set(3, new Integer(37));
		assertEquals(37, list.get(3).intValue());
		assertEquals(8, list.size());
		list.set(8, new Integer(1337));
		assertEquals(9, list.size());
		assertEquals(new Integer(1337), list.get(8));
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void setTestWithInvalidArgument(){
		list.set(10, new Integer(100));
		list.set(-1, new Integer(500));  //Not gonna be reached
	}
	
	@Test
	public void setOnEmptyListTest(){
		list = new MyLinkedList<Integer>();
		assertEquals(0, list.size);

		list.set(0, new Integer(64));
		assertEquals(1, list.size);
		assertEquals(new Integer(64), list.getFirst());
		assertEquals(new Integer(64), list.getLast());

		list.set(0, new Integer(32));
		assertEquals(1, list.size);
		assertEquals(new Integer(32), list.getFirst());
		assertEquals(new Integer(32), list.getLast());
		
		list.set(1, new Integer(31));
		assertEquals(2, list.size);
		assertEquals(new Integer(32), list.getFirst());
		assertEquals(new Integer(31), list.getLast());
	}

}
