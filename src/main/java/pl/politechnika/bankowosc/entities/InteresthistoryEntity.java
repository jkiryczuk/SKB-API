package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "interesthistory", schema = "invest", catalog = "")
@IdClass(InteresthistoryEntityPK.class)
public class InteresthistoryEntity {
    private int idInterestHistory;
    private double interest;
    private Timestamp endDate;
    private int idInvestmentType;

    @Id
    @Column(name = "idInterestHistory")
    public int getIdInterestHistory() {
        return idInterestHistory;
    }

    public void setIdInterestHistory(int idInterestHistory) {
        this.idInterestHistory = idInterestHistory;
    }

    @Basic
    @Column(name = "Interest")
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Basic
    @Column(name = "EndDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Id
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
        InteresthistoryEntity that = (InteresthistoryEntity) o;
        return idInterestHistory == that.idInterestHistory &&
                Double.compare(that.interest, interest) == 0 &&
                idInvestmentType == that.idInvestmentType &&
                Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInterestHistory, interest, endDate, idInvestmentType);
    }
}
