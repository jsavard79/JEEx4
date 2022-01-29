package ca.nbcc;

import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class student {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public student() {
		
	}
	
	public student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public List<student> getStudents() {
		List<student> students = new ArrayList();
		
		students.add(new student(students.size() + 1, "John", "Doe"));
		students.add(new student(students.size() + 1, "Jane", "Smith"));
		students.add(new student(students.size() + 1, "Harry", "Potter"));
		students.add(new student(students.size() + 1, "Ron", "Weasley"));
		students.add(new student(students.size() + 1, "Hermione", "Granger"));
		students.add(new student(students.size() + 1, "Draco", "Malfoy"));
		
		return students;
		
	}

	public student getStudent(int id) {
		List<student> students = getStudents();
		
		return students.stream()
				.filter(student -> id == student.getId())
				.findAny()
				.orElse(null);
	}

	public boolean isStudentOnTeam(List<student> team, student student) {
		
		student result = team.stream()
				.filter(s -> s == student)
				.findAny()
				.orElse(null);
		
		return result != null;
	}
	
}
