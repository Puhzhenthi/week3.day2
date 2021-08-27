package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PayPalIndia {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] ch = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupcharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length ; i++) {
			if (charSet.contains(ch[i])) {
				dupcharSet.add(ch[i]);
			} else {
				charSet.add(ch[i]);
			}
			
			System.out.println("character set" + charSet);
			System.out.println(" Duplicate character set" + dupcharSet);

		}
	}

}
