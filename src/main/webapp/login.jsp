<! DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
    <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Song Store (login)</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
        <div class="container text-center mt-5 p-5 form-fdx">
            <h3>Bienvenido, por favor inicie sesión</h3>
            <s:form action="login">
              <div class="mb-3">
                <label for="inputUserName" class="form-label">Usuario</label>
                <input type="text" name="userName" class="form-control" id="inputUserName">
              </div>
              <div class="mb-3">
                <label for="inputPassword" class="form-label">Contraseña</label>
                <input type="password" name="pwd" class="form-control" id="inputPassword">
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
            </s:form>
        </div>
    </body>
</html>