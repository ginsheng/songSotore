<! DOCTYPE html>

<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <s:include value="head.jsp" />
        <title>New Song</title>
    </head>
    <body>

        <s:include value="menu.jsp" />
        <s:form action="song" class="form-inline">
            <div class="form-group mb-2">
                    <label for="inputSongTitle" class="form-label">T&iacute;tulo</label>
                    <input type="text" name="songTitle" class="form-control" id="inputSongTitle">
                </div>
                <div class="form-group mx-sm-4 mb-3">
                    <label for="inputAmount" class="form-label">Cantidad</label>
                    <input type="number" min="1" name="songAmount" class="form-control" id="inputAmount">
                </div>
                <button type="submit" class="btn btn-primary mb-2">Guardar</button>
            </s:form>

    </body>
</html>