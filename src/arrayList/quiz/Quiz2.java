package arrayList.quiz;

import java.util.*;

public class Quiz2 {
	public static void main(String args[]) {
		ArrayList<Boolean> listChar = new ArrayList<>();
		
		listChar.add(true);
		listChar.add(true);
		listChar.add(false);
		for (int i = 0; i < 3; i++) {
			System.out.println(listChar.get(i));
		}
		System.out.println();
		for (boolean value : listChar)
			System.out.println(value);
	}
}
