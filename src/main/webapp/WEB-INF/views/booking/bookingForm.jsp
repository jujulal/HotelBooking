<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Form</title>
</head>
<body>
	<h1>Booking Form</h1>
	<form action="/hotel/bookingConfirm" method="post">
	First Name<input type="text" name="firstName"/><br/>
	Last Name<input type="text" name="lastName"/><br/>
	<input type="submit" value="Confirm Booking"/>
	</form>
</body>
</html>