package Model;

import java.util.ArrayList;

public class Noeud implements Actions {
    private int id;
    private String titre;
    private String couleur;
    private String description;
    private String forme;
    private double x;
    private double y;
    private ArrayList<Liaison> liaisonFils;
    private Liaison liaisonPere;

    public Noeud(int id, String titre, String description, double x, double y) {
        this.titre = titre;
        this.description = description;
        this.x = x;
        this.y = y;
        this.liaisonPere = null;
        this.liaisonFils = new ArrayList<>();
        this.id = id;
    }
    public Noeud(int id, String titre, String couleur, String description, String forme, double x, double y) {
        this.titre = titre;
        this.couleur = couleur;
        this.description = description;
        this.forme = forme;
        this.x = x;
        this.y = y;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public void addLiaisonFils(Liaison l ){
        this.liaisonFils.add(l);
    }

    public ArrayList<Liaison> getLiaisonFils() {
        return liaisonFils;
    }

    public void setLiaisonFils(ArrayList<Liaison> liaisonFils) {
        this.liaisonFils = liaisonFils;
    }

    public Liaison getLiaisonPere() {
        return liaisonPere;
    }

    public void setLiaisonPere(Liaison liaisonPere) {
        this.liaisonPere = liaisonPere;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean ajouterNoeud() {
        return false;
    }

    @Override
    public boolean supprimer() {
        return false;
    }

}
