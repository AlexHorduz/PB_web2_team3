<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Enter the numbers to calculate the following formula</h1>
<img src="formula7.png" alt="7th formula image" border="2" height="150"/>
<br/>
<br/>
<form action="formula7" method="POST">
    a = <input type="text" name="a" value="" /> <br/> <br/>
    b = <input type="text" name="b" value="" /> <br/> <br/>
    c = <input type="text" name="c" value="" /> <br/> <br/>
    d = <input type="text" name="d" value="" /> <br/> <br/>
    <input type="submit" value="Calculate"/>
</form>
<a href="index.jsp">
    <h2>Main menu</h2>
</a>
</body>
</html>