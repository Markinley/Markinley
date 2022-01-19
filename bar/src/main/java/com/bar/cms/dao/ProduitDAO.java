package com.bar.cms.dao;

import com.bar.cms.model.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitDAO extends CrudRepository<Produit, Integer> {

    @Override
    List<Produit> findAll();
}
