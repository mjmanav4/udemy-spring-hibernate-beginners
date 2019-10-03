<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country:
		<form:select path="country">
		<form:options items="${student.countryOptions}"/>
		
		</form:select>
		
		Lang:
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		c <form:radiobutton path="favoriteLanguage" value="C"/>
		c++ <form:radiobutton path="favoriteLanguage" value="C++"/>
		go <form:radiobutton path="favoriteLanguage" value="Go"/>
	
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












