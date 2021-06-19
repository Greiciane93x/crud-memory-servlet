<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.training.estoque.Equipamentos"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Equipamentos</title>
</head>
<body>

	<b>Lista de Equipamentos</b>
	<ul>
		<c:forEach items="${equipamentos}" var="equipamentos">
			<li>${equipamentos.nomeEquip}</li>
		</c:forEach>
	</ul>
	
</body>
</html>