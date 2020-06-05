package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "investmenthistory", schema = "invest", catalog = "")
public class InvestmenthistoryEntity {
    private int idInvestmentNumber;
    private Date openDate;
    private Date endDate;
    private double endAmount;
    private String idAccountNumber;
    private int idInvestmentType;

    @Id
    @Column(name = "idInvestmentNumber")
    public int getIdInvestmentNumber() {
        return idInvestmentNumber;
    }

    public void setIdInvestmentNumber(int idInvestmentNumber) {
        this.idInvestmentNumber = idInvestmentNumber;
    }

    @Basic
    @Column(name = "OpenDate")
    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    @Basic
    @Column(name = "EndDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "EndAmount")
    public double getEndAmount() {
        return endAmount;
    }

    public void setEndAmount(double endAmount) {
        this.endAmount = endAmount;
    }

    @Basic
    @Column(name = "idAccountNumber")
    public String getIdAccountNumber() {
        return idAccountNumber;
    }

    public void setIdAccountNumber(String idAccountNumber) {
        this.idAccountNumber = idAccountNumber;
    }

    @Basic
    @Column(name = "idInvestmentType")
    public int getIdInvestmentType() {
        return idInvestmentType;
    }

    public void setIdInvestmentType(int idInvestmentType) {
        this.idInvestmentType = idInvestmentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvestmenthistoryEntity that = (InvestmenthistoryEntity) o;
        return idInvestmentNumber == that.idInvestmentNumber &&
                Double.compare(that.endAmount, endAmount) == 0 &&
                idInvestmentType == that.idInvestmentType &&
                Objects.equals(openDate, that.openDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(idAccountNumber, that.idAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInvestmentNumber, openDate, endDate, endAmount, idAccountNumber, idInvestmentType);
    }
}
