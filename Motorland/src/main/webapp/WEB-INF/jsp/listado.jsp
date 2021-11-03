<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de motores</h1>
        <table>
            <tr>
                <th>Modelo</th>
                <th>Fabricante</th>
                <th>Potencia</th>
                <th>Peso</th>
                <th>Cantidad</th>
                <th>&Oacute;ptimo</th>
            </tr>
            <c:forEach items="${motores}" var="motor">
                <tr>
                    <td><c:out value="${motor.modelo}"></td>
                    <td><c:out value="${motor.fabricante}"></td>
                    <td><c:out value="${motor.potencia}"></td>
                    <td><c:out value="${motor.peso}"></td>
                    <td><c:out value="${motor.cantidad}"></td>
                    <td><c:out value="${motor.optimo}"></td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
