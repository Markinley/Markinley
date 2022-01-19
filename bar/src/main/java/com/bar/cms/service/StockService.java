package com.bar.cms.service;

import com.bar.cms.dao.StockDAO;
import com.bar.cms.model.Produit;
import com.bar.cms.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockService {

    @Autowired
    private StockDAO stockDAO;

    // Add Stock
    public Stock addStock(Stock stock){
        return stockDAO.save(stock);
    }

    //List Stock
    public List<Stock> stockList(){
        return stockDAO.findAll();
    }

    // Search Stock
    public Stock searchStock(int produitId){
       return stockDAO.findById(produitId).get();
    }

    //Update Stock
    public Stock updateStock(int produitId, Stock stock){
        stock.setProduitId(produitId);
        return stockDAO.save(stock);
    }

    //delete Stock
    public void deleteStock(int produitId){
        stockDAO.deleteById(produitId);
    }
}
