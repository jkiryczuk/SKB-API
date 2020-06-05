package pl.politechnika.bankowosc.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AccountToUserEntityPK implements Serializable {
    private String idAccountNumber;
    private int idUser;

    @Column(name = "idAccountNumber")
    @Id
    public String getIdAccountNumber() {
        return idAccountNumber;
    }

    public void setIdAccountNumber(String idAccountNumber) {
        this.idAccountNumber = idAccountNumber;
    }

    @Column(name = "idUser")
    @Id
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountToUserEntityPK that = (AccountToUserEntityPK) o;
        return idUser == that.idUser &&
                Objects.equals(idAccountNumber, that.idAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccountNumber, idUser);
    }
}
