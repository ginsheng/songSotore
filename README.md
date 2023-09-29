Se requiere generar una aplicación JAVA para venta de Canciones llamada “Nombre Tienda”. Tipo
carrito compras que se conecta a una base de datos, en donde se encuentran las canciones que
tiene disponible (sin importar género o artista). El encargado de la tienda podrá agregar nuevas
canciones que lleguen por parte de proveedor y eliminar aquellas canciones que se hayan vendido.
La aplicación tiene que ser amigable para el encargado de la tienda, por lo cual pidió las siguientes

características:
- La Aplicación debe ser ejecutada en cualquier navegador, debe tener un login o acceso
para que solo el encargado pueda entrar.
- La interfaz debe ser en color blanco con verde por los colores de la tienda.
- La interfaz debe tener las siguientes opciones (menú de usuario)
o Alta de canciones
o Nombre de canción y cantidad de canciones disponibles.
o Eliminar canciones

El encargado de la tienda quiere saber en qué se realizará la aplicación y el personal TI y le
recomendó:
- La BD debe ser de preferencia en Oracle, en la cual se debe definir la tabla que almacenará
las canciones y el total o cantidad de canciones correspondiente a esa canción.
- La información deberá ser consumida por medio de un Stored procedure
- Este Stored y/o Package será implementado a través de una clase DAO.
- La clase DAO puede ser consumida en un futuro por varias aplicaciones por lo cual se
requiere generar un servicio SOAP o REST que la consuma.
- El servicio generado deberá ser consumido (cliente) por la aplicación. Dicha aplicación
deberá implementar:
o JSP, Javascripts, Struts, servlets, JQuery (decisión del desarrollador)
o Servidor de despligue para su ejecución.
