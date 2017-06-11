package org.jango.sort.model;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double gpa;

	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public int compareTo(Student student) {
		if (student == null) {
			throw new NullPointerException();
		}
		if (this.id > student.id) {
			return 1;
		} else if (this.id < student.id) {
			return -1;
		}
		return 0;
	}
}
