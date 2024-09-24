<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de Usuario</title>
    <style>
        textarea {
            width: 100%;
            height: 200px;
        }
    </style>
</head>
<body>
    <h1>Registro de Usuario</h1>
    <form action="${pageContext.request.contextPath}/registro" method="post">
        <textarea name="xsonData" placeholder="Ingrese los datos del usuario en formato XSON"><?xson version="1.0" ?>
<!realizar_solicitud: "USUARIO_NUEVO" >
{ "DATOS_USUARIO":[{
"USUARIO": "",
"PASSWORD": "",
"NOMBRE": "",
"INSTITUCION": ""
}]
}
<fin_solicitud_realizada!></textarea>
        <br><br>
        <input type="submit" value="Registrar Usuario">
    </form>
</body>
</html>