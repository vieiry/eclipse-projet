package com.octest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//initialise le dao et etablie la connection a la bd,precharge un objet en memoire ou la connection est deja faite
public class DaoFactory {
	private String url;
	private String username;
	private String password;
	
	DaoFactory(String url, String username, String password){
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public static DaoFactory getInstance(){//charge le driver jdbc et connection a la base de donnée
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch (ClassNotFoundException e){
			
		}
		
		DaoFactory instance = new DaoFactory("jdbc:mysql://localhost:3306/javaee","root","");
		return instance;
	}
	
	public Connection getConnection() throws SQLException {//qui permet a tout moment de recuperer la connection a la base de donne
		return DriverManager.getConnection(url, username, password);
	}
	//Récupération du Dao
	public UtilisateurDao getUtilisateurDao(){
		return new UtilisateurDaoImpl(this);
	}
}
