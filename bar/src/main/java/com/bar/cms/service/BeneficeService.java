package com.bar.cms.service;

import com.bar.cms.dao.BeneficeDAO;
import com.bar.cms.model.Benefice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BeneficeService {

    @Autowired
    private BeneficeDAO beneficeDAO;

    public Benefice addBenefice(Benefice benefice){
        return beneficeDAO.save(benefice);
    }

    public List<Benefice> beneficeList(){
        return beneficeDAO.findAll();
    }

    public Benefice searchBenefice(int beneficeId){
        return beneficeDAO.findById(beneficeId).get();
    }

    public Benefice updateBenefice(int beneficeId, Benefice benefice){
        benefice.setBeneficeId(beneficeId);
        return beneficeDAO.save(benefice);
    }

    public void deleteBenefice(int beneficeId){
        beneficeDAO.deleteById(beneficeId);
    }
}
