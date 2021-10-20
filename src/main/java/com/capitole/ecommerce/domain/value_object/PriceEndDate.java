package com.capitole.ecommerce.domain.value_object;

import com.capitole.ecommerce.infrastructure.shared.DateValueObject;

import java.time.Instant;
import java.util.Date;

public class PriceEndDate extends DateValueObject {

    public PriceEndDate(Date value) {
        super(value);
    }

    public PriceEndDate() {
        super(Date.from(Instant.now()));
    }

    public static PriceEndDate create() {
        return new PriceEndDate();
    }
}
