package com.rrq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Yassine on 2017-03-27.
 */
@Document(collection = "Camions")
public class Camion {

    @Id
    private String nom;
    private String marque;
    private String plaque;
    private List<PointTrajet> trajet;

    public Camion(String nom, String marque, String plaque, List<PointTrajet> trajet) {
        this.nom = nom;
        this.marque = marque;
        this.plaque = plaque;
        this.trajet = trajet;
    }

    public Camion() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public List<PointTrajet> getTrajet() {
        return trajet;
    }

    public void setTrajet(List<PointTrajet> trajet) {
        this.trajet = trajet;
    }
}
