package com.bar.cms.dao;

import com.bar.cms.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockDAO extends CrudRepository <Stock, Integer> {
    @Override
    List<Stock> findAll();
}
