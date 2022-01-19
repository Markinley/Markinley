package com.bar.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table
public class Vente {


    @Id
    @SequenceGenerator(
            name = "vente_sequence",
            sequenceName = "vente_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "vente_sequence"
    )
    @JsonProperty("Id")
    private int venteId;
    @JsonProperty("produitId")
    private int produitId;
    @JsonProperty("clientId")
    private int clientId;
    @JsonProperty("quantite")
    private int venteQuantite;
    @JsonProperty("prix unit")
    private int ventePriceUnit;
    @JsonProperty("prix total")
    private  int ventePriceTotal;
    @JsonProperty("remarque")
    private String venteRemarque;

    public int getVenteId() {
        return venteId;
    }

    public void setVenteId(int venteId) {
        this.venteId = venteId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getVenteQuantite() {
        return venteQuantite;
    }

    public void setVenteQuantite(int venteQuantite) {
        this.venteQuantite = venteQuantite;
    }

    public int getVentePriceUnit() {
        return ventePriceUnit;
    }

    public void setVentePriceUnit(int ventePriceUnit) {
        this.ventePriceUnit = ventePriceUnit;
    }

    public int getVentePriceTotal() {
        return ventePriceTotal;
    }

    public void setVentePriceTotal(int ventePriceTotal) {
        this.ventePriceTotal = ventePriceTotal;
    }

    public String getVenteRemarque() {
        return venteRemarque;
    }

    public void setVenteRemarque(String venteRemarque) {
        this.venteRemarque = venteRemarque;
    }
}
