<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Acciones de Usuario XSON</title>
    <style>
        body { font-family: Arial, sans-serif; max-width: 800px; margin: 0 auto; padding: 20px; }
        textarea { width: 100%; height: 300px; }
    </style>
</head>
<body>
    <h1>Formulario de Acciones de Usuario XSON</h1>
    <form action="UserActionServlet" method="post">
        <textarea name="xsonInput" placeholder="Ingrese su XSON aquí..."></textarea>
        <br>
        <input type="submit" value="Procesar Acción">
    </form>
    <h2>Ejemplos de Formato XSON:</h2>
    <pre>
// Crear Usuario:
<?xson version="1.0" ?>
<!realizar_solicitud: "USUARIO_NUEVO" >
{ "DATOS_USUARIO":[{
"USUARIO": "juanito619",
"PASSWORD": "12345678",
"NOMBRE": "JUAN PEREZ",
"INSTITUCION": "CUNOC"
}]
}
<fin_solicitud_realizada!>

// Modificar Usuario:
<!realizar_solicitud: "MODIFICAR_USUARIO" >
{ "DATOS_USUARIO":[{
"USUARIO_ANTIGUO": "juanito619",
"USUARIO_NUEVO": "juanito619lopez",
"NUEVO_PASSWORD": "12345678910"
}
]}
<fin_solicitud_realizada!>

// Eliminar Usuario:
<!realizar_solicitud: "ELIMINAR_USUARIO" >
{ "DATOS_USUARIO":[{
"USUARIO": "juanito619lopez"
}
]}
<fin_solicitud_realizada!>

// Login de Usuario:
<!realizar_solicitud: "LOGIN_USUARIO" >
{ "DATOS_USUARIO":[{
"USUARIO": "juanito619",
"PASSWORD": "12345678"
}
]}
<fin_solicitud_realizada!>
    </pre>
</body>
</html>