package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "invest", catalog = "")
public class UserEntity {
    private int idUser;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private Integer numberStreet;
    private Integer apartmentNumber;

    @Id
    @Column(name = " idUser")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "NumberStreet")
    public Integer getNumberStreet() {
        return numberStreet;
    }

    public void setNumberStreet(Integer numberStreet) {
        this.numberStreet = numberStreet;
    }

    @Basic
    @Column(name = "ApartmentNumber")
    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return idUser == that.idUser &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(city, that.city) &&
                Objects.equals(street, that.street) &&
                Objects.equals(numberStreet, that.numberStreet) &&
                Objects.equals(apartmentNumber, that.apartmentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, firstName, lastName, city, street, numberStreet, apartmentNumber);
    }
}
