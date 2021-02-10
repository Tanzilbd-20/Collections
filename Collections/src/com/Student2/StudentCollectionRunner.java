package com.Student2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class AscendingStudentName implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}

}
class DescendingStudentName implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student2.getId(), student1.getId());
	}

}
public class StudentCollectionRunner {

	public static void main(String[] args) {

		List<Student> student = List.of(new Student(3, "Ashik"), new Student(4, "Shipan"), new Student(10, "Tapu"),
				new Student(15, "Durjoy"), new Student(1, "Tanzil"));

		List<Student> allStudents = new ArrayList<>(student);
		AscendingStudentName ascendig = new AscendingStudentName();
		DescendingStudentName descending = new DescendingStudentName();

		System.out.println("Default" + allStudents);
		allStudents.sort(ascendig);
		System.out.println("With Ascending" + allStudents);
		allStudents.sort(descending);
		System.out.println("With Descending " + allStudents);

	}

}
