package com.capitole.ecommerce.infrastructure.db.springdata.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface IPriceJpaRepository extends JpaRepository<PriceJpa, Integer> {

    @Query("from PriceJpa p where (:date between p.startDate and p.endDate) and (p.productId = :productId and p.brandId = :brandId)")
    Optional<PriceJpa> byDatesAndBrandIdAndProductId(
            @Param("date") Date date,
            @Param("productId") Integer productId,
            @Param("brandId") Integer brandId);
}
