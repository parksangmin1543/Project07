package arrayList.quiz;

import java.util.*;

public class Quiz {
	public static void main(String args[]) {
		ArrayList<Character> listChar = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			listChar.add((char) ('A'+i));
		}
		
		System.out.println(listChar);
	}
}
