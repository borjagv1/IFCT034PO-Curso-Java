<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>¡Éxito!</title>
</head>
<body style="font-family: sans-serif; margin: 40px; background-color: #e6fff0;">
    <h2>Respuesta procesada por el Modelo/Controlador:</h2>
    <h3 style="color: green;"><s:property value="mensaje" /></h3>
    <br/>
    <a href="index.jsp">Volver al formulario</a>
</body>
</html>