package com.example.exo6_tpjee.model;

public class CarDTO {

    private int id;

    private String marque;

    private String modele;

    private int puissance;

    public CarDTO(){
        this.id = 0;
        this.marque = "";
        this.modele = "";
        this.puissance = 0;
    }

    public CarDTO(int id, String marque, String modele, int puissance){
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.puissance = puissance;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", puissance=" + puissance +
                '}';
    }
}
