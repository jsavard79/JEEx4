<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, java.util.ArrayList, ca.nbcc.student" %>
<%@ taglib uri="/WEB-INF/student.tld" prefix="student"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JavaEEx4</title>
</head>
<%!

public List<student> getStudents() {
	List<student> students = new ArrayList();
	
	students.add(new student("1", "John", "Doe"));
	students.add(new student("2", "Jane", "Smith"));
	students.add(new student("3", "Harry", "Potter"));
	students.add(new student("4", "Ron", "Weasley"));
	students.add(new student("5", "Hermione", "Granger"));
	students.add(new student("6", "Draco", "Malfoy"));
	
	return students;
	
}

public student getStudent(String id) {
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

%>
<body>
	<form name="form1" method="POST" action="student.jsp">
		<select name='students' id='students'>
		<%
			List<student> students = getStudents();
		
			String id;
			String fName;
			String lName;
			
			for (student student : students){
				id = student.getId();
				fName = student.getFirstName();
				lName = student.getLastName();		
		%>
			<student:student id="<%=id%>" firstName="<%=fName%>" lastName="<%=lName%>"></student:student>
		<%
			}
		%>	
		 </select>
	</form>
</body>
</html>