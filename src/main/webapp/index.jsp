<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Importamos las etiquetas oficiales de Struts 2 --%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Inicio Struts con Validación</title>
    <style>
        /* Struts añade automáticamente la clase 'errorMessage' cuando falla algo */
        .errorMessage { color: red; font-weight: bold; list-style: none; padding: 0; }
    </style>
</head>
<body style="font-family: sans-serif; margin: 40px;">
    <h2>Mi Primer Proyecto MVC con Struts 2</h2>

    <%-- Si hubiera un error global (addActionError), se pintaría aquí con esto: --%>
    <s:actionerror />

    <form action="saludar.action" method="post">
        <%-- La etiqueta s:fielderror busca si addFieldError("nombre", ...) tiene algo y lo pinta --%>
        <s:fielderror fieldName="nombre" />

        <label for="nombre">Introduce tu nombre:</label>
        <input type="text" id="nombre" name="nombre" />

        <button type="submit">Enviar al Controlador</button>
    </form>
</body>
</html>