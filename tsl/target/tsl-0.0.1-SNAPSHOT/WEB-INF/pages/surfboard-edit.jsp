Sign up Sign in
Explore
Features
Enterprise
Blog

This repository
Star 17 Fork 26 PUBLIC Fruzenshtein / spr-data
 branch: master  spr-data / src / main / webapp / WEB-INF / pages / surfboard-edit.jsp 
Alex Fruzenshtein 8 months ago Spring MVC Validator
1 contributor
 file  35 lines (35 sloc)  1.079 kb  Open EditRawBlameHistory Delete
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Edit Surfboard page</title>
</head>
<body>
<h1>Edit Surfboard page</h1>
<form:form method="POST" commandName="surfboard" action="${pageContext.request.contextPath}/surfboard/edit/${surfboard.id}.html" >
<table>
<tbody>
<tr>
<td>Surfboard name:</td>
<td><form:input path="name" /></td>
<td><form:errors path="name" cssStyle="color: red;"/></td>
</tr>
<tr>
<td>Employees number:</td>
<td><form:input path="emplNumber" /></td>
<td><form:errors path="emplNumber" cssStyle="color: red;"/></td>
</tr>
<tr>
<td><input type="submit" value="Create" /></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>
</form:form>
<a href="${pageContext.request.contextPath}/">Home page</a>
</body>
</html>