package com.bar.cms.dao;

import com.bar.cms.model.Vente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VenteDAO extends CrudRepository<Vente,Integer> {

    @Override
    List<Vente> findAll();
}
