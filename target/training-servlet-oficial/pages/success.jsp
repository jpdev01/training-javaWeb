<%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 10/01/2021
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getAttribute("r").toString();
%>
<h1>Cadastro efetuado com sucesso!</h1>
<h2>O nome do cliente cadastrado é: <%= name %></h2>
</body>
</html>
