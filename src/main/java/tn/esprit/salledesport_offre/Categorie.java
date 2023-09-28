/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.esprit.salledesport_offre;

/**
 *
 * @author Lenovo
 */
public class Categorie {
    private int idCategorie ;
    private String nomCategorie;
    private String DescriptionCategorie;

    public Categorie(int idCategorie, String nomCategorie, String DescriptionCategorie) {
        this.idCategorie = idCategorie;
        this.nomCategorie = nomCategorie;
        this.DescriptionCategorie = DescriptionCategorie;
    }
    

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescriptionCategorie() {
        return DescriptionCategorie;
    }

    public void setDescriptionCategorie(String DescriptionCategorie) {
        this.DescriptionCategorie = DescriptionCategorie;
    }

    @Override
    public String toString() {
        return "Categorie{" + "idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", DescriptionCategorie=" + DescriptionCategorie + '}';
    }
    
}
