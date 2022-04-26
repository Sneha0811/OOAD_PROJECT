<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<title>Save Course</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">
		
		<style>.error{color:red}</style>

</head>

<body>

<div id="wrapper">
<div id="header">

<h2>SAVE FORM</h2>

</div>
</div>

<div id="container">
<h3>Save Course</h3>

<form:form action="saveCourse" modelAttribute="course" method="POST">

<!-- Need associated FORM DATA's COURSE ID (will call course.getId() and then course.setId()) -->
<form:hidden path="id"/>

<table>
	<tbody>

		<tr>
		<td><label>Course Title: </label></td>
		<td><form:input path="title"/></td>
		<form:errors path="title" cssClass="error"/>
		</tr>
	
		<tr>
		<td><label></label></td>
		<td><input type="submit" value="SAVE" class="save"/></td>
		</tr>

	</tbody>

</table>

</form:form>

</div>

<div style="clear;both;"> 

<p>
<a href="${pageContext.request.contextPath}/course/list">BACK TO COURSE LIST</a>
</p>

</div>


</body>

</html>