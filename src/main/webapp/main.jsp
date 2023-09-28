<! DOCTYPE html>

<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Song Store</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <s:script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></s:script>
        <s:script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></s:script>
        <s:script type="text/javascript" src="js/modal.js"></s:script>
    <title>Main page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg" style="background-color: #e6ffef;">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Inventario</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="modal" data-target="#myModal" href="#">Nueva canci&oacute;n</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Eliminar canci&oacute;n</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container">

            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog modal-dialog-centered">

                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Registro de nueva canci&oacute;n</h4>
                        </div>
                        <div class="modal-body">
                            <s:form action="song">
                                <div class="mb-3">
                                    <label for="inputSongTitle" class="form-label">T&iacute;tulo</label>
                                    <input type="text" name="songTitle" class="form-control" id="inputSongTitle">
                                </div>
                                <div class="mb-3">
                                    <label for="inputAmount" class="form-label">Cantidad</label>
                                    <input type="number" min="1" name="songAmount" class="form-control" id="inputAmount">
                                </div>
                                <button type="submit" class="btn btn-primary">Guardar</button>
                            </s:form>
                        </div>
                    </div>

                </div>
            </div>

        </div>
        <div class="container text-center mt-5 p-5 form-fdx">
            <span>Algo para mostrar</span>
        </div>
    </body>
</html>