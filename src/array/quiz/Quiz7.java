package array.quiz;

public class Quiz7 {

	public static void main(String[] args) {
		int arrInt[] = {5, 20,100,30,77};
		int i = 0;
		for (; i < arrInt.length; i++)
			if (arrInt[i] == 20) break;
		System.out.println(i);
	}
}
