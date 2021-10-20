package com.capitole.ecommerce.infrastructure.db.springdata.jpa;

import com.capitole.ecommerce.domain.Price;
import com.capitole.ecommerce.domain.PriceRepository;
import com.capitole.ecommerce.infrastructure.db.springdata.config.Utils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PriceJpaRepository implements PriceRepository {

    private final IPriceJpaRepository priceRepository;

    public PriceJpaRepository(IPriceJpaRepository priceRepository) {
        this.priceRepository = priceRepository;

        priceRepository.save(PriceJpa.create(
                1, Utils.stringToDate("2020-06-14-00.00.00"),
                Utils.stringToDate("2020-12-31-23.59.59"),
                1, 35455, 0, 35.50, "EUR"));

        priceRepository.save(PriceJpa.create(
                1, Utils.stringToDate("2020-06-14-15.00.00"),
                Utils.stringToDate("2020-06-14-18.30.00"),
                2, 35455, 1, 25.45, "EUR"));

        priceRepository.save(PriceJpa.create(
                1, Utils.stringToDate("2020-06-15-00.00.00"),
                Utils.stringToDate("2020-06-15-11.00.00"),
                3, 35455, 1, 30.50, "EUR"));

        priceRepository.save(PriceJpa.create(
                1, Utils.stringToDate("2020-06-15-16.00.00"),
                Utils.stringToDate("2020-12-31-23.59.59"),
                4, 35455, 1, 38.95, "EUR"));
    }

    @Override
    public Price byDatesAndBrandIdAndProductId(Date date, Integer productId, Integer brandId) {
        return PriceJpaMapper.toDomain(priceRepository.byDatesAndBrandIdAndProductId(date, productId, brandId)
                .orElseThrow(ProductNotExists::new));
    }
}
