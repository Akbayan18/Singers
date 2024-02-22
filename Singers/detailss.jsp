<%@ page import="kz.baibalaeva.javaEE.Singers" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 16.11.2022
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>
<body>
<%
    Singers singers = (Singers) request.getAttribute("singers");
    if (singers != null){
%>

<label>NAME</label>
<div><%=singers.getName()%></div>
<label>SURNAME</label>
<div><%=singers.getSurname()%></div>
<label>BIRTHDATE</label>
<div><%=singers.getBirthdate()%></div>
<label>CITY</label>
<div><%=singers.getCity()%></div>

<%
    }
%>
</body>
</html>
