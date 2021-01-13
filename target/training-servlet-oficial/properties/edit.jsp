<%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 12/01/2021
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editar</title>
</head>
<body>
<%
    String key = (String) request.getAttribute("key");
    key = (key != null) ? key : "";

    String value = (String) request.getAttribute("value");
    value = (value != null) ? value : "";
%>
<CENTER><H1>Editar</H1></CENTER>
<form action="save" method="post">
    <table>
        <tr>
            <td>Chave: </td>
            <td><input type="text" name="key" value="<%= key %>"> </td>
            <td>Valor: </td>
            <td><input type="text" name="value" value="<%= value %>"></td>
        </tr>
        <tr>
            <td colspan="2" align="right"><input type="submit" value="salvar"></td>
        </tr>
    </table>
</form>
</body>
</html>
