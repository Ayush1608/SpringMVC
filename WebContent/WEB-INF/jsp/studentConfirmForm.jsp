<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Student Details</title>
</head>
<body>
	<p>
	<h1>Student's Details</h1>

	First Name: ${student.firstName}
	<br />
	<br /> Last Name: ${student.lastName}
	<br />
	<br /> Country: ${student.country}
	<br />
	<br /> Language: ${student.language}
	<br />
	<br /> Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp }</li>
		</c:forEach>
	</ul>
	</p>
</body>
</html>