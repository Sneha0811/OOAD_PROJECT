<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

<title>Student ${student.firstName} ${student.lastName}'s Courses</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

<div id="wrapper">
<div id="header">

<h2>Student ${student.firstName} ${student.lastName}'s Courses</h2>

</div>
</div>

<div id="container">
<div id="content">

<!-- PUT BUTTON: ADD COURSES -->
<c:url var="addCoursesLink" value="/student/listAddStudentCourses">
	<c:param name="studentId" value="${studentId}"/>
</c:url>
<a href="${addCoursesLink}">ADD COURSES</a>


<!-- ADD HTML TABLE HERE -->

<table>
	<tr>
		<th>Title</th>
		<th>Action</th>
	</tr>
	
	<!-- LOOP OVER EACH AND PRINT INSTRUCTOR -->
	<c:forEach var="tempCourse" items="${studentCourses}">
	
	<!-- Construct delete link with CourseID -->
	<c:url var="deleteLink" value="/student/deleteStudentCourse">
	
	<c:param name="courseId" value="${tempCourse.id}"/>
	<c:param name="studentId" value="${studentId}"/>
	
	</c:url>
	
	<tr>
		<td>${tempCourse.title}</td>
		<td>
			<a href="${deleteLink}"
			onClick="if(!(confirm('Are you sure you want to delete the student's course ?')))return false">DELETE</a>
		</td>
	</tr>

	</c:forEach>
	
</table>

</div>
</div>

<div style="clear;both;"> 

<p>
<a href="${pageContext.request.contextPath}/student/list">BACK TO STUDENT LIST</a>
</p>

</div>


</body>

</html>