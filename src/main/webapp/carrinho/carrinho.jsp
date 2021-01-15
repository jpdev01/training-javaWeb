
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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Carrinho</title>
</head>
<body>
<%
    Config app = new Config();
%>
<p><a href="<%= app.getPatternApp() %>/Produtos/List/">Voltar para a lista de produtos</a></p>
<H1>Lista de Produtos no carrinho</H1>
<%
    List<Produto> produtos = (List<Produto>) request.getAttribute("carrinho");
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
        <td align="center"><a href="<%= app.getPatternApp() %>/Carrinho/Excluir?id=<%= p.getId() %>">Excluir</a></td>
    </tr>
    <% } %>
    <%
        if (produtos.isEmpty() || produtos == null){ %>
            <tr>
                <td colspan="3">Seu carrinho está vazio!</td>
            </tr>
       <% }%>

</table>
</body>
</html>
