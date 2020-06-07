package pl.politechnika.bankowosc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import pl.politechnika.bankowosc.entities.InvestmentEntity;

import java.util.List;

public interface InvestmentRepository extends JpaRepository<InvestmentEntity, Integer> {

    List<InvestmentEntity> findAllByIdAccountNumber(String accountNumber);

    @Query(value = "select Name from investmenttype where idInvestmentType= ?1", nativeQuery = true)
    String getName(int id);

    @Query(value = "select Type from capitalization where idCapitalization= ?1", nativeQuery = true)
    String getType(int id);

    @Query(value = "select Amount from account where AccountNumber = ?1", nativeQuery = true)
    Double getAmountInfo(String accountNumber);

    @Query(value = "select concat(FirstName, ' ', LastName) from User \n" +
            "join account_to_user on account_to_user.idUser = user.` idUser`\n" +
            "join account a on account_to_user.idAccountNumber = a.AccountNumber\n" +
            "where a.AccountNumber =?1", nativeQuery = true)
    String getUserAbout(String accountnumber);

    @Query(value = "select name from investmenttype order by idInvestmentType",nativeQuery = true)
    List<String> getTypes();

    @Query(value = "select type from capitalization order by idCapitalization",nativeQuery = true)
    List<String> getCapitalizations();

    @Procedure
    void depositMoney(double _amount, int _idinvestment);

    @Procedure
    void UpdateAmount(int id_pay_history);

    @Procedure
    void EarlyEnd(int id_inv);

    @Procedure
    void MoneyBack(int id_investment);

    @Procedure
    void MakePaid(int id_payhistory);

    @Procedure
    double TrueInterest(int id_inv);

    @Procedure
    void DoCapitalization(int id_inv, double get_interest);

    @Procedure
    void TryCapitalization(int ind_inv);
}
