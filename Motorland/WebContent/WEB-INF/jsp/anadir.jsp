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
                    <h4>Agregar nuevo motor</h4>                    
                    <a class="btn btn-warning" href="index.htm" style="margin-right: 100px">Inicio</a>
                </div>
                <div class="alert alert-warning" role="alert">
                    <ul>
                        <c:forEach var="error" items="${errores}" >
                        <li>${error.mensajeError}</li>
                        </c:forEach>
                    </ul>                    
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Modelo</label>
                        <input type="text" name="modelo" class="form-control"/>
                        <label>Fabricante</label>
                        <input type="text" name="fabricante" class="form-control"/>
                        <label>Potencia (cv)</label>
                        <input type="text" name="potencia" class="form-control"/>
                        <label>Peso (kg)</label>
                        <input type="text" name="peso" class="form-control"/>
                        <label>Cantidad</label>
                        <input type="text" name="cantidad" class="form-control"/>
                        <input type="submit" value="Añadir" class="btn btn-success"/>                        
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
