package com.rrq.model;

/**
 * Created by Yassine on 2017-03-17.
 */
//test
public class Camionneur {
    private String nom;
    private String prenom;
    private String utilisateur;
    private String password;

    public Camionneur(String nom, String prenom, String utilisateur, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.utilisateur = utilisateur;
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
