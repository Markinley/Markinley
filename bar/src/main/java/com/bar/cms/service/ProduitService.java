package com.bar.cms.service;

import com.bar.cms.dao.ProduitDAO;
import com.bar.cms.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProduitService {

    @Autowired
        private ProduitDAO produitDAO;

         //Add produit
        public Produit addProduit(Produit produit){
            return produitDAO.save(produit);
        }
        //List Produit
        public List<Produit> getProduitList(){
            return produitDAO.findAll();
        }
        //Search Produit
        public Produit getProduit(int produitId){
            return produitDAO.findById(produitId).get();

        }
        //Update Produit
        public Produit updateProduit(int produitId, Produit produit){
            produit.setProduitId(produitId);
            return produitDAO.save(produit);
        }
         //Delete Produit
        public void deleteProduit(int produitId){
            produitDAO.deleteById(produitId);
        }
}
