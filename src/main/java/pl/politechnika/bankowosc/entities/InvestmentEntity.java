package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "investment")
@IdClass(InvestmentEntityPK.class)
public class InvestmentEntity {
    private int idInvestmentNumber;
    private Timestamp openDate;
    private Timestamp endDate;
    private double currentAmount;
    private String idAccountNumber;
    private int idInvestmentType;
    private int capitalizationIdCapitalization;
    private Integer capitalizationDoneRate;

    @Id
    @Column(name = "idinvestmentnumber")
    public int getIdInvestmentNumber() {
        return idInvestmentNumber;
    }

    public void setIdInvestmentNumber(int idInvestmentNumber) {
        this.idInvestmentNumber = idInvestmentNumber;
    }

    @Basic
    @Column(name = "opendate")
    public Timestamp getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Timestamp openDate) {
        this.openDate = openDate;
    }

    @Basic
    @Column(name = "enddate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "currentamount")
    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Id
    @Column(name = "idaccountnumber")
    public String getIdAccountNumber() {
        return idAccountNumber;
    }

    public void setIdAccountNumber(String idAccountNumber) {
        this.idAccountNumber = idAccountNumber;
    }

    @Id
    @Column(name = "idinvestmenttype")
    public int getIdInvestmentType() {
        return idInvestmentType;
    }

    public void setIdInvestmentType(int idInvestmentType) {
        this.idInvestmentType = idInvestmentType;
    }

    @Id
    @Column(name = "capitalization_idcapitalization")
    public int getCapitalizationIdCapitalization() {
        return capitalizationIdCapitalization;
    }

    public void setCapitalizationIdCapitalization(int capitalizationIdCapitalization) {
        this.capitalizationIdCapitalization = capitalizationIdCapitalization;
    }

    @Basic
    @Column(name = "capitalizationdonerate")
    public Integer getCapitalizationDoneRate() {
        return capitalizationDoneRate;
    }

    public void setCapitalizationDoneRate(Integer capitalizationDoneRate) {
        this.capitalizationDoneRate = capitalizationDoneRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvestmentEntity that = (InvestmentEntity) o;
        return idInvestmentNumber == that.idInvestmentNumber &&
                Double.compare(that.currentAmount, currentAmount) == 0 &&
                idInvestmentType == that.idInvestmentType &&
                capitalizationIdCapitalization == that.capitalizationIdCapitalization &&
                Objects.equals(openDate, that.openDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(idAccountNumber, that.idAccountNumber) &&
                Objects.equals(capitalizationDoneRate, that.capitalizationDoneRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInvestmentNumber, openDate, endDate, currentAmount, idAccountNumber, idInvestmentType, capitalizationIdCapitalization, capitalizationDoneRate);
    }
}
