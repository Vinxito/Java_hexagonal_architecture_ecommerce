package com.capitole.ecommerce.domain.value_object;

import com.capitole.ecommerce.infrastructure.shared.IntValueObject;

public class PriceBrandId extends IntValueObject {

    public PriceBrandId(Integer value) {
        super(value);
    }

    public PriceBrandId() {
        super(0);
    }
}