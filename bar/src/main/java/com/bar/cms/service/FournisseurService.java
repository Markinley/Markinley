package com.bar.cms.service;


import com.bar.cms.dao.FournisseurDAO;
import com.bar.cms.model.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FournisseurService {

    @Autowired
    private FournisseurDAO fournisseurDAO;

    //Add Fournisseur
    public Fournisseur addFournisseur(Fournisseur fournisseur){
        return fournisseurDAO.save(fournisseur);
    }

    // List Fournisseur
    public List<Fournisseur> listFournisseur(){
        return fournisseurDAO.findAll();
    }
   //Search Fournisseur
    public Fournisseur searchFournisseur(int fournisseurId){
        return fournisseurDAO.findById(fournisseurId).get();
    }
    // Update Fournisseur
    public Fournisseur updateFournisseur(int fournisseurId, Fournisseur fournisseur){
       fournisseur.setFournisseurId(fournisseurId);
       return fournisseurDAO.save(fournisseur);

    }
    //delete Fournisseur
    public void deleteFournisseur(int fournisseurId){
        fournisseurDAO.deleteById(fournisseurId);
    }
}
