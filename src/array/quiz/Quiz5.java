package array.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		int arrInt[] = {2,4,6,9,5,8,10, 11,13,17};
		
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] % 2 == 0)
				System.out.println(arrInt[i]);
		}
	}
}
