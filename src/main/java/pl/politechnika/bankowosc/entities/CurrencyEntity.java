package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "currency")
public class CurrencyEntity {

    @Id
    @Column(name = "idcurrency")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCurrency;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "exchangerate")
    private double exchangeRate;


    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyEntity that = (CurrencyEntity) o;
        return idCurrency == that.idCurrency &&
                Double.compare(that.exchangeRate, exchangeRate) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurrency, name, exchangeRate);
    }
}
