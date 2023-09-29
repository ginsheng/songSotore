<! DOCTYPE html>

<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <s:include value="head.jsp" />
        <title>Song Inventory</title>
    </head>
    <body>
        <s:include value="menu.jsp" />

        <table class="table table-striped">
            <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">T&iacute;tulo</th>
                  <th scope="col">Cantidad</th>
                  <th scope="col">Acciones</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="songList">
                    <tr>
                        <th scope="row"><s:property value="id" /></th>
                        <td><s:property value="songTitle" /></td>
                        <td><s:property value="songAmount" /></td>
                        <td><s:a href="deleteSong.action?id=%{id}">Eliminar</s:a></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>

    </body>
</html>