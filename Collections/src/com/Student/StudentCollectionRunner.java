package com.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class AcendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}

}

class DecendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student2.getId(), student1.getId());
	}

}

public class StudentCollectionRunner {

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(78, "Shariyar"), new Student(44, "Pranto"),
				new Student(1, "Shipan"), new Student(2, "Durjoy"), new Student(4, "Rony"),
				new Student(99, "Ismail"));

		List<Student> allStudent = new ArrayList<>(students);
		AcendingStudentComparator acending = new AcendingStudentComparator();
		DecendingStudentComparator decending = new DecendingStudentComparator();


		System.out.println(allStudent);
		// Collections.sort(allStudent);
		allStudent.sort(acending);
		System.out.println(allStudent);
		allStudent.sort(decending);
		System.out.println(allStudent);
	}

}
