package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArray {

	public static void main(String[] args) {
		String[] array = { "ASPIRE SYSTEM", "HCL", "CTS", "WIPRO" };

		List<String> str = new ArrayList<String>(Arrays.asList(array));
		System.out.println("length of the array");
		int strsize = str.size();
		System.out.println(strsize);
		Collections.sort(str);
		System.out.println(str);
		
		}

	}
