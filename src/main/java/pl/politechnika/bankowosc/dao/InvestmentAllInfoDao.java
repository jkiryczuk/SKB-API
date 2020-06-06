package pl.politechnika.bankowosc.dao;

import pl.politechnika.bankowosc.entities.MultiEntity;

import java.util.List;

public class InvestmentAllInfoDao {

    private String identification;
    private List<MultiEntity> investments;
    private Double amount;
    private String accountNumber;

    public List<MultiEntity> getInvestments() {
        return investments;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setInvestments(List<MultiEntity> investments) {
        this.investments = investments;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public InvestmentAllInfoDao(List<MultiEntity> investments, Double amount, String accountNumber, String identification) {
        this.investments = investments;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.identification = identification;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
