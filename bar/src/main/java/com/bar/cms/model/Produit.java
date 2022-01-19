package com.bar.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table
public class Produit {

    @Id
    @SequenceGenerator(
            name = "produit_sequence",
            sequenceName = "produit_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "produit_sequence"
    )
    @JsonProperty("id")
    private int produitId;
    private String produitName;
    private String produitType;
    private int produitQuantite;
    private int produitPrice;
    private String produitFournisseur;
    private LocalDate produitDate;

    public Produit() {
    }

    public Produit(int produitId, String produitName, String produitType, int produitQuantite, int produitPrice, String produitFournisseur, LocalDate produitDate) {
        this.produitId = produitId;
        this.produitName = produitName;
        this.produitType = produitType;
        this.produitQuantite = produitQuantite;
        this.produitPrice = produitPrice;
        this.produitFournisseur = produitFournisseur;
        this.produitDate = produitDate;
    }

    public Produit(String produitName, String produitType, int produitQuantite, int produitPrice, String produitFournisseur, LocalDate produitDate) {
        this.produitName = produitName;
        this.produitType=produitType;
        this.produitQuantite= produitQuantite;
        this.produitPrice =produitPrice;
        this.produitFournisseur= produitFournisseur;
        this.produitDate= produitDate;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public String getProduitName() {
        return produitName;
    }

    public void setProduitName(String produitName) {
        this.produitName = produitName;
    }

    public String getProduitType() {
        return produitType;
    }

    public void setProduitType(String produitType) {
        this.produitType = produitType;
    }

    public int getProduitQuantite() {
        return produitQuantite;
    }

    public void setProduitQuantite(int produitQuantite) {
        this.produitQuantite = produitQuantite;
    }

    public int getProduitPrice() {
        return produitPrice;
    }

    public void setProduitPrice(int produitPrice) {
        this.produitPrice = produitPrice;
    }

    public String getProduitFournisseur() {
        return produitFournisseur;
    }

    public void setProduitFournisseur(String produitFournisseur) {
        this.produitFournisseur = produitFournisseur;
    }

    public LocalDate getProduitDate() {
        return produitDate;
    }

    public void setProduitDate(String produitDate) {
        this.produitDate = LocalDate.parse(produitDate);
    }
}
