package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		String Text = "We learn java basics as part of java sessions in java week1";
		String result = " ";
		String[] text1 = Text.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(text1));

		for (String text2 : set) {
			result = result + text2 + " ";
		}
		System.out.println(result);
	}

}
