package com.bar.cms.api;

import com.bar.cms.model.Fournisseur;
import com.bar.cms.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/fournisseur")
public class FournisseurRessource {

    @Autowired
    private FournisseurService fournisseurService;

    @PostMapping
    public Fournisseur addFournisseur(@RequestBody Fournisseur fournisseur){
        return fournisseurService.addFournisseur(fournisseur);
    }

    @GetMapping
    public List<Fournisseur> fournisseurList(){
        return fournisseurService.listFournisseur();
    }

    @GetMapping(value = ("/{fournisseurId}"))
    public Fournisseur fournisseurSearch (@PathVariable("fournisseurId") int fournisseurId){
        return fournisseurService.searchFournisseur(fournisseurId);
    }
    @PutMapping( value = "/{fournisseurId}")
    public Fournisseur fournisseurUpdate(@PathVariable("fournisseurId")int fournisseurId, @RequestBody Fournisseur fournisseur){
        return fournisseurService.updateFournisseur(fournisseurId,fournisseur);
    }
    @DeleteMapping(value = ("/{fournisseurId}"))
    public void deleteFournisseur(@PathVariable("fournisseurId") int fournisseurId){
        fournisseurService.deleteFournisseur(fournisseurId);
    }
}
