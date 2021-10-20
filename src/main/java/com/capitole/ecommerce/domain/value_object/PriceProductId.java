package com.capitole.ecommerce.domain.value_object;

import com.capitole.ecommerce.infrastructure.shared.IntValueObject;

public class PriceProductId extends IntValueObject {

    public PriceProductId(Integer value) {
        super(value);
    }

    public PriceProductId() {
        super(0);
    }
}
