package com.capitole.ecommerce.domain.value_object;

import com.capitole.ecommerce.infrastructure.shared.DoubleValueObject;

public class PricePrice extends DoubleValueObject {

    public PricePrice(Double value) {
        super(value);
    }

    public PricePrice() {
        super(0.0);
    }
}
