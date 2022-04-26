<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

<title>All Students</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

<div id="wrapper">
<div id="header">

<h2>All Students</h2>

</div>
</div>

<div id="container">
<div id="content">

<!-- PUT BUTTON: ADD INSTRUCTOR -->
<input type="button" value="Add Student" onClick="window.location.href='showFormForAdd'; return false;"
class = "add-button" />

<!-- ADD HTML TABLE HERE -->

<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Action</th>
	</tr>
	
	<!-- LOOP OVER EACH AND PRINT INSTRUCTOR -->
	<c:forEach var="tempStudent" items="${students}">
	
	<!-- Construct update link with StudentID -->
	<c:url var="updateLink" value="/student/showFormForUpdate">
	
	<c:param name="studentId" value="${tempStudent.id}"/>
	
	</c:url>
	
	<!-- Construct delete link with StudentID -->
	<c:url var="deleteLink" value="/student/delete">
	
	<c:param name="studentId" value="${tempStudent.id}"/>
	
	</c:url>
	
	<!-- Construct COURSES link with StudentID -->
	<c:url var="coursesLink" value="/student/courses">
	
	<c:param name="studentId" value="${tempStudent.id}"/>
	
	</c:url>
	
	
	<tr>
		<td>${tempStudent.firstName}</td>
		<td>${tempStudent.lastName}</td>
		<td>${tempStudent.email}</td>
		<td>
			<a href="${updateLink}">UPDATE</a>
			|
			<a href="${deleteLink}"
			onClick="if(!(confirm('Are you sure you want to delete ?')))return false">DELETE</a>
			|
			<a href="${coursesLink}">SHOW COURSES</a>
		</td>
	</tr>

	</c:forEach>
	
</table>

</div>
</div>

<div style="clear;both;"> 

<p>
<a href="${pageContext.request.contextPath}/home/menu">BACK TO HOME MENU</a>
</p>

</div>

</body>

</html>