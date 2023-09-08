package com.example.exo6_tpjee.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private static int count = 0;
    private final int id;

    private String marque;

    private String modele;

    private int puissance;

    public Car(){
        this.id = 0;
    }

    public Car(String marque, String modele, int puissance){
        this.id = ++count;
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
