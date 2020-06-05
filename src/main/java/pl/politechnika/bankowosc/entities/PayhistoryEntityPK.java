package pl.politechnika.bankowosc.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PayhistoryEntityPK implements Serializable {
    private int idPayHistory;
    private int idInvestment;

    @Column(name = "idPayHistory")
    @Id
    public int getIdPayHistory() {
        return idPayHistory;
    }

    public void setIdPayHistory(int idPayHistory) {
        this.idPayHistory = idPayHistory;
    }

    @Column(name = "idInvestment")
    @Id
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
        PayhistoryEntityPK that = (PayhistoryEntityPK) o;
        return idPayHistory == that.idPayHistory &&
                idInvestment == that.idInvestment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPayHistory, idInvestment);
    }
}
