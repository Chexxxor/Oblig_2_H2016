package task1;

public class MergeSort {
	public static <E extends Comparable<E>> void mergeSort(E[] list){
		if(list.length > 1){
			E[] firstHalf = (E[]) new Comparable[list.length/2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			mergeSort(firstHalf);
	
			E[] secondHalf = (E[]) new Comparable[list.length - list.length/2];
			System.arraycopy(list, list.length/2, firstHalf, 0, list.length-list.length/2);
			mergeSort(secondHalf);
			
			merge(firstHalf, secondHalf, list);
		}
	}
	
	public static <E> void merge(E[] first, E[] second, E[] result){
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		
		while(current1 < first.length && current2 < second.length){
			
		}
	}
}
