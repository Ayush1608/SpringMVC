<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form:form action="showConfirmForm" modelAttribute="student">
		<p>
			First Name:
			<form:input path="firstName" />
			Last Name:
			<form:input path="lastName" />
			<br />
			<br /> <br /> Country:
			<form:select path="country">
				<form:options items="${student.listOfCountries }" />
			</form:select>
			<br />
			<br /> Language: Java
			<form:radiobutton path="language" value="Java" />
			C#
			<form:radiobutton path="language" value="C#" />
			Python
			<form:radiobutton path="language" value="Python" />
			<br />
			<br /> Operating Systems: Windows
			<form:checkbox path="operatingSystems" value="Windows" />
			Linux
			<form:checkbox path="operatingSystems" value="Linux" />
			<br />
			<br /> <input type="submit" value="Submit" />
		</p>
	</form:form>
</body>
</html>