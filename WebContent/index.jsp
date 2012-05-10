<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page errorPage="/error.jsp"  %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <jsp:include page="menu.jsp"/>
	<form action="addnotifier" method="post">
		<table>
			<tr>
				<td><label>Email: </label></td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td><label>Target URL: </label></td>
				<td><input type="text" name="targetUrl"></td>
			</tr>
			<tr>
				<td><label>Pattern String: </label></td>
				<td><input type="text" name="targetString"></td>
			</tr>
			<tr>
				<td><label>Frequency: </label></td>
				<td><input type="text" name="frequency"></td>
			</tr>
			<tr>
				<td><label>Regra: </label></td>
				<td><p>
						<input type="radio" name="rule" value="EXISTS">Contem
					</p>
					<p>
						<input type="radio" name="rule" value="DOES_NOT_EXIST">Nao
						contem
					</p></td>
			</tr>
			<tr>
                <td><input type="submit" value="VAI!"/>
			</tr>
		</table>
	</form>
</body>
</html>