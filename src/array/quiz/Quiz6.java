package array.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		int arrInt[] = {5, 20,100,30,77};
		int max = 0;
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] > max)
				max = arrInt[i];
		}
		System.out.println(max);
	}
}
