package array.quiz;

import java.util.Arrays;

public class Quiz8 {

	public static void main(String[] args) {
		Student student[] = new Student[3];
		
		student[0] = new Student("박", 100);
		student[1] = new Student("상", 101);
		student[2] = new Student("민", 102);
		
		for (int i = 0; i < student.length; i++) 
			student[i].showInfo();
		
		for (Student students : student) {
			System.out.println(students);
		}
	}
}

class Student {
	int studentId;
	String studentName;
	
	public Student(String studentName, int studentId) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println(studentName + " " + studentId);
	}
}
