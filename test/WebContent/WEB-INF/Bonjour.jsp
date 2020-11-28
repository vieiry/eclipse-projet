
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>text</title>
</head>
<body>
<%--@ include file="Menu.jsp" --%>
<p>
   <%--
   String heure = (String) request.getAttribute("heure");
   if (heure.equals("jour")){
   out.println("Bonjour");
   }
   else{
	   out.println("Bonsoir");
   }
   
   bonjour a vous ! ${ !empty name ? name : '' }
  
   
   Salutation Mr ${auteur.prenom} 
   votre compte est actuellement ${ auteur.actif ? 'actif' : 'non actif'}
</p>
<p>
${ noms[2] }
 
<c:out value="${ variable }"  escapeXml="false" ><strong>bonbon sucré</strong></c:out>
 
 
 <c:set var="pseudo"  scope="page">MAITRECANDIDAT</c:set>
 <c:out value="${pseudo }"/>
  <c:set var="pseudo"  scope="page">MAThis</c:set>
 <c:out value="${pseudo }"/>
 <c:set target="${auteur }" property="prenom" value="Mathieu"/>
 </br> <c:out value="${auteur.prenom }"/>
 <c:remove var="pseudo" scope="page"/>
 
 <c:if test="${50<139 }" var="variable" scope="request">
 it's right
 </c:if>
 <c:out value="${variable}" default="rien"/>
 
 
 <c:choose>
    <c:when test="${variable }">Du texte</c:when>
    <c:when test="${autrevariable }">Du texte</c:when>
    <c:when test="${encorevariable }">Du texte</c:when>
    <c:otherwise>du texte</c:otherwise>
 </c:choose>
 
 
 <c:forEach var="i" begin="0" end ="10" step="2">
 <c:out value="${i}"></c:out>
 <p>un message</p>
 </c:forEach>

 
 <c:forEach items="${titres }" var="titre" varStatus="status">
 <p>N°<c:out value="${status.count }"/> : <c:out value="${titre }">aucun titre </c:out> ! </p>
 </c:forEach> 
 
  
  
  <c:forTokens var="morceau" items="un element/encore un autre element/un dernier pour la route" delims="/ ">
  <p>${morceau }</p>
  </c:forTokens>
 
</p>
 
 
 
 <c:if test="${!empty fichier }"><p><c:out value="le fichier ${fichier }(${description }) a ete uploadé"></c:out></c:if>
  <form method="post" action="bonjour" enctype="multipart/form-data">
  
   <p>
	   <label for="description">Description du fichier</label>
	   <input type="text" name="description" id="description"/>
   </p>
 
    <p>
	   <label for="fichier">fichier a envoyer</label>
	   <input type="file" name="fichier" id="fichier"/>
   </p>
   <input type="submit"/>
  </form>
  
  <c:if test="${!empty sessionScope.prenom && !empty sessionScope.nom}">
  
  <p>Vous etes ${sessionScope.prenom }  ${sessionScope.nom } !</p>
  
  </c:if>--%>
  
     bonjour a vous ! ${ !empty nom ? nom: 'nom est vide' }
  
  <form method="post" action="bonjour">
  <p>
  	<label for="nom">Nom :</label>
  	<input type="text" name="nom" id="nom"/>
  </p>
    <p>
  	<label for="prenom">Prénom :</label>
  	<input type="text" name="prenom" id="prenom"/>
  </p>
  <input type="submit"/>
  </form>
  
  <ul>
  	<c:forEach var="utilisateur" items="${utilisateurs }">
  	<li><c:out value="${utilisateur.prenom }"/> <c:out value="${utilisateur.nom }"/></li>
  	</c:forEach>
  
  </ul>
</body>
</html>