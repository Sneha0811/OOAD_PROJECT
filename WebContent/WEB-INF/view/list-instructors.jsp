<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

<title>All Instructors</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

<div id="wrapper">
<div id="header">

<h2>All Instructors</h2>

</div>
</div>

<div id="container">
<div id="content">

<!-- PUT BUTTON: ADD INSTRUCTOR -->
<input type="button" value="Add Instructor" onClick="window.location.href='showFormForAdd'; return false;"
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
	<c:forEach var="tempInstructor" items="${instructors}">
	
	<!-- Construct update link with InstructorID -->
	<c:url var="updateLink" value="/instructor/showFormForUpdate">
	
	<c:param name="instructorId" value="${tempInstructor.id}"/>
	
	</c:url>
	
	<!-- Construct delete link with InstructorID -->
	<c:url var="deleteLink" value="/instructor/delete">
	
	<c:param name="instructorId" value="${tempInstructor.id}"/>
	
	</c:url>
	
	<!-- Construct COURSES link with InstructorID -->
	<c:url var="coursesLink" value="/instructor/courses">
	
	<c:param name="instructorId" value="${tempInstructor.id}"/>
	
	</c:url>
	
	
	<tr>
		<td>${tempInstructor.firstName}</td>
		<td>${tempInstructor.lastName}</td>
		<td>${tempInstructor.email}</td>
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