package com.bar.cms.api;

import com.bar.cms.model.Stock;
import com.bar.cms.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = ("/stock"))
public class StockRessource {

    @Autowired
    private StockService stockService;
    // Add produit to Stock
    @PostMapping
    public Stock addToStock(@RequestBody Stock stock){
        return stockService.addStock(stock);
    }

    //List product in Stock
    @GetMapping
    public List<Stock> stockList (){
        return stockService.stockList();
    }
    //Search Produit in Stock
    @GetMapping(value = ("/{produitId}"))
    public Stock searchInStock(@PathVariable("produitId") int produitId){
        return stockService.searchStock(produitId);

    }
    //Update produit in Stock
    @PutMapping(value = ("/{produitId}"))
    public Stock updateStock(@PathVariable("produitId") int produitId, @RequestBody Stock stock){
        return stockService.updateStock(produitId,stock);
    }
    @DeleteMapping(value = ("/{produitId}"))
    public void deleteInStock(@PathVariable("produitId") int produitId){
        stockService.deleteStock(produitId);
    }



}
