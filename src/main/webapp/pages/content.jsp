<%--
  Created by IntelliJ IDEA.
  User: jptru
  Date: 10/01/2021
  Time: 17:23
  To change this template use File | Settings | File Templates.

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
    <title>Página inicial</title>
</head>
<body>
<%@ include file="header.jsp" %> <!-- JSP compilado já contem o conteúdo a ser incluido -->
<jsp:include page="header.jsp"></jsp:include> <!-- Conteúdo é incluido apenas na renderização (quando vai ser mostrado/processado/enviado ao cliente) ESSE É MAIS UTILIZADO!!!-->
<!-- OBS: também pode fazer include de um arquivo html! -->

Conteúdo da página inicial
João
</body>
</html>
