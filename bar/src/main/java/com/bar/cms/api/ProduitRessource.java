package com.bar.cms.api;

import com.bar.cms.model.Produit;
import com.bar.cms.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProduitRessource {

    @Autowired
    private ProduitService produitService;

    @RequestMapping("/")
    public String redirectToIndex() {
        return "/index";
    }

    @RequestMapping(value = "/produit/index", method = RequestMethod.GET)
    public String indexProduit() {
        return "/produit/index";
    }





       //  Save Produit
    @RequestMapping(value = "produit/addProduit", method = RequestMethod.GET)
    public String saveProduit() {
        return "/produit/addProduit";
    }
    @PostMapping("/produit/addProduit")
    public String addProduit(@RequestParam String produitName,
                              String produitType,
                              int produitQuantite,
                              int produitPrice,
                              String produitFournisseur,
                              @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate produitDate) {
            Produit produit= new Produit(produitName,produitType,produitQuantite,produitPrice,produitFournisseur,produitDate.atStartOfDay().toLocalDate());
            produitService.addProduit(produit);
            return "/produit/addProduit";
        }


        // Liste Produit
    /*@RequestMapping(value = "produit/produitList")
    public String listProduit() {
        return "produit/produitList";
    }*/

    @GetMapping("/produit/produitList")
    public String main(Model model) {

        model.addAttribute("list", produitService.getProduitList());

        return "produit/produitList";
    }

    }
  /*  @PostMapping
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.addProduit(produit);
    }
    @GetMapping
    public List<Produit> produitList(){
        return produitService.getProduitList();
    }
    @GetMapping(value ="/{produitId}")
    public Produit produitSearch(@PathVariable("produitId") int produitId){
        return produitService.getProduit(produitId);
    }
    @PutMapping(value = "/{produitId}")
    public Produit updateProduit(@PathVariable("produitId") int produitId, @RequestBody Produit produit){
        return produitService.updateProduit(produitId,produit);
    }
    @DeleteMapping(value = "/{produitId}")
    public void deleteProduit(@PathVariable("produitId") int produitId){
        produitService.deleteProduit(produitId);
    }*/

