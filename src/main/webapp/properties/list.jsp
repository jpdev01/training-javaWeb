<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 12/01/2021
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Propriedades</title>
</head>
<body>
<%
    @SuppressWarnings("unchecked")
    Map<String, String> props = (Map<String, String>) request.getAttribute("props");
%>

<CENTER><H1>Propriedades</H1></CENTER>

<a href="Edit">Criar nova propriedade</a>
<br><br>
<table border="1" width="100%">
    <tr>
        <td align="center"><strong>Propriedade</strong></td>
        <td align="center"><strong>Valor</strong></td>
        <td colspan="2"></td>
    </tr>
<% for (Map.Entry<String, String> entry : props.entrySet()) { %>
    <tr>
        <td align="center"><%= entry.getKey() %></td>
        <td align="center"><%= entry.getValue() %></td>
        <td align="center"><a href="Edit?key=<%= entry.getKey() %>">Editar</a></td>
        <td align="center"><a href="Delete?key=<%= entry.getKey() %>">Excluir</a></td>
    </tr>

<% } %>
</table>
</body>
</html>
