package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "capitalizationhistory", schema = "invest", catalog = "")
@IdClass(CapitalizationhistoryEntityPK.class)
public class CapitalizationhistoryEntity {
    private int idCapitalizationHistory;
    private Timestamp date;
    private double value;
    private double interest;
    private int idCapitalization;
    private Integer idInvestment;
    private Integer idInvestmentHistory;

    @Id
    @Column(name = "idCapitalizationHistory")
    public int getIdCapitalizationHistory() {
        return idCapitalizationHistory;
    }

    public void setIdCapitalizationHistory(int idCapitalizationHistory) {
        this.idCapitalizationHistory = idCapitalizationHistory;
    }

    @Basic
    @Column(name = "Date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Value")
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Basic
    @Column(name = "Interest")
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Id
    @Column(name = "idCapitalization")
    public int getIdCapitalization() {
        return idCapitalization;
    }

    public void setIdCapitalization(int idCapitalization) {
        this.idCapitalization = idCapitalization;
    }

    @Basic
    @Column(name = "idInvestment")
    public Integer getIdInvestment() {
        return idInvestment;
    }

    public void setIdInvestment(Integer idInvestment) {
        this.idInvestment = idInvestment;
    }

    @Basic
    @Column(name = "idInvestmentHistory")
    public Integer getIdInvestmentHistory() {
        return idInvestmentHistory;
    }

    public void setIdInvestmentHistory(Integer idInvestmentHistory) {
        this.idInvestmentHistory = idInvestmentHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CapitalizationhistoryEntity that = (CapitalizationhistoryEntity) o;
        return idCapitalizationHistory == that.idCapitalizationHistory &&
                Double.compare(that.value, value) == 0 &&
                Double.compare(that.interest, interest) == 0 &&
                idCapitalization == that.idCapitalization &&
                Objects.equals(date, that.date) &&
                Objects.equals(idInvestment, that.idInvestment) &&
                Objects.equals(idInvestmentHistory, that.idInvestmentHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCapitalizationHistory, date, value, interest, idCapitalization, idInvestment, idInvestmentHistory);
    }
}
