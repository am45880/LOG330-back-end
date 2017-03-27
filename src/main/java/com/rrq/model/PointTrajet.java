package com.rrq.model;

/**
 * Created by Yassine on 2017-03-27.
 */
public class PointTrajet {

    private  String article;
    private String codePostal;
    private String tempsEstime;
    private int ordre;

    public PointTrajet(String article, String codePostal, String tempsEstime, int ordre) {
        this.article = article;
        this.codePostal = codePostal;
        this.tempsEstime = tempsEstime;
        this.ordre = ordre;
    }

    public PointTrajet() {
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getTempsEstime() {
        return tempsEstime;
    }

    public void setTempsEstime(String tempsEstime) {
        this.tempsEstime = tempsEstime;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }
}
