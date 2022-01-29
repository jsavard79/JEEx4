<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, java.util.ArrayList, ca.nbcc.student" %>
<%@ taglib uri="/WEB-INF/student.tld" prefix="student"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JavaEEx4</title>
</head>

<body>
	<student:studentdropdown name="studentdropdown" /><br /><br />
	<student:studentdropdown name="studentdropdown" selectIndex="1" /><br /><br />
	<student:studentdropdown name="studentdropdown" selectIndex="2" /><br /><br />
</body>
</html>