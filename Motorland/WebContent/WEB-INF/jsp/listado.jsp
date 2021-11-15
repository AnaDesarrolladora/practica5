<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Motorland | Listado de motores</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white" style="display:flex; flex-flow: row-reverse">
                    <a class="btn btn-warning" href="index.htm" style="margin-left: 50px">Inicio</a>
                    <a class="btn btn-primary" href="anadir.htm">Insertar motor</a>                    
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                           <tr>
                                <th>Modelo</th>
                                <th>Fabricante</th>
                                <th>Potencia (cv)</th>
                                <th>Peso (kg)</th>
                                <th>Cantidad</th>
                                <th>Óptimo</th>
                            </tr> 
                        </thead>                        
                        <tbody>
                            <c:forEach var="motor" items="${lista}" >
                                <tr>
                                    <td>${motor.modelo}</td>
                                    <td>${motor.fabricante}</td>
                                    <td>${motor.potencia}</td>
                                    <td>${motor.peso}</td>
                                    <td>${motor.cantidad}</td>
                                    <td>
                                        <c:if test="${motor.optimo == true}">Sí</c:if>
                                        <c:if test="${motor.optimo == false}">No</c:if>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>                        
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
