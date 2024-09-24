<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilos.css">
</head>
<body>
    <h1>Error</h1>
    <p>Se ha producido un error: ${error}</p>
    <a href="${pageContext.request.contextPath}/index.jsp">Volver al Inicio</a>
</body>
</html>