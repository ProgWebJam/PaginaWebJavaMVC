<%-- 
    Document   : index
    Created on : 05-feb-2020, 17:08:59
    Author     : Jhon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ie.cit.cloudapp.Todo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="repo" class="ie.cit.cloudapp.TodoRepository"
	scope="session"></jsp:useBean>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="css/estiloIndex.css" rel="stylesheet">
        <script src="js/main.js" ></script>
    </head>
    <body>     
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12 col-md-offset-3">
                <h1 class="text-center">Sistema de Votación</h1>
                </div>
            </div>
                <hr>

            <div class="container">
                <div class="center-block col-md-4 col-xs-8">
                    <div class="container-form">
                        <form action="ControladorLogin"  method="post" id="forminiciar">
                        <div class="form-group">
                            
                    
                            <label for="usuarioLogin">Usuario</label>
                            <input type="text" name="usuarioLogin" class="form-control" id="usuarioLogin" placeholder=
                                   "Ingrese su ususario">
                            
                            <label for="password">Contraseña</label>
                            <input type="password" name="password" class="form-control" id="password" 
                                   placeholder="Ingrese su contraseña">
                        </div>

                            <input type ="submit" class="btn btn-primary" Value="Iniciar secion" id="botoniniciar">
                       <input type ="submit"  class="btn btn-danger" name="boton" Value="Cancelar">
                    </form>
                     </div>
                    <rm>

                     <div align="center">
                               </div>
                </div>
            </div>
        </div>    </body>
</html>
