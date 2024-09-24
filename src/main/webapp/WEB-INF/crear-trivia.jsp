<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear Trivia - Trivia Game</title>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
    <div class="container">
        <h1>Crear Nueva Trivia</h1>
        <form action="crear-trivia" method="post">
            <div class="form-group">
                <label for="titulo">Título de la Trivia:</label>
                <input type="text" id="titulo" name="titulo" required>
            </div>
            <div id="preguntas">
                <div class="pregunta">
                    <h3>Pregunta 1</h3>
                    <input type="text" name="pregunta1" placeholder="Ingrese la pregunta" required>
                    <input type="text" name="respuesta1_1" placeholder="Respuesta 1" required>
                    <input type="text" name="respuesta1_2" placeholder="Respuesta 2" required>
                    <input type="text" name="respuesta1_3" placeholder="Respuesta 3" required>
                    <input type="text" name="respuesta1_4" placeholder="Respuesta 4" required>
                    <select name="respuestaCorrecta1">
                        <option value="1">Respuesta 1</option>
                        <option value="2">Respuesta 2</option>
                        <option value="3">Respuesta 3</option>
                        <option value="4">Respuesta 4</option>
                    </select>
                </div>
            </div>
            <button type="button" id="agregarPregunta">Agregar Pregunta</button>
            <button type="submit">Crear Trivia</button>
        </form>
    </div>
    <script src="js/script.js"></script>
</body>
</html>
