<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<link href="css/web1.css" type="text/css" rel="stylesheet">
<title>Ventana del Usuario</title>
</head>
<body>
<h2 align="center">Ingresar al Sistema</h2>
<form action="ServletUsuario" method="post">
<table align="center" border="3">

       <tr>
       <td>Usuario</td>
       <td><input type="text" name="usuario"></td>
       </tr>
       
       <tr>
       <td>Contraseña</td>
       <td><input type="password" name="password"></td>
       </tr>
    
 
   		<tr>
        <td colspan="2" align="center">
        <input class="booton" type="submit" value="Ingresar">
        </td>
        </tr>
        
</table>
</body>

<style>
	body {
		background-color: #B2EBF2; 
	}
	h1, td {
		font-family: verdana;
		size: 8 px;
   }
</style>
</html>