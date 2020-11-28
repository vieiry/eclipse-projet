package com.octest.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.octest.beans.BeansException;
import com.octest.beans.Utilisateur;


public class UtilisateurDaoImpl implements UtilisateurDao{
	private DaoFactory daoFactory;
	
	UtilisateurDaoImpl(DaoFactory daoFactory){
		this.daoFactory = daoFactory;
	}
	
	@Override
	public void ajouter(Utilisateur utilisateur) throws DaoException{
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		
		try{
			connexion = daoFactory.getConnection();
			preparedStatement = connexion.prepareStatement("INSERT INTO noms(noms, prenom) VALUES(?, ?);");
			preparedStatement.setString(1, utilisateur.getNom());
			preparedStatement.setString(2, utilisateur.getPrenom());
			
			preparedStatement.executeUpdate();
			connexion.commit();
		}catch (SQLException e){
			try{
				if(connexion != null){
					connexion.rollback();
				}
			}catch(SQLException e2){
				
			}		
			throw new DaoException("impossible de communiquer avec la base de donn�es");
			
		}
		finally{
			try{
				if (connexion != null){
					connexion.close();
				}
			} catch(SQLException e){
				throw new DaoException("Impossible de communiquer avec la base de donn�es");
			}
		}
		
	}
	
	@Override
	public List<Utilisateur> lister() throws DaoException{
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;
		
		try{
			connexion = daoFactory.getConnection();
			statement = connexion.createStatement();
			resultat = statement.executeQuery("SELECT nom,prenom FROM noms;");
			
			while(resultat.next()){
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNom(nom);
				utilisateur.setPrenom(prenom);
				
				utilisateurs.add(utilisateur);
			}
		}catch (SQLException e){
			e.printStackTrace();
			throw new DaoException("Impossible de communiquer avec la base de donn�es");
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
				throw new DaoException("Impossible de communiquer avec la base de donn�es");
			}
		}
		
		return utilisateurs;
		
	}
}