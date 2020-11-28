<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceuil</title>
</head>
<body>
<p> vous ete sur acceuil.jsp </p>
 <c:if test="${!empty sessionScope.prenom && !empty sessionScope.nom}">
  
  <p>Vous etes ${sessionScope.prenom }  ${sessionScope.nom } !</p>
  
  </c:if>
<%@ include file="Menu.jsp" %>
<p>Bienvenu sur mon site </p>
</body>
</html>