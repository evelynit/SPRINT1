package exercici2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import exercici1.Month;

public class Main {

	public static void main(String[] args) {
	    List<Integer> list1 = new ArrayList<>();
	    list1.add(1);
	    list1.add(2);
	    list1.add(3);
	    list1.add(4);
	    list1.add(5);

	    List<Integer> list2 = new ArrayList<>();
	    list2.add(1);
	    list2.add(2);
	    list2.add(3);
	    
	    ListIterator<Integer> listIterator = list1.listIterator(list1.size());

	    while (listIterator.hasPrevious()) {
	      Integer element = listIterator.previous();
	      list2.add(element);
	    }	
	    System.out.println("Lista 1: " + list1);
	    System.out.println("Lista 2: " + list2);
	}

}
