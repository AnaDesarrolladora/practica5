<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Motorland | Tu web del motor</title>
    </head>

    <body>
        <div class="container mt-4">
            <h1>Bienvenido a Motorland, tu web del motor</h1>
        </div>
        <div class="container mt-4" style="align-content: center">
            <center><h2>¿Qué deseas hacer?</h2></center>
        </div> 
        <div class="container mt-4">
            <div class="card border-info">                
                <div class="card-body bg-info text-white" style="display: flex; flex-flow: column"> 
                    <a class="btn btn-primary" href="anadir.htm" style="margin-bottom: 5px">Insertar motor</a>
                    <a class="btn btn-warning" href="listado.htm">Ver listado de motores</a>
                </div>
            </div>
        </div>
    </body>
</html>
