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
    <title>P�gina inicial</title>
</head>
<body>
<%@ include file="header.jsp" %> <!-- JSP compilado j� contem o conte�do a ser incluido -->
<jsp:include page="header.jsp"></jsp:include> <!-- Conte�do � incluido apenas na renderiza��o (quando vai ser mostrado/processado/enviado ao cliente) ESSE � MAIS UTILIZADO!!!-->
<!-- OBS: tamb�m pode fazer include de um arquivo html! -->

Conte�do da p�gina inicial
Jo�o
</body>
</html>
