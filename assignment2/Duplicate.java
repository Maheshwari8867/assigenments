package assignment2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(1);
		Set<Integer>a2=new LinkedHashSet<>(al);
		List<Integer>list=new ArrayList<>(a2);
		/*
		 * from collections
		 */
		System.err.println("from using collections ");
		System.out.println("list with duplicate"+al);
		System.out.println("list without duplicate"+list);
	}
}