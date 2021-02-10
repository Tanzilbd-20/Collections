package com.Student;

public class Student implements Comparable<Student> {

	private int id;
	private String name;


	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("ID - %d,Name - %s", id, name);
	}

	@Override
	public int compareTo(Student lastId) {

		return Integer.compare(lastId.id, this.id);
	}

}
