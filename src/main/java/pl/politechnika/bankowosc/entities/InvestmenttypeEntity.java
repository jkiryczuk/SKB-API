package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "investmenttype", schema = "invest", catalog = "")
@IdClass(InvestmenttypeEntityPK.class)
public class InvestmenttypeEntity {
    private int idInvestmentType;
    private String name;
    private double minDepositAmount;
    private Date relaseDate;
    private Date removalDate;
    private boolean availability;
    private double actualInterest;
    private String interestType;
    private int idCurrency;
    private Integer idInterestIncrease;

    @Id
    @Column(name = "idinvestmenttype")
    public int getIdInvestmentType() {
        return idInvestmentType;
    }

    public void setIdInvestmentType(int idInvestmentType) {
        this.idInvestmentType = idInvestmentType;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "mindepositamount")
    public double getMinDepositAmount() {
        return minDepositAmount;
    }

    public void setMinDepositAmount(double minDepositAmount) {
        this.minDepositAmount = minDepositAmount;
    }

    @Basic
    @Column(name = "relasedate")
    public Date getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(Date relaseDate) {
        this.relaseDate = relaseDate;
    }

    @Basic
    @Column(name = "removaldate")
    public Date getRemovalDate() {
        return removalDate;
    }

    public void setRemovalDate(Date removalDate) {
        this.removalDate = removalDate;
    }

    @Basic
    @Column(name = "availability")
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Basic
    @Column(name = "actualinterest")
    public double getActualInterest() {
        return actualInterest;
    }

    public void setActualInterest(double actualInterest) {
        this.actualInterest = actualInterest;
    }

    @Basic
    @Column(name = "interesttype")
    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    @Id
    @Column(name = "idcurrency")
    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

    @Basic
    @Column(name = "idinterestincrease")
    public Integer getIdInterestIncrease() {
        return idInterestIncrease;
    }

    public void setIdInterestIncrease(Integer idInterestIncrease) {
        this.idInterestIncrease = idInterestIncrease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvestmenttypeEntity that = (InvestmenttypeEntity) o;
        return idInvestmentType == that.idInvestmentType &&
                Double.compare(that.minDepositAmount, minDepositAmount) == 0 &&
                availability == that.availability &&
                Double.compare(that.actualInterest, actualInterest) == 0 &&
                idCurrency == that.idCurrency &&
                Objects.equals(name, that.name) &&
                Objects.equals(relaseDate, that.relaseDate) &&
                Objects.equals(removalDate, that.removalDate) &&
                Objects.equals(interestType, that.interestType) &&
                Objects.equals(idInterestIncrease, that.idInterestIncrease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInvestmentType, name, minDepositAmount, relaseDate, removalDate, availability, actualInterest, interestType, idCurrency, idInterestIncrease);
    }
}
