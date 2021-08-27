package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {

		int[] arr1 = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> array = new ArrayList<Integer>();
		List<Integer> Duplicate = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					Duplicate.add(arr1[i]);
				}
			}
			array.add(arr1[i]);
		}
		array.removeAll(Duplicate);
		System.out.println("After Removing Duplicate Numbers:"+array);

	}

}
