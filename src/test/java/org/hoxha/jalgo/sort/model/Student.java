package org.hoxha.jalgo.sort.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double gpa;

	public static Student of(int id, String name, double gpa) {
		return new Student(id, name, gpa);
	}

	private Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student) o;
		return id == student.id && Double.compare(student.gpa, gpa) == 0 && name.equals(student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, gpa);
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + '}';
	}
}
