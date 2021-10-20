package com.capitole.ecommerce.infrastructure.db.springdata.jpa;

import com.capitole.ecommerce.domain.Price;

public class PriceJpaMapper {

    public static Price toDomain(PriceJpa priceEntity) {
        return Price.create(priceEntity.brandId(), priceEntity.startDate(), priceEntity.endDate(), priceEntity.priceList(),
                priceEntity.productId(), priceEntity.priority(), priceEntity.price(), priceEntity.curr());
    }

}
