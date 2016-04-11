<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fomr" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8"/>
  <link rel="stylesheet" href="<c:url value="/static/css/home.css"/>"/>
    <title>Login Page</title>
</head>
<body>
<form:form method="POST" action="/check-user" commandName="user" class="box login">
  <fieldset class="boxBody">
    
    <form:label path="username">Name:</form:label>
    <form:input path="username"/>
    <form:errors path="username"/>

    <form:label path="passwd">Password:</form:label>
    <form:password path="passwd"/>
    <form:errors path="passwd" />

    <fomr:label path="admin">Admin</fomr:label>
    <form:checkbox path="admin"/>
    
  </fieldset>
  <footer>
    <label><input type="checkbox" tabindex="3"/>Keep me logged in </label>
    <input type="submit" class="btnLogin" value="login" tabindex="4"/>
  </footer>

</form:form>
</body>
</html>
