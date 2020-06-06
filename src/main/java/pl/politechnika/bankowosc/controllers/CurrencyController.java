package pl.politechnika.bankowosc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.politechnika.bankowosc.entities.CurrencyEntity;
import pl.politechnika.bankowosc.repositories.CurrencyRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/currency")
public class CurrencyController {

    @Autowired
    private CurrencyRepository currencyRepository;

    @GetMapping(path = "/one")
    public CurrencyEntity getOne() {
        Optional<CurrencyEntity> entity = currencyRepository.findById(1);
        if (entity.isPresent()) {
            return entity.get();
        } else {
            throw new NullPointerException();
        }
    }

    @GetMapping(path = "/testproc")
    public double testProc(){
        return currencyRepository.FIND_CURRENCY_EXCHANGE_RATE();
    }

    @GetMapping(path = "/update")
    public void update(@RequestParam double rate){
        currencyRepository.CHANGE_CURRENCY_EXCHANGE_RATE(rate);
    }
}
