<! DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <s:include value="head.jsp" />
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
              <button type="submit" class="btn btn-success">Entrar</button>
            </s:form>
        </div>
    </body>
</html>