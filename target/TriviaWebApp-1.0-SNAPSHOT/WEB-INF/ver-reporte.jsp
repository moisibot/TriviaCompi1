<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Reporte de Trivia - Trivia Game</title>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
    <div class="container">
        <h1>Reporte de Trivia</h1>
        <h2>${trivia.titulo}</h2>
        <p>Creado por: ${trivia.creador.nombreUsuario}</p>
        <h3>Estadísticas:</h3>
        <ul>
            <li>Número de veces jugada: ${estadisticas.vecesJugada}</li>
            <li>Puntuación promedio: ${estadisticas.puntuacionPromedio}</li>
            <li>Mejor puntuación: ${estadisticas.mejorPuntuacion}</li>
        </ul>
        <h3>Preguntas:</h3>
        <c:forEach items="${trivia.preguntas}" var="pregunta" varStatus="status">
            <div class="pregunta">
                <h4>Pregunta ${status.index + 1}: ${pregunta.texto}</h4>
                <p>Porcentaje de respuestas correctas: ${pregunta.porcentajeCorrectas}%</p>
            </div>
        </c:forEach>
    </div>
    <script src="js/script.js"></script>
</body>
</html>
