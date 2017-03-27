package com.rrq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Yassine on 2017-03-17.
 */
@Document(collection = "Camionneurs")
public class Camionneur {
    @Id
    private String utilisateur;
    private String nom;
    private String prenom;
    private String password;

    public Camionneur(String nom, String prenom, String utilisateur, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.utilisateur = utilisateur;
        this.password = password;
    }

    public Camionneur() {
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
