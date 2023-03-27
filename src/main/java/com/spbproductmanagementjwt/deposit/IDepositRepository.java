package com.spbproductmanagementjwt.deposit;

import com.spbproductmanagementjwt.deposit.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface IDepositRepository extends JpaRepository<Deposit, Long> {

    @Query(value = "CALL sp_deposit(:customer_id, :money)", nativeQuery = true)
    String deposit(@Param("customer_id") Long id, @Param("money") BigDecimal money);
}
