package com.bar.cms.dao;

import com.bar.cms.model.Benefice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeneficeDAO extends CrudRepository<Benefice, Integer> {

    @Override
    List<Benefice> findAll();
}
