package pl.politechnika.bankowosc.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "account_to_user", schema = "invest", catalog = "")
@IdClass(AccountToUserEntityPK.class)
public class AccountToUserEntity {
    private String idAccountNumber;
    private int idUser;

    @Id
    @Column(name = "idAccountNumber")
    public String getIdAccountNumber() {
        return idAccountNumber;
    }

    public void setIdAccountNumber(String idAccountNumber) {
        this.idAccountNumber = idAccountNumber;
    }

    @Id
    @Column(name = "idUser")
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
        AccountToUserEntity that = (AccountToUserEntity) o;
        return idUser == that.idUser &&
                Objects.equals(idAccountNumber, that.idAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccountNumber, idUser);
    }
}
