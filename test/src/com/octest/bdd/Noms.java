package com.octest.bdd;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.octest.beans.BeansException;
import com.octest.beans.Utilisateur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Noms {
     
	private Connection connexion;
	public List<Utilisateur> recupererUtilisateurs(){
		
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		//chargement du driver et etablissement de la connexion
		LoadDatabase();
		
		Statement statement = null;
		ResultSet resultat = null;
		
		try{
			
			statement = (Statement) connexion.createStatement();
			
			//Exécution de la requette
			resultat = statement.executeQuery("SELECT nom,prenom FROM noms;");
			
			//recuperation des données
			while(resultat.next()){
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNom(nom);
				utilisateur.setPrenom(prenom);
				
				utilisateurs.add(utilisateur);
			}
		}catch (SQLException e){
			e.getMessage();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//fermeture de la connexion
			try{
				if (resultat != null)
					resultat.close();
				if(statement != null)
					statement.close();
				if(connexion != null)
					connexion.close();
			}catch (SQLException ignore){
				
			}
		}
		
		return utilisateurs;
		
		}
	private void LoadDatabase(){
		//chargement du driver a faire qu'une seule fois dans le chargement de l'application , pas besoin de le faire plusieur fois
				try{
					Class.forName("com.mysql.jdbc.Driver");
				}catch(ClassNotFoundException e){	
				}
				
				try{
					connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee","root","");
				}catch (SQLException e){
					e.printStackTrace();
				}
  }
	
	public void ajouterUtilisateur(Utilisateur utilisateur){
		LoadDatabase();
		try {
			PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO noms(nom,prenom) VALUES(?,?);");
		    preparedStatement.setString(1,utilisateur.getNom());
		    preparedStatement.setString(2,utilisateur.getPrenom());
		
		    preparedStatement.executeUpdate();//execution de la modification de la base de donnée
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}

