package pl.politechnika.bankowosc.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CapitalizationhistoryEntityPK implements Serializable {
    private int idCapitalizationHistory;
    private int idCapitalization;

    @Column(name = "idCapitalizationHistory")
    @Id
    public int getIdCapitalizationHistory() {
        return idCapitalizationHistory;
    }

    public void setIdCapitalizationHistory(int idCapitalizationHistory) {
        this.idCapitalizationHistory = idCapitalizationHistory;
    }

    @Column(name = "idCapitalization")
    @Id
    public int getIdCapitalization() {
        return idCapitalization;
    }

    public void setIdCapitalization(int idCapitalization) {
        this.idCapitalization = idCapitalization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CapitalizationhistoryEntityPK that = (CapitalizationhistoryEntityPK) o;
        return idCapitalizationHistory == that.idCapitalizationHistory &&
                idCapitalization == that.idCapitalization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCapitalizationHistory, idCapitalization);
    }
}
