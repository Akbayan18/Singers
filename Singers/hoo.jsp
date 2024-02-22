<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.baibalaeva.javaEE.Singers" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 16.11.2022
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<table border="1">
    <%
       ArrayList<Singers> list = (ArrayList<Singers>) request.getAttribute("list");
       if (list != null){
           for (Singers st: list){
    %>
    <div><%=st.getId()%></div>
    <div><%=st.getName()%></div>
    <div><%=st.getSurname()%></div>
    <div><%=st.getBirthdate()%></div>
    <div><%=st.getCity()%></div>
    <div><a href="/detailss?id=<%=st.getId()%>">Details</a></div>
    <%
        }
        }
    %>
</table>

</body>
</html>
