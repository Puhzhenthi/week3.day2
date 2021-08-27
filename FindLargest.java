package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> List1 = new ArrayList<Integer>();
		for (int i : data) {
			List1.add(i);
		}
		Collections.sort(List1);
		System.out.println(List1);
		int sizeofthearray = List1.size();
		System.out.println("Second Laegest Number:" + List1.get(sizeofthearray - 2));
	}
}
