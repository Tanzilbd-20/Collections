package Collections.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class AscendingStudentId implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}
}
class DescendingStudentId implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student2.getId(), student1.getId());
	}
}
public class StudentCollectionRunner {

	public static void main(String[] args) {

		List<Student> student = List.of(new Student(89, "Durjoy"), new Student(8, "Tapu"), new Student(2, "Ranga"),
				new Student(1, "Tanzil"), new Student(4, "Ashik"));
		ArrayList<Student> allStudent = new ArrayList<>(student);
		AscendingStudentId ascending = new AscendingStudentId();
		DescendingStudentId descending = new DescendingStudentId();

		System.out.println(allStudent);
		// Collections.sort(allStudent);
		allStudent.sort(ascending);
		System.out.println(allStudent);
		allStudent.sort(descending);
		System.out.println(allStudent);

	}

}
