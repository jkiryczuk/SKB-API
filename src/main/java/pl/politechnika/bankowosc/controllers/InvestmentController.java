package pl.politechnika.bankowosc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.politechnika.bankowosc.dao.InvestmentAllInfoDao;
import pl.politechnika.bankowosc.entities.InvestmentEntity;
import pl.politechnika.bankowosc.entities.MultiEntity;
import pl.politechnika.bankowosc.repositories.InvestmentRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/investment")
public class InvestmentController {

    @Autowired
    private InvestmentRepository repository;

    @GetMapping(path = "/all")
    public InvestmentAllInfoDao index(@RequestParam String accountNumber) {
        List<MultiEntity> listOfIntvest = getAllInfo(accountNumber);
        Double amount = repository.getAmountInfo(accountNumber);
        String identification = repository.getUserAbout(accountNumber);
        return new InvestmentAllInfoDao(listOfIntvest, amount, accountNumber, identification);
    }

    @GetMapping(path = "/earlyend")
    public void earlyend(@RequestParam int id) {
        repository.EarlyEnd(id);
    }

    @GetMapping(path = "/user")
    public String getUser(@RequestParam String accountNumber) {
        return repository.getUserAbout(accountNumber);
    }

    @GetMapping(path = "/byaccount")
    public List<MultiEntity> getAllInfo(@RequestParam String accountNumber) {
        List<MultiEntity> list = new ArrayList<>();
        List<InvestmentEntity> investments = repository.findAllByIdAccountNumber(accountNumber);
        for (InvestmentEntity investment : investments) {
            String name = repository.getName(investment.getIdInvestmentType());
            String type = repository.getType(investment.getCapitalizationIdCapitalization());
            MultiEntity entity = new MultiEntity(investment.getIdInvestmentNumber(),
                    investment.getOpenDate(),
                    investment.getEndDate(),
                    investment.getCurrentAmount(),
                    investment.getIdAccountNumber(),
                    investment.getIdInvestmentType(),
                    investment.getCapitalizationIdCapitalization(),
                    investment.getCapitalizationDoneRate(),
                    name, type);
            list.add(entity);
        }
        return list;
    }

}
