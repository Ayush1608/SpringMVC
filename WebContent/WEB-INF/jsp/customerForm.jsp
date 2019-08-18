<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<style>
.error {
	color: red
}
</style>
</head>

<body>
	<form:form action="showConfirmForm" modelAttribute="customer">
		
			First Name:
			<form:input path="firstName" />
			Last Name:
			<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br/>
		<br/>
		
		Free Passes:
			<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br/>
		<br/>
		
		Postal Code:
			<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br/>
		<br/>
		
		Course Code:
			<form:input path="course" />
		<form:errors path="course" cssClass="error" />
		<br />
		<br />
		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>