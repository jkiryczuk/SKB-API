package pl.politechnika.bankowosc.dao;

public class CreateDao {

    private String accountnumber;
    private int idcapitalization;
    private int idinvestmenttype;
    private double amount;
    private int dday;

    public CreateDao() {
    }

    public CreateDao(String accountnumber, int idcapitalization, int idinvestmenttype, double amount, int dday) {
        this.accountnumber = accountnumber;
        this.idcapitalization = idcapitalization;
        this.idinvestmenttype = idinvestmenttype;
        this.amount = amount;
        this.dday = dday;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getIdcapitalization() {
        return idcapitalization;
    }

    public void setIdcapitalization(int idcapitalization) {
        this.idcapitalization = idcapitalization;
    }

    public int getIdinvestmenttype() {
        return idinvestmenttype;
    }

    public void setIdinvestmenttype(int idinvestmenttype) {
        this.idinvestmenttype = idinvestmenttype;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDday() {
        return dday;
    }

    public void setDday(int dday) {
        this.dday = dday;
    }

    @Override
    public String toString() {
        return "CreateDao{" +
                "accountnumber='" + accountnumber + '\'' +
                ", idcapitalization=" + idcapitalization +
                ", idinvestmenttype=" + idinvestmenttype +
                ", amount=" + amount +
                ", dday=" + dday +
                '}';
    }
}
