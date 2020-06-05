package pl.politechnika.bankowosc.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class InvestmentEntityPK implements Serializable {
    private int idInvestmentNumber;
    private String idAccountNumber;
    private int idInvestmentType;
    private int capitalizationIdCapitalization;

    @Column(name = "idInvestmentNumber")
    @Id
    public int getIdInvestmentNumber() {
        return idInvestmentNumber;
    }

    public void setIdInvestmentNumber(int idInvestmentNumber) {
        this.idInvestmentNumber = idInvestmentNumber;
    }

    @Column(name = "idAccountNumber")
    @Id
    public String getIdAccountNumber() {
        return idAccountNumber;
    }

    public void setIdAccountNumber(String idAccountNumber) {
        this.idAccountNumber = idAccountNumber;
    }

    @Column(name = "idInvestmentType")
    @Id
    public int getIdInvestmentType() {
        return idInvestmentType;
    }

    public void setIdInvestmentType(int idInvestmentType) {
        this.idInvestmentType = idInvestmentType;
    }

    @Column(name = "Capitalization_idCapitalization")
    @Id
    public int getCapitalizationIdCapitalization() {
        return capitalizationIdCapitalization;
    }

    public void setCapitalizationIdCapitalization(int capitalizationIdCapitalization) {
        this.capitalizationIdCapitalization = capitalizationIdCapitalization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvestmentEntityPK that = (InvestmentEntityPK) o;
        return idInvestmentNumber == that.idInvestmentNumber &&
                idInvestmentType == that.idInvestmentType &&
                capitalizationIdCapitalization == that.capitalizationIdCapitalization &&
                Objects.equals(idAccountNumber, that.idAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInvestmentNumber, idAccountNumber, idInvestmentType, capitalizationIdCapitalization);
    }
}
