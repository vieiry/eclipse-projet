/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdzee.servlet;

import com.sdzee.beans.Coyote;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PROSPER
 */
@WebServlet(name = "Test", urlPatterns = {"/Test"})
public class Test extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String paramAuteur = request.getParameter("auteur");
        String message = "transmission de variable : ok !" + paramAuteur;
        
        /*creation d'un bean*/
        
        Coyote premierBean = new Coyote();
        /*initialisation de ses peoprietés*/
        premierBean.setNom("Coyote");
        premierBean.setPrenom("wile E.");
        
        /*stockage du message et du bean dans l'objet request*/
        request.setAttribute("coyote", premierBean);
        
        
        request.setAttribute("test",message);
             
        this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
       
    }


}
