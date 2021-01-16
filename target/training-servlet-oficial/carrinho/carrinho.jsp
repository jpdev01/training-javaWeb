<%@ page import="entity.Produto" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collection" %>
<%@ page import="entity.Config" %><%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 13/01/2021
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <title>Carrinho</title>
</head>
<body>
<%
    Config app = new Config();
%>
<p><a href="<%= app.getPatternApp() %>/Produtos/List/">Voltar para a lista de produtos</a></p>
<%
    String username = "";
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("username")) {
                username = c.getValue();
            }
        }
    }
%>
<H1>Lista de Produtos - carrinho de <%= username %>
</H1>
<%
    List<Produto> produtos = (List<Produto>) request.getAttribute("carrinho");
%>
<form action="<%= app.getPatternApp() %>User/Save" method="post">
    <label>Nome:</label>
    <input type="text" value="" name="name">
    <input name="produtos" value="<%=produtos%>">
    <button type="submit">Salvar dados</button>
</form>
<table border="1" width="100%">
    <tr>
        <td align="center"><strong>Produto</strong></td>
        <td align="center"><strong>Valor</strong></td>
        <td align="center"><strong></strong></td>
    </tr>
    <% if (produtos != null && !(produtos.isEmpty())) {
        for (Produto p : produtos) { %>
    <tr>
        <td align="center"><%= p.getName() %>
        </td>
        <td align="center"><%= p.getValue() %>
        </td>
        <td align="center"><a href="<%= app.getPatternApp() %>/Carrinho/Excluir?id=<%= p.getId() %>">Excluir</a></td>
    </tr>
    <% }

    } else {
    %>
    <tr>
        <td colspan="3">Seu carrinho está vazio!</td>
    </tr>
    <%
    }%>
</table>
</body>
</html>
