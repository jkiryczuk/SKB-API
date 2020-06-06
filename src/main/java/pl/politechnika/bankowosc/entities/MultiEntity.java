package pl.politechnika.bankowosc.entities;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Timestamp;

//@Table
public class MultiEntity {

//    @Column
    private int idInvestmentNumber;
//    @Column
    private Timestamp openDate;
//    @Column
    private Timestamp endDate;
//    @Column
    private double currentAmount;
//    @Column
    private String idAccountNumber;
//    @Column
    private int idInvestmentType;
//    @Column
    private int capitalization_IdCapitalization;
//    @Column
    private Integer capitalizationDoneRate;
//    @Column
    private String Name;
//    @Column
    private String Type;
//    @Column
//    private Integer CapitalizationRate;


    public MultiEntity(int idInvestmentNumber, Timestamp openDate, Timestamp endDate, double currentAmount, String idAccountNumber, int idInvestmentType, int capitalization_IdCapitalization, Integer capitalizationDoneRate, String name, String type) {
        this.idInvestmentNumber = idInvestmentNumber;
        this.openDate = openDate;
        this.endDate = endDate;
        this.currentAmount = currentAmount;
        this.idAccountNumber = idAccountNumber;
        this.idInvestmentType = idInvestmentType;
        this.capitalization_IdCapitalization = capitalization_IdCapitalization;
        this.capitalizationDoneRate = capitalizationDoneRate;
        this.Name = name;
        this.Type = type;
    }

    public int getIdInvestmentNumber() {
        return idInvestmentNumber;
    }

    public void setIdInvestmentNumber(int idInvestmentNumber) {
        this.idInvestmentNumber = idInvestmentNumber;
    }

    public Timestamp getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Timestamp openDate) {
        this.openDate = openDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getIdAccountNumber() {
        return idAccountNumber;
    }

    public void setIdAccountNumber(String idAccountNumber) {
        this.idAccountNumber = idAccountNumber;
    }

    public int getIdInvestmentType() {
        return idInvestmentType;
    }

    public void setIdInvestmentType(int idInvestmentType) {
        this.idInvestmentType = idInvestmentType;
    }

    public int getCapitalization_IdCapitalization() {
        return capitalization_IdCapitalization;
    }

    public void setCapitalization_IdCapitalization(int capitalization_IdCapitalization) {
        this.capitalization_IdCapitalization = capitalization_IdCapitalization;
    }

    public Integer getCapitalizationDoneRate() {
        return capitalizationDoneRate;
    }

    public void setCapitalizationDoneRate(Integer capitalizationDoneRate) {
        this.capitalizationDoneRate = capitalizationDoneRate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
//
//    public Integer getCapitalizationRate() {
//        return CapitalizationRate;
//    }
//
//    public void setCapitalizationRate(Integer capitalizationRate) {
//        CapitalizationRate = capitalizationRate;
//    }
}
