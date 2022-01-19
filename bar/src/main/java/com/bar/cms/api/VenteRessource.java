package com.bar.cms.api;

import com.bar.cms.model.Vente;
import com.bar.cms.service.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = ("/vente"))
public class VenteRessource {

    @Autowired
    private VenteService venteService;

    @PostMapping
    public Vente addVente(@RequestBody Vente vente){
        return venteService.addVente(vente);
    }
    @GetMapping
    public List<Vente> venteList(){
        return venteService.venteList();
    }
    @GetMapping(value = ("/{venteId}"))
    public Vente searchVente(@PathVariable("venteId") int venteId){
        return venteService.searchVente(venteId);
    }
    @PutMapping(value = ("/{venteId}"))
    public Vente updateVente(@PathVariable("venteId") int venteId,@RequestBody Vente vente){
        return venteService.updateVente(venteId,vente);
    }

    @DeleteMapping(value = ("/{venteId}"))
    public void deleteVente(@PathVariable("venteId") int venteId){
        venteService.deleteVente(venteId);

    }
}
