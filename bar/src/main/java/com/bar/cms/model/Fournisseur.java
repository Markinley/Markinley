package com.bar.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table
public class Fournisseur {

    @Id
    @SequenceGenerator(
            name = "fournisseur_sequence",
            sequenceName = "fournisseur_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "fournisseur_sequence"
    )
    @JsonProperty("id")
    private int fournisseurId;
    @JsonProperty("name")
    private String fournisseurName;
    @JsonProperty("adress")
    private String fournisseurAdress;
    @JsonProperty("phone")
    private String fournisseurPhone;
    @JsonProperty("email")
    private String fournisseurEmail;
    @JsonProperty("remarque")
    private String fournisseurRemarque;

    public int getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(int fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public String getFournisseurName() {
        return fournisseurName;
    }

    public void setFournisseurName(String fournisseurName) {
        this.fournisseurName = fournisseurName;
    }

    public String getFournisseurAdress() {
        return fournisseurAdress;
    }

    public void setFournisseurAdress(String fournisseurAdress) {
        this.fournisseurAdress = fournisseurAdress;
    }

    public String getFournisseurPhone() {
        return fournisseurPhone;
    }

    public void setFournisseurPhone(String fournisseurPhone) {
        this.fournisseurPhone = fournisseurPhone;
    }

    public String getFournisseurEmail() {
        return fournisseurEmail;
    }

    public void setFournisseurEmail(String fournisseurEmail) {
        this.fournisseurEmail = fournisseurEmail;
    }

    public String getFournisseurRemarque() {
        return fournisseurRemarque;
    }

    public void setFournisseurRemarque(String fournisseurRemarque) {
        this.fournisseurRemarque = fournisseurRemarque;
    }
}
