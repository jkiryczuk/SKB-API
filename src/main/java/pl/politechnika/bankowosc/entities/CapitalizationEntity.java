package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "capitalization", schema = "invest", catalog = "")
public class CapitalizationEntity {
    private int idCapitalization;
    private String type;
    private int capitalizationRate;

    @Id
    @Column(name = "idCapitalization")
    public int getIdCapitalization() {
        return idCapitalization;
    }

    public void setIdCapitalization(int idCapitalization) {
        this.idCapitalization = idCapitalization;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "CapitalizationRate")
    public int getCapitalizationRate() {
        return capitalizationRate;
    }

    public void setCapitalizationRate(int capitalizationRate) {
        this.capitalizationRate = capitalizationRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CapitalizationEntity that = (CapitalizationEntity) o;
        return idCapitalization == that.idCapitalization &&
                capitalizationRate == that.capitalizationRate &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCapitalization, type, capitalizationRate);
    }
}
