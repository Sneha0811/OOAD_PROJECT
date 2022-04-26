<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<title>Save Instructor</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">
		
		<style>.error{color:red}</style>

</head>

<body>

<div id="wrapper">
<div id="header">

<h2>Save Instructor</h2>

</div>
</div>

<div id="container">
<h3>Save Instructor</h3>

<form:form action="saveInstructor" modelAttribute="instructor" method="POST">

<!-- Need associated FORM DATA's INSTRUCTOR ID (will call instructor.getId() and then instructor.setId()) -->
<form:hidden path="id"/>

<table>
	<tbody>

		<tr>
		<td><label>First Name: </label></td>
		<td><form:input path="firstName"/><form:errors path="firstName" cssClass="error"/></td>
		</tr>
	
		<tr>
		<td><label>Last Name: </label></td>
		<td><form:input path="lastName"/></td>
		</tr>
	
		<tr>
		<td><label>Email: </label></td>
		<td><form:input path="email"/><form:errors path="email" cssClass="error"/></td>
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
<a href="${pageContext.request.contextPath}/instructor/list">BACK TO INSTRUCTOR LIST</a>
</p>

</div>


</body>

</html>