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
    private String motDePasse;


    public Camionneur(String utilisateur, String nom, String prenom, String motDePasse) {
        this.utilisateur = utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
