package com.bar.cms.api;

import com.bar.cms.model.Benefice;
import com.bar.cms.service.BeneficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = ("/benefice"))
public class BeneficeRessource {


    @Autowired
    private BeneficeService beneficeService;


    @PostMapping
    public Benefice addBenefice(@RequestBody Benefice benefice){
        return beneficeService.addBenefice(benefice);
    }
    @GetMapping
    public List<Benefice> beneficeList(){
        return beneficeService.beneficeList();
    }
    @GetMapping(value = ("/{beneficeId}"))
    public Benefice searchBenefice(@PathVariable("beneficeId") int beneficeId){
        return beneficeService.searchBenefice(beneficeId);
    }
    @PutMapping(value = ("/{beneficeId}"))
    public Benefice updateBenefice(@PathVariable("beneficeId") int beneficeId, @RequestBody Benefice benefice){
        return beneficeService.updateBenefice(beneficeId,benefice);
    }
    @DeleteMapping(value = ("/{beneficeId}"))
    public void deleteBenefice(@PathVariable("beneficeId")int beneficeId){
        beneficeService.deleteBenefice(beneficeId);
    }
}
