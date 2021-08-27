package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	int[] Str1 = { 3, 2, 11, 4, 6, 7 };
	int[] Str2 = { 1, 2, 8, 4, 9, 7 };

	public void findint() {
		List<Integer> P = new ArrayList<Integer>();
		for (int i = 0; i < Str1.length; i++) {
			for (int j = 0; j < Str2.length; j++) {
				if (Str1[i] == Str2[j]) {
					P.add(Str1[i]);

				}
			}
		}
		System.out.println("Intersection elements are : " + P);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindIntersection obj = new FindIntersection();
obj.findint();
	}

}
