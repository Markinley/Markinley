package com.bar.cms.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table
public class Stock {
    @Id
    @SequenceGenerator(
            name = "stock_sequence",
            sequenceName = "stock_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "stock_sequence"
    )
    private int produitId;
    @JsonProperty("quantite")
    private int produitQuantiteStock;
    @JsonProperty("alert")
    private int produitAlert;

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getProduitQuantiteStock() {
        return produitQuantiteStock;
    }

    public void setProduitQuantiteStock(int produitQuantiteStock) {
        this.produitQuantiteStock = produitQuantiteStock;
    }

    public int getProduitAlert() {
        return produitAlert;
    }

    public void setProduitAlert(int produitAlert) {
        this.produitAlert = produitAlert;
    }
}
