<%@ page import="java.util.Collection" %>
<%@ page import="entity.Produto" %>
<%@ page import="entity.Config" %><%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 13/01/2021
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Produtos</title>
</head>
<body>
<H1>Lista de Produtos</H1>
<%
    Config app = new Config();
    Collection<Produto> produtos = (Collection<Produto>) request.getAttribute("produtos");
%>
<table border="1" width="100%">
    <tr>
        <td align="center"><strong>Produto</strong></td>
        <td align="center"><strong>Valor</strong></td>
        <td align="center"><strong></strong></td>
    </tr>
    <% for (Produto p : produtos) { %>
    <tr>
        <td align="center"><%= p.getName() %></td>
        <td align="center"><%= p.getValue() %></td>
        <td align="center"><a href="<%= app.getPatternApp() %>/Carrinho/Adicionar?id=<%= p.getId() %>">Adicionar</a></td>
    </tr>
    <% } %>
</table>
</body>
</html>
