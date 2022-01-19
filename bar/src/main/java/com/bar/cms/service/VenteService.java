package com.bar.cms.service;

import com.bar.cms.dao.VenteDAO;
import com.bar.cms.model.Vente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class VenteService {


    @Autowired
    private VenteDAO venteDAO;

    public Vente addVente(Vente vente){
        return venteDAO.save(vente);
    }

    public List<Vente> venteList(){
        return venteDAO.findAll();
    }

    public Vente searchVente(int venteId){
        return venteDAO.findById(venteId).get();
    }

    public Vente updateVente(int venteId,Vente vente){
        vente.setVenteId(venteId);
        return venteDAO.save(vente);
    }

    public void deleteVente(int venteId){
        venteDAO.deleteById(venteId) ;
    }
}
