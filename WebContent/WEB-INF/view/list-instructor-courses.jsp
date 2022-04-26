<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

<title>Instructor ${instructor.firstName} ${instructor.lastName}'s Courses</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

<div id="wrapper">
<div id="header">

<h2>Instructor ${instructor.firstName} ${instructor.lastName}'s Courses</h2>

</div>
</div>

<div id="container">
<div id="content">

<!-- PUT BUTTON: ADD COURSES -->
<c:url var="addCoursesLink" value="/instructor/listAddInstructorCourses">
	<c:param name="instructorId" value="${instructorId}"/>
</c:url>
<a href="${addCoursesLink}">ADD COURSES</a>


<!-- ADD HTML TABLE HERE -->

<table>
	<tr>
		<th>Title</th>
		<th>Action</th>
	</tr>
	
	<!-- LOOP OVER EACH AND PRINT INSTRUCTOR -->
	<c:forEach var="tempCourse" items="${instructorCourses}">
	
	<!-- Construct delete link with CourseID -->
	<c:url var="deleteLink" value="/instructor/deleteInstructorCourse">
	
	<c:param name="courseId" value="${tempCourse.id}"/>
	<c:param name="instructorId" value="${instructorId}"/>
	
	</c:url>
	
	<tr>
		<td>${tempCourse.title}</td>
		<td>
			<a href="${deleteLink}"
			onClick="if(!(confirm('Are you sure you want to delete the instructor's course ?')))return false">DELETE</a>
		</td>
	</tr>

	</c:forEach>
	
</table>

</div>
</div>

<div style="clear;both;"> 

<p>
<a href="${pageContext.request.contextPath}/instructor/list">BACK TO INSTRUCTOR LIST</a>
</p>

</div>


</body>

</html>