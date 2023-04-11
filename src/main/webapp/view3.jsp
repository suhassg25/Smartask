<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.tek.Dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >
a {
	color: blue;
}
a:hover{color: red;}
</style>
</head>

<body>
<form action="delete" method="get">
	<table border="2px solid aqua">
		<thead>
			<tr>
				<th>Id</th>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>DATE OF BIRTH</th>
				<th>AGE</th>
				<th>GENDER</th>
				<th>GRADE</th>

			</tr>

		</thead>
		<%List<Student> name= (List) request.getAttribute("names"); for(Student std : name ) { %>
		
		<tr>
			
			<td><%=std.getId() %></td>
			<td><%=std.getFirstName() %></td>
			<td><%=std.getLastName() %></td>
			<td><%=std.getDOB() %></td>
			<td><%=std.getAge() %></td>
			<td><%=std.getGender() %></td>
			<td><%=std.getGrade() %></td>
			<td><a href="admin?id=<%= std.getId()%>"> DELETE </a> </td>

		</tr>
		<%} 
		
		%>

	</table>

	<br>
	<a href="index.jsp"> HOME </a>
</form>

</body>
</html>