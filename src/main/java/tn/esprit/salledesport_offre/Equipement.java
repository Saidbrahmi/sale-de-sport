/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.esprit.salledesport_offre;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Equipement {
    private int idEauipement;
    private String nomEquipement;
    private String descriptionEquipement;
    private int quantiteEquipement;
    private Date dateachatEauipement;
    private  float PrixAchat;  

    public Equipement(int idEauipement, String nomEquipement, String descriptionEquipement, int quantiteEquipement, Date dateachatEauipement, float PrixAchat) {
        this.idEauipement = idEauipement;
        this.nomEquipement = nomEquipement;
        this.descriptionEquipement = descriptionEquipement;
        this.quantiteEquipement = quantiteEquipement;
        this.dateachatEauipement = dateachatEauipement;
        this.PrixAchat = PrixAchat;
    }
    

    public int getIdEauipement() {
        return idEauipement;
    }

    public void setIdEauipement(int idEauipement) {
        this.idEauipement = idEauipement;
    }

    public String getNomEquipement() {
        return nomEquipement;
    }

    public void setNomEquipement(String nomEquipement) {
        this.nomEquipement = nomEquipement;
    }

    public String getDescriptionEquipement() {
        return descriptionEquipement;
    }

    public void setDescriptionEquipement(String descriptionEquipement) {
        this.descriptionEquipement = descriptionEquipement;
    }

    public int getQuantiteEquipement() {
        return quantiteEquipement;
    }

    public void setQuantiteEquipement(int quantiteEquipement) {
        this.quantiteEquipement = quantiteEquipement;
    }

    public Date getDateachatEauipement() {
        return dateachatEauipement;
    }

    public void setDateachatEauipement(Date dateachatEauipement) {
        this.dateachatEauipement = dateachatEauipement;
    }

    public float getPrixAchat() {
        return PrixAchat;
    }

    public void setPrixAchat(float PrixAchat) {
        this.PrixAchat = PrixAchat;
    }

    @Override
    public String toString() {
        return "Equipement{" + "idEauipement=" + idEauipement + ", nomEquipement=" + nomEquipement + ", descriptionEquipement=" + descriptionEquipement + ", quantiteEquipement=" + quantiteEquipement + ", dateachatEauipement=" + dateachatEauipement + ", PrixAchat=" + PrixAchat + '}';
    }
    
}
