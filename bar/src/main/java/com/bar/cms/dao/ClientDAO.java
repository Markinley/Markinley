package com.bar.cms.dao;

import com.bar.cms.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface ClientDAO extends CrudRepository<Client,Integer> {

    @Override
    List<Client> findAll();
}
