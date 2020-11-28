package com.octest.servlet.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.octest.bdd.Noms;
import com.octest.beans.Auteur;
import com.octest.beans.BeansException;
import com.octest.beans.Utilisateur;
import com.octest.dao.DaoException;
import com.octest.dao.DaoFactory;
import com.octest.dao.UtilisateurDao;
import com.octest.dao.UtilisateurDaoImpl;
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurDao utilisateurDao;
    
	/* public static final  int TAILLE_TAMPON = 10240;
	public static final String CHEMIN_FICHIERS = "/Users/PROSPER/jee_file_upload/";//definition des constantes pour l'upload*/
	
   
    public void init() throws ServletException{
    	DaoFactory daoFactory = DaoFactory.getInstance();
    	this.utilisateurDao = daoFactory.getUtilisateurDao();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    /*String message = "au revoir cher visiteur"; 
	    request.setAttribute("variable",message);
	    request.setAttribute("heure","soir ");
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		String[] noms = {"prosper"," mathieu", "stephane"};
		request.setAttribute("noms", noms);
		
		Auteur auteur = new Auteur();
		auteur.setPrenom("prosper");
		auteur.setNom("imelda");
		auteur.setActif(true);
		
		String[] titres = {"nouvel incendie","une ile a ete decouverte","chute du dollard"};
		
		request.setAttribute("auteur", auteur);
		request.setAttribute("titres",titres);
		HttpSession session = request.getSession();//initialisation du moteur de session de jee
		String nom = (String) session.getAttribute("nom");
		String prenom = (String) session.getAttribute("prenom");
		
		session.invalidate();//pour suprimmer la session et les données du coté serveur*/
		
		/*
		//recuperation des infos stockées dans des cookies
		
		Cookie[] cookies = request.getCookies();
        
		if(cookies != null){
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("nom")){
					request.setAttribute("nom", cookie.getValue());
				}
			}
		}*/
		
		/*Noms tableNoms = new Noms();
		request.setAttribute("utilisateurs",tableNoms.recupererUtilisateurs());*/
		try{
			request.setAttribute("utilisateurs", utilisateurDao.lister());
		}
		catch (DaoException e){
			request.setAttribute("erreur", e.getMessage());
		}
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Bonjour.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* // on recupère le champ description comme d'habitude
		String description = request.getParameter("description");
		request.setAttribute("description", description);
		
		//On récupere le champ du fichier
		Part part = request.getPart("fichier");
		
		//On vérifie qu'on a bien ressu le fichier
		String nomFichier = getNomFichier(part);
		
		//si on a bien un fichier
		if(nomFichier != null && !nomFichier.isEmpty()){
			String nomChamp = part.getName();
			//Corrige un bug de fonctionnement d'internet explorer
			nomFichier = nomFichier.substring(nomFichier.lastIndexOf('/')+1)
					.substring(nomFichier.lastIndexOf("\\")+1);
			
			//on ecrit définitivement le fichier sur le disque
			ecrireFichier(part,nomFichier,CHEMIN_FICHIERS);
			
			request.setAttribute(nomChamp, nomFichier); //elements et verifications permettant l'upload de fichier*/
			
		/* String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		/*HttpSession session = request.getSession();//initialisation du moteur de session de jee et enregistrement des donne en session
		session.setAttribute("nom", nom);
		session.setAttribute("prenom", prenom);
		
		Cookie cookie = new Cookie("nom",nom);
		cookie.setMaxAge(60*60*24*30);	//pour definir une durree de vie en seconde pour le cookie ICI 1 mois
		response.addCookie(cookie); */
		//response.addCookie(new Cookie("prenom",prenom));//ajout simple d'un cookie
		
		
		/*Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(request.getParameter("nom"));
		utilisateur.setPrenom(request.getParameter("prenom"));
		
		Noms tableNoms = new Noms();
		tableNoms.ajouterUtilisateur(utilisateur);
		
		request.setAttribute("utilisateurs",tableNoms.recupererUtilisateurs());*/
		
		Utilisateur utilisateur = new Utilisateur();
		try {
			utilisateur.setNom(request.getParameter("nom"));
			utilisateur.setPrenom(request.getParameter("prenom"));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			utilisateurDao.ajouter(utilisateur);
			request.setAttribute("utilisateurs", utilisateurDao.lister());
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			this.getServletContext().getRequestDispatcher("/WEB-INF/Bonjour.jsp").forward(request, response);
		}
	}
		
		/* private static String getNomFichier( Part part){
			for(String contentDisposition : part.getHeader("content-disposition").split(";")){
			
				if(contentDisposition.trim().startsWith("filename")){
					return contentDisposition.substring( contentDisposition.indexOf('=')+1).trim().replace("\"","");
				
			  }
			}
			return null;
		}
		
		private void ecrireFichier( Part part, String nomFichier, String chemin) throws IOException{
			BufferedInputStream entree = null;
			BufferedOutputStream sortie = null;
			
			try{
				entree = new BufferedInputStream(part.getInputStream(),TAILLE_TAMPON);
				sortie = new BufferedOutputStream(new FileOutputStream(new File(chemin + nomFichier)), TAILLE_TAMPON);
				
				byte[] tampon = new byte[TAILLE_TAMPON];
				int longueur;
				while((longueur = entree.read(tampon))> 0){
					
					sortie.write(tampon,0,longueur);
				}
			}finally{
				try{
					sortie.close();
				}catch(IOException ignore){}
				try{
					entree.close();
				}catch(IOException ignore){}
			}
			}
			}//methodes permettant l'upload de fichier*/
		
    
		
		
