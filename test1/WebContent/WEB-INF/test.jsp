<%-- 
    Document   : index
    Created on : 11 avr. 2018, 02:09:11
    Author     : PROSPER
--%>
<%-- <%@ taglib uri = "maTagLib.tld" prefix="tagExemple"%> directive taglib --%>

<%@ page import="java.util.Date, java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%><%--directive page--%>

<%--<%@ include file = "uneAutreJSP.jsp" --%>  pour inclure un autre fichier jsp ou html statique dans la page exple les header et les footer de le palupart des pages webs --%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%-- ceci est un commentaire jsp, non visible dans la page html finale. --%>
    <!--  ceci est un simple commentaire html. -->
    
    <%! String chaine = "salut les zeros."; %>  <%--declaration et iniltialisation d'une variable --%>
    
    
    <%! String test = null;
    public boolean jeSuisPasUnZeros(){
    	return true;
    }
    %>
        <h1>ceci est une page genere depuis une jsp
            
        </h1>
        <p>
             <%=System.currentTimeMillis()%> 
            <%
                String attribut = (String) request.getAttribute("test");
                out.println(attribut);
                String parametre = request.getParameter("auteur");
                out.println(parametre);
                %>
        </p>
        <p>
        <jsp:useBean id="coyote" class="com.sdzee.beans.Coyote" scope="request"/>
       <jsp:getProperty name="coyote" property="prenom"/>
       <jsp:setProperty name="coyote" property="prenom" value="prosper"/>
       <jsp:setProperty name="coyote" property="prenom" param="prenomcoyote"/><%--elle recupere le parametre de requette prenomcoyote et le place dans coyote et a le meme effet que coyote.setPrenom(request.getParameter("prenomcoyote") --%>
       <jsp:setProperty name="coyote" property="prenom"/><%-- elle a le meme effet que coyote.setPrenom(request.getParameter("prenom")) --%>
       <jsp:setProperty name="coyote" property="*"/><%-- elle a le meme effet que coyote.setNom(request.getparameter("nom");coyote.setPrenom(request.getParameter("prenom"));coyote.setGenius(boolean.valueof(request.getParameter("genius"))); --%>
        Recuperation du bean
         <jsp:useBean id="coyote0" class="com.sdzee.beans.Coyote">
        <%-- ici,on peut placer ce qu'on veut : definir des proprietes,creer d'autres objets,etc, --%>
        <p>Nouveau bean! </p>
        </jsp:useBean>
        
        <%
        
        
       
        out.println(coyote.getPrenom());
        out.println(coyote.getNom());
        out.println(chaine);
        
        %>
        </p>
        <form action="/tirage" method="post">
        <%
        for(int i = 1; i<3; i++){
        	out.println("Numero"+i+":<select name=\"number"+i+"\">");
        	for(int j =1 ;j<= 10; j++){
        		out.println("<option value=\""+j+"\">"+j+"</option>");
        	}
        	out.println("</select><br/>");
        }
        %>
        <br/>
        <input type="submit" value="valider"/>
        
        </form>
        <%= "bip bip !" %>
        
    </body>
</html>
