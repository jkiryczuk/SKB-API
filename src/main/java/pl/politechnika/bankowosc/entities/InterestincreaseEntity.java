package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "interestincrease", schema = "invest", catalog = "")
public class InterestincreaseEntity {
    private int idInterestIncrease;
    private String name;
    private Double dynamicInterest;
    private double rate;

    @Id
    @Column(name = "idInterestIncrease")
    public int getIdInterestIncrease() {
        return idInterestIncrease;
    }

    public void setIdInterestIncrease(int idInterestIncrease) {
        this.idInterestIncrease = idInterestIncrease;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DynamicInterest")
    public Double getDynamicInterest() {
        return dynamicInterest;
    }

    public void setDynamicInterest(Double dynamicInterest) {
        this.dynamicInterest = dynamicInterest;
    }

    @Basic
    @Column(name = "Rate")
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterestincreaseEntity that = (InterestincreaseEntity) o;
        return idInterestIncrease == that.idInterestIncrease &&
                Double.compare(that.rate, rate) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(dynamicInterest, that.dynamicInterest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInterestIncrease, name, dynamicInterest, rate);
    }
}
