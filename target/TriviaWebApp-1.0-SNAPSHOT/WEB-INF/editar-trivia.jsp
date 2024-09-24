<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Editar Trivia - Trivia Game</title>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
    <div class="container">
        <h1>Editar Trivia</h1>
        <form action="editar-trivia" method="post">
            <input type="hidden" name="id" value="${trivia.id}">
            <div class="form-group">
                <label for="titulo">Título de la Trivia:</label>
                <input type="text" id="titulo" name="titulo" value="${trivia.titulo}" required>
            </div>
            <div id="preguntas">
                <c:forEach items="${trivia.preguntas}" var="pregunta" varStatus="status">
                    <div class="pregunta">
                        <h3>Pregunta ${status.index + 1}</h3>
                        <input type="text" name="pregunta${status.index + 1}" value="${pregunta.texto}" required>
                        <c:forEach items="${pregunta.respuestas}" var="respuesta" varStatus="respStatus">
                            <input type="text" name="respuesta${status.index + 1}_${respStatus.index + 1}" value="${respuesta.texto}" required>
                        </c:forEach>
                        <select name="respuestaCorrecta${status.index + 1}">
                            <c:forEach begin="1" end="4" var="i">
                                <option value="${i}" ${pregunta.indiceRespuestaCorrecta == i ? 'selected' : ''}>Respuesta ${i}</option>
                            </c:forEach>
                        </select>
                    </div>
                </c:forEach>
            </div>
            <button type="button" id="agregarPregunta">Agregar Pregunta</button>
            <button type="submit">Guardar Cambios</button>
        </form>
    </div>
    <script src="js/script.js"></script>
</body>
</html>
