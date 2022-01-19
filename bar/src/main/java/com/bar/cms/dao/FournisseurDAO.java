package com.bar.cms.dao;

import com.bar.cms.model.Fournisseur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FournisseurDAO extends CrudRepository<Fournisseur,Integer> {
    @Override
    List<Fournisseur> findAll();
}
