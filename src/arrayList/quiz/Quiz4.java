package arrayList.quiz;

import java.util.*;

public class Quiz4 {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("박", 100));
		list.add(new Student("상", 101));
		list.add(new Student("민", 102));
		
		System.out.println(list);
		
		for (int i =0; i < 3; i++) {
			Student student = list.get(i);
			student.showStudentInfo();
		}
		
		for (Student student : list) {
			student.showStudentInfo();
		}
	}
}

class Student {
	String StudentName;
	int StudentId;
	
	public Student(String StudentName, int StudentId) {
		this.StudentName = StudentName;
		this.StudentId = StudentId;
	}
	
	public void showStudentInfo() {
		System.out.println(StudentName + "," + StudentId);
	}
}
