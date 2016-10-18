package task3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import task3.BST;

public class BSTTest {
	private static String[] elements = {"Man", "Fin", "Queue", "Ape", "Gorilla", "Post", "Wales"};
	private BST<String> tree;

	@Before
	public void setup(){
		tree = new BST<>(elements);
	}

	@Test
	public void getPathTest(){
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("Gorilla", "Fin", "Man"));
		assertEquals(expected, tree.getPath("Gorilla"));
	}
	
	@Test
	public void insertTest(){
		assertEquals(true, tree.insert("Horse"));
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("Horse", "Gorilla", "Fin", "Man"));
		assertEquals(expected, tree.getPath("Horse"));
		assertEquals(false, tree.insert("Horse"));
	}
	
	@Test
	public void deleteTest(){
		assertEquals(true, tree.delete("Fin"));
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("Gorilla", "Ape", "Man"));
		assertEquals(expected, tree.getPath("Gorilla"));
		assertEquals(false, tree.delete("Fin"));
		assertEquals(true, tree.delete("Man"));
		expected = new ArrayList<>(Arrays.asList("Ape", "Gorilla"));
		assertEquals(expected, tree.getPath("Ape"));
		expected = new ArrayList<>(Arrays.asList("Wales", "Queue", "Gorilla"));
		assertEquals(expected, tree.getPath("Wales"));
	}
}
