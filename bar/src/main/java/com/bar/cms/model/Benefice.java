package com.bar.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table
public class Benefice {

    @Id
    @SequenceGenerator(
            name = "benefice_sequence",
            sequenceName = "benefice_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "benefice_sequence"
    )
    @JsonProperty("id")
    private int beneficeId;
    @JsonProperty("produitId")
    private int produitId;
    @JsonProperty("taux")
    private int beneficeTaux;
    @JsonProperty("name")
    private String productName;

    public int getBeneficeId() {
        return beneficeId;
    }

    public void setBeneficeId(int beneficeId) {
        this.beneficeId = beneficeId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getBeneficeTaux() {
        return beneficeTaux;
    }

    public void setBeneficeTaux(int beneficeTaux) {
        this.beneficeTaux = beneficeTaux;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
