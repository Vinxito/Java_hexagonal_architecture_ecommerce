package com.capitole.ecommerce.domain.value_object;

import com.capitole.ecommerce.infrastructure.shared.DateValueObject;

import java.time.Instant;
import java.util.Date;


public class PriceStartDate extends DateValueObject {

    public PriceStartDate(Date value) {
        super(value);
    }

    public PriceStartDate() {
        super(Date.from(Instant.now()));
    }

    public static PriceStartDate create() {
        return new PriceStartDate();
    }
}
