package pl.politechnika.bankowosc.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class InvestmenttypeEntityPK implements Serializable {
    private int idInvestmentType;
    private int idCurrency;

    @Column(name = "idInvestmentType")
    @Id
    public int getIdInvestmentType() {
        return idInvestmentType;
    }

    public void setIdInvestmentType(int idInvestmentType) {
        this.idInvestmentType = idInvestmentType;
    }

    @Column(name = "idCurrency")
    @Id
    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvestmenttypeEntityPK that = (InvestmenttypeEntityPK) o;
        return idInvestmentType == that.idInvestmentType &&
                idCurrency == that.idCurrency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInvestmentType, idCurrency);
    }
}
