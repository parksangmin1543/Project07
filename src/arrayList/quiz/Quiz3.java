package arrayList.quiz;

import java.util.*;

public class Quiz3 {
	public static void main(String args[]) {
		ArrayList<String> listChar = new ArrayList<>();
		
		listChar.add("AA");
		listChar.add("BB");
		listChar.add("CC");
		listChar.add("DD");
		listChar.add("EE");
		for (int i = 0; i < 5; i++) {
			listChar.remove(0);
		}
		System.out.println(listChar);
	}
}
