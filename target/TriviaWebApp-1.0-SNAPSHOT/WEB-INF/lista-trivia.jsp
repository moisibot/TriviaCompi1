
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Trivias - Trivia Game</title>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
    <div class="container">
        <h1>Lista de Trivias</h1>
        <a href="crear-trivia.jsp" class="button">Crear Nueva Trivia</a>
        <table>
            <thead>
                <tr>
                    <th>Título</th>
                    <th>Creador</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${trivias}" var="trivia">
                    <tr>
                        <td>${trivia.titulo}</td>
                        <td>${trivia.creador.nombreUsuario}</td>
                        <td>
                            <a href="editar-trivia?id=${trivia.id}">Editar</a>
                            <a href="eliminar-trivia?id=${trivia.id}">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <script src="js/script.js"></script>
</body>
</html>