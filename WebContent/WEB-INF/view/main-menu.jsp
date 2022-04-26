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

<h2>University Management System using Spring MVC and Hibernate</h2>
<h3>Coded by ASHIQUE MOHAIMIN ORNAB</h3>
<h5>Technologies Used: </h5>
<h6>Inversion Control and Dependency Injection using Java Configuration</h6>
<h6>Spring MVC - Models, Views, Controllers, Services, Data Access Objects, Request Param and Request Mapping, Form Tags and Data Binding, Built-in Validation Rules </h6>
<h6>Hibernate CRUD and Hibernate Mappings - @OneToMany and @ManyToMany</h6>

</div>
</div>

<div id="container">
<div id="content">

PLEASE SELECT AN OPTION:

<br><br>

<a href = "${pageContext.request.contextPath}/instructor/list">INSTRUCTORS</a>

<br><br>

<a href = "${pageContext.request.contextPath}/course/list">COURSES</a>

<br><br>

<a href = "${pageContext.request.contextPath}/student/list">STUDENTS</a>

</div>
</div>


</body>

</html>