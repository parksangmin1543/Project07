package array.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		int arrInt[] = { 10,15,20,25,30};
		int total = 0;
		for (int i = 0; i < arrInt.length; i++) {
			total += arrInt[i];
		}
		System.out.println(total);
	}
}
