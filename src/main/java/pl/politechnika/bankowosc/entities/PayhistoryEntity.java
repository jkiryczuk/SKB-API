package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "payhistory", schema = "invest", catalog = "")
@IdClass(PayhistoryEntityPK.class)
public class PayhistoryEntity {
    private int idPayHistory;
    private double amount;
    private Date date;
    private Double amountBefore;
    private Double amountAfter;
    private int idInvestment;

    @Id
    @Column(name = "idPayHistory")
    public int getIdPayHistory() {
        return idPayHistory;
    }

    public void setIdPayHistory(int idPayHistory) {
        this.idPayHistory = idPayHistory;
    }

    @Basic
    @Column(name = "Amount")
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "AmountBefore")
    public Double getAmountBefore() {
        return amountBefore;
    }

    public void setAmountBefore(Double amountBefore) {
        this.amountBefore = amountBefore;
    }

    @Basic
    @Column(name = "AmountAfter")
    public Double getAmountAfter() {
        return amountAfter;
    }

    public void setAmountAfter(Double amountAfter) {
        this.amountAfter = amountAfter;
    }

    @Id
    @Column(name = "idInvestment")
    public int getIdInvestment() {
        return idInvestment;
    }

    public void setIdInvestment(int idInvestment) {
        this.idInvestment = idInvestment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayhistoryEntity that = (PayhistoryEntity) o;
        return idPayHistory == that.idPayHistory &&
                Double.compare(that.amount, amount) == 0 &&
                idInvestment == that.idInvestment &&
                Objects.equals(date, that.date) &&
                Objects.equals(amountBefore, that.amountBefore) &&
                Objects.equals(amountAfter, that.amountAfter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPayHistory, amount, date, amountBefore, amountAfter, idInvestment);
    }
}
