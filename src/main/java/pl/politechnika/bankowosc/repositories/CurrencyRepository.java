package pl.politechnika.bankowosc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import pl.politechnika.bankowosc.entities.CurrencyEntity;

public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer> {
    @Procedure
    Double FIND_CURRENCY_EXCHANGE_RATE();
    @Procedure
    void CHANGE_CURRENCY_EXCHANGE_RATE(double rate);
}
