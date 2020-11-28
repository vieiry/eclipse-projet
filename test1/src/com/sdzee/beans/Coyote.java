/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdzee.beans;

/**
 *
 * @author PROSPER
 */
public class Coyote {
    private String nom;
    private String prenom;
    private boolean genius;

public String getNom(){
return this.nom;
}
public String getPrenom(){
return this.prenom;
}
public boolean isGenius(){
return this.genius;
}

public void setNom(String nom){
this.nom = nom;
}
public void setPrenom(String prenom){
this.prenom = prenom;
}

public void setGenius(boolean genius){
this.genius = true;
}
}

