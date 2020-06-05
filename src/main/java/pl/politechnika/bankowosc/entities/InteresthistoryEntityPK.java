package pl.politechnika.bankowosc.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class InteresthistoryEntityPK implements Serializable {
    private int idInterestHistory;
    private int idInvestmentType;

    @Column(name = "idInterestHistory")
    @Id
    public int getIdInterestHistory() {
        return idInterestHistory;
    }

    public void setIdInterestHistory(int idInterestHistory) {
        this.idInterestHistory = idInterestHistory;
    }

    @Column(name = "idInvestmentType")
    @Id
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
        InteresthistoryEntityPK that = (InteresthistoryEntityPK) o;
        return idInterestHistory == that.idInterestHistory &&
                idInvestmentType == that.idInvestmentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInterestHistory, idInvestmentType);
    }
}
