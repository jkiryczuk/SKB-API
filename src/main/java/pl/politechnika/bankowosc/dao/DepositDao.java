package pl.politechnika.bankowosc.dao;

public class DepositDao {

    private double amount;
    private int idinvestment;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getIdinvestment() {
        return idinvestment;
    }

    public void setIdinvestment(int idinvestment) {
        this.idinvestment = idinvestment;
    }
}
